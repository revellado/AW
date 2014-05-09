package es.unileon.aplicacionesweb.springapp.services;

import java.util.Date;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.validator.constraints.NotBlank;

public class NewTransaction {

    /** Logger for this class and subclasses */
    protected final Log logger = LogFactory.getLog(getClass());
    
    @Min(value = 0, message = "No puede haber transacciones negativas")
    @Max(value = 5000, message = "El valor máximo para una transacción es de 5000")
    @NotNull(message = "Debe introducir una cantidad válida.")
    private double amount;
    @NotNull(message = "Debe introducir una fecha (dd/mm/aaaa).")
	private Date date;
    @NotNull(message = "Debe introducir una fecha (dd/mm/aaaa).")
    private Date effectiveDate;
    @NotBlank(message = "Debe introducir el concepto de la transacción.")
    private String subject;
    @NotBlank(message = "Debe introducir una descripción.")
    private String extraInformation;
	@NotBlank(message = "Debe elegir una tipo de transacción.")
	@javax.validation.constraints.Pattern(regexp = "CHARGE|PAYMENT|PAYROLL|SALARY|IN|OUT|")
    private String transactionType;
    

    public String getTransactionType() {
		return transactionType;
	}
    public String getExtraInformation() {
		return extraInformation;
	}
	public void setTransactionType(String transactionType) {
		this.transactionType = transactionType;
	}
	public void setExtraInformation(String extraInformation) {
		this.extraInformation = extraInformation;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public Date getEffectiveDate() {
		return effectiveDate;
	}
	public void setEffectiveDate(Date effectiveDate) {
		this.effectiveDate = effectiveDate;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
}
