package es.unileon.aplicacionesweb.springapp.logic.domain;

import java.util.Date;

import es.unileon.aplicacionesweb.springapp.logic.account.DetailedInformation;
import es.unileon.aplicacionesweb.springapp.logic.handler.Handler;
import es.unileon.aplicacionesweb.springapp.logic.handler.TransactionHandlerProvider;
import es.unileon.aplicacionesweb.springapp.logic.handler.TransactionType;
/**
 *
 * @author roobre
 */
public abstract class Transaction {

//	  Original code
//    private final Handler id;
//    private final double amount;
//    private final Date date;
//    private Date effectiveDate;
//    private final String subject;
//    private final Enum<TransactionType> type;
//    private DetailedInformation extraInformation;
	 
	  private Handler id;
      private double amount;
      private Date date;
      private Date effectiveDate;
      private String subject;
      private Enum<TransactionType> type;
      private DetailedInformation extraInformation;

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

	public void setType(Enum<TransactionType> type) {
		this.type = type;
	}

    public Transaction() {
       
    }
	/**
     *
     * @param amount
     * @param date
     * @param subject
     * @param type
     */
    public Transaction(double amount, Date date, String subject, Enum<TransactionType> type) {
        this(amount, date, subject, type, new DetailedInformation(""));
    }

    /**
     *
     * @param amount
     * @param date
     * @param subject
     * @param type
     * @param info
     */
    public Transaction(double amount, Date date, String subject, Enum<TransactionType> type, DetailedInformation info) {
        this.id = TransactionHandlerProvider.getTransactionHandler();
        this.amount = amount;
        this.date = date;
        this.subject = subject;
        this.type = type;
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
     * @return the type
     */
    public Enum<TransactionType> getType() {
        return type;
    }

    /**
     *
     * @param effectiveDate
     */
    public void setEffectiveDate(Date effectiveDate) {
        this.effectiveDate = effectiveDate;
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
