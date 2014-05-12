package es.unileon.aplicacionesweb.springapp.logic.domain;

import java.util.Date;

import es.unileon.aplicacionesweb.springapp.logic.account.DetailedInformation;

/**
* Generic transaction
*
* @author runix
*/
public class GenericTransaction extends Transaction {
	
	public GenericTransaction(){
		super();
	};

    /**
* Create a new generic transaction
*
* @param amount ( Transaction amount )
* @param date ( Transaction date )
* @param subject ( Transaction subject )
*/
    public GenericTransaction(double amount, Date date, String subject) {
        super(amount, date, subject);
    }

    /**
* Create a new generic transaction
*
* @param amount ( Transaction amount )
* @param date ( Transaction date )
* @param subject ( Transaction subject )
*/
    public GenericTransaction(double amount, Date date, String subject, DetailedInformation extraInfo) {
        super(amount, date, subject, extraInfo);
    }
}