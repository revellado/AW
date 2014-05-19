package es.unileon.aplicacionesweb.springapp.services;

import java.util.Date;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.validator.constraints.NotBlank;

/**
 * 
 * JavaBean for new transactions.
 * 
 * @author Miguel Revellado Marcos
 */
public class NewTransaction {

    /** Logger for this class and subclasses */
    protected final Log logger = LogFactory.getLog(getClass());
    
    /**
     * The transaction amount.
     */
    @Min(value = 0, message = "No puede haber transacciones negativas")
    @Max(value = 5000, message = "El valor máximo para una transacción es de 5000")
    @NotNull(message = "Debe introducir una cantidad válida.")
    private double amount;
    
    /**
     * The transaction date.
     */
    @NotNull(message = "Debe introducir una fecha (dd/mm/aaaa).")
	private Date date;
    
    /**
     * The transaction effective date.
     */
    @NotNull(message = "Debe introducir una fecha (dd/mm/aaaa).")
    private Date effectiveDate;
    
    /**
     * The transaction subject.
     */
    @NotBlank(message = "Debe introducir el concepto de la transacción.")
    private String subject;
    
    /**
     * The transaction extra information.
     */
    @NotBlank(message = "Debe introducir una descripción.")
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
		return date;
	}
	
	/**
	 * 
	 * @param date.
	 */
	public void setDate(Date date) {
		this.date = date;
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