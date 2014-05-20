package es.unileon.aplicacionesweb.springapp.logic.domain;

import java.util.Date;

import es.unileon.aplicacionesweb.springapp.logic.account.DetailedInformation;
import es.unileon.aplicacionesweb.springapp.logic.handler.Handler;
import es.unileon.aplicacionesweb.springapp.logic.handler.TransactionHandlerProvider;

/**
 * Abstract representation of a transaction.
 */
public abstract class Transaction {

	/**
	 * The identification of a transaction.
	 */
	private Handler id;
	
	/**
	 * The amount of a transaction.
	 */
	private double amount;
	
	/**
	 * The date of a transaction.
	 */
	private Date date;
	
	/**
	 * The effective date of a transaction.
	 */
	private Date effectiveDate;
	
	/**
	 * The subject of a transaction.
	 */
	private String subject;
	
	/**
	 * Extra details of a transaction.
	 */
	private DetailedInformation extraInformation;

	/**
	 * Transaction constructor without extra information.
	 * @param amount
	 * @param date
	 * @param subject
	 */
	public Transaction(double amount, Date date, String subject) {
		this(amount, date, subject, new DetailedInformation(""));
	}

	/**
	 * Empty transaction constructor.
	 */
	public Transaction() {

	}

	/**
	 * Transaction constructor with extra information.
	 * @param amount
	 * @param date
	 * @param subject
	 * @param info
	 */
	public Transaction(double amount, Date date, String subject,
			DetailedInformation info) {
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
			err.append("The id cannot be null \n");
		} else {
			if (id.toString().length() == 0) {
				err.append("The id size cannot be 0 \n");
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

	/**
	 * 
	 * @return the extra information.
	 */
	public DetailedInformation getExtraInformation() {
		return extraInformation;
	}

	/**
	 * 
	 * @param extraInformation
	 */
	public void setExtraInformation(DetailedInformation extraInformation) {
		this.extraInformation = extraInformation;
	}

	/**
	 * 
	 * @param id
	 */
	public void setId(Handler id) {
		this.id = id;
	}

	/**
	 * 
	 * @param amount
	 */
	public void setAmount(double amount) {
		this.amount = amount;
	}

	/**
	 * 
	 * @param date
	 */
	public void setDate(Date date) {
		this.date = date;
	}

	/**
	 * 
	 * @param subject
	 */
	public void setSubject(String subject) {
		this.subject = subject;
	}

	/**
	 * 
	 * @return The string representation of a transaction.
	 */
	@Override
	public String toString() {
		return "Transaction " + "id=" + id + ", amount=" + amount + ", date="
				+ date + ", effectiveDate=" + effectiveDate + ", subject="
				+ subject;
	}
}
