package es.unileon.aplicacionesweb.springapp.logic.domain;

import java.util.Date;

import es.unileon.aplicacionesweb.springapp.logic.account.DetailedInformation;
import es.unileon.aplicacionesweb.springapp.logic.handler.Handler;
import es.unileon.aplicacionesweb.springapp.logic.handler.TransactionHandlerProvider;
/**
 *
 * @author roobre
 */
public abstract class Transaction {

//	Original code
//    private final Handler id;
//    private final double amount;
//    private final Date date;
//    private Date effectiveDate;
//    private final String subject;
//    private DetailedInformation extraInformation;
    
    private Handler id;
    private double amount;
 	private Date date;
    private Date effectiveDate;
    private String subject;
    private DetailedInformation extraInformation;

    /**
	*
	* @param amount
	* @param date
	* @param subject
	*/
    public Transaction(double amount, Date date, String subject) {
        this(amount, date, subject, new DetailedInformation(""));
    }
    
    public Transaction(){
    	
    }

    /**
	*
	* @param amount
	* @param date
	* @param subject
	* @param info
	*/
    public Transaction(double amount, Date date, String subject, DetailedInformation info) {
        this.id = TransactionHandlerProvider.getTransactionHandler();
        StringBuilder err = new StringBuilder();
        if (subject == null) {
            err.append("The subject cannot be null \n");
        } else {
            if (subject.length() == 0) {
                err.append("Transaction length cannot be 0 \n");
            }
        }

        if (id == null) {
            err.append(("The id cannot be null \n"));
        } else {
            if (id.toString().length() == 0) {
                err.append(("The id size cannot be 0 \n"));
            }
        }

        if (date == null) {
            err.append("The date cannot be null \n");
        }
        this.amount = amount;
        this.date = date;
        this.subject = subject;
        this.extraInformation = info;
        this.extraInformation.doFinal();
    }

    /**
	* @return the id
	*/
    public Handler getId() {
        return id;
    }

    /**
	* @return the amount
	*/
    public double getAmount() {
        return amount;
    }

    /**
	* @return the date
	*/
    public Date getDate() {
        return date;
    }

    /**
	* @return the effectiveDate
	*/
    public Date getEffectiveDate() {
        return effectiveDate;
    }

    /**
	* @return the subject
	*/
    public String getSubject() {
        return subject;
    }

    /**
	*
	* @param effectiveDate
	*/
    public void setEffectiveDate(Date effectiveDate) {
        this.effectiveDate = effectiveDate;
    }

    public DetailedInformation getExtraInformation() {
 		return extraInformation;
 	}

 	public void setExtraInformation(DetailedInformation extraInformation) {
 		this.extraInformation = extraInformation;
 	}

 	public void setId(Handler id) {
 		this.id = id;
 	}

 	public void setAmount(double amount) {
 		this.amount = amount;
 	}

 	public void setDate(Date date) {
 		this.date = date;
 	}

 	public void setSubject(String subject) {
 		this.subject = subject;
 	}
 	
    /**
	*
	* @return
	*/
    @Override
    public String toString() {
        return "Transaction " + "id=" + id + ", amount=" + amount + ", date=" + date + ", effectiveDate=" + effectiveDate + ", subject=" + subject;
    }
}
