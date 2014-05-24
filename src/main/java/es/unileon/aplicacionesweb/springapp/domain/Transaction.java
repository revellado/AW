package es.unileon.aplicacionesweb.springapp.domain;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * 
 * JavaBean for new transactions.
 * 
 * @author Miguel Revellado Marcos
 */
@Entity
@Table(name="transactions") 
public class Transaction implements Serializable{

	private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    
    /**
     * The transaction amount.
     */
    @Column(name = "amount")
    private double amount;
    
    /**
     * The transaction date.
     */
    @Column(name = "transactiondate")
	private Date transactiondate;
    
    /**
     * The transaction effective date.
     */
    @Column(name = "effectiveDate")
    private Date effectiveDate;
    
    /**
     * The transaction subject.
     */
    @Column(name = "subject")
    private String subject;
    
    /**
     * The transaction extra information.
     */
    @Column(name = "extraInformation")
    private String extraInformation;

    /**
     * 
     * @return the extra information.
     */
    public String getExtraInformation() {
		return extraInformation;
	}
    
    /**
     * 
     * @param extraInformation
     */
	public void setExtraInformation(String extraInformation) {
		this.extraInformation = extraInformation;
	}
	
	/**
	 * 
	 * @return the transaction amount.
	 */
	public double getAmount() {
		return amount;
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
	 * @return the transaction date.
	 */
	public Date getDate() {
		return transactiondate;
	}
	
	/**
	 * 
	 * @param date.
	 */
	public void setDate(Date date) {
		this.transactiondate = date;
	}
	
	/**
	 * 
	 * @return the transaction effective date.
	 */
	public Date getEffectiveDate() {
		return effectiveDate;
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
	 * @return the transaction subject.
	 */
	public String getSubject() {
		return subject;
	}
	
	/**
	 * 
	 * @param subject
	 */
	public void setSubject(String subject) {
		this.subject = subject;
	}
}