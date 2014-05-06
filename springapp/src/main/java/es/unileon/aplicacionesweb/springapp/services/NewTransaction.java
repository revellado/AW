package es.unileon.aplicacionesweb.springapp.services;

import java.util.Date;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.validator.constraints.NotBlank;

import es.unileon.aplicacionesweb.springapp.logic.account.DetailedInformation;
import es.unileon.aplicacionesweb.springapp.logic.handler.TransactionType;

public class NewTransaction {

    /** Logger for this class and subclasses */
    protected final Log logger = LogFactory.getLog(getClass());
    
    @Min(-100)
    @Max(5000)
    @NotNull
    private double amount;
    @NotNull
	private Date date;
    @NotNull
    private Date effectiveDate;
    @NotBlank
    private String subject;
    @NotNull
    private DetailedInformation extraInformation;

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
	public DetailedInformation getExtraInformation() {
		return extraInformation;
	}
	public void setExtraInformation(DetailedInformation extraInformation) {
		this.extraInformation = extraInformation;
	}
	public Log getLogger() {
		return logger;
	}
}
