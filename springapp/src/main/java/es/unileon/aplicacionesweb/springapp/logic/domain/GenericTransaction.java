package es.unileon.aplicacionesweb.springapp.logic.domain;

import java.util.Date;

import es.unileon.aplicacionesweb.springapp.logic.account.DetailedInformation;
import es.unileon.aplicacionesweb.springapp.logic.handler.TransactionType;

/**
* Generic transaction
*
* @author runix
*/
public class GenericTransaction extends Transaction {

	 public GenericTransaction(){
		 
	 }
   /**
    * Create a new generic transaction
    *
    * @param amount ( Transaction amount )
    * @param date ( Transaction date )
    * @param subject ( Transaction subject )
    * @param type (Transaction type)
    */
   public GenericTransaction(double amount, Date date, String subject, Enum<TransactionType> type) {
       super(amount, date, subject, type);
   }

   /**
    * Create a new generic transaction
    *
    * @param amount ( Transaction amount )
    * @param date ( Transaction date )
    * @param subject ( Transaction subject )
    * @param type (Transaction type)
    */
   public GenericTransaction(double amount, Date date, String subject, Enum<TransactionType> type, DetailedInformation extraInfo) {
       super(amount, date, subject, type, extraInfo);
   }
}
