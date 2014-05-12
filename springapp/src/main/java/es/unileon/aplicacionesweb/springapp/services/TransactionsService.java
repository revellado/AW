package es.unileon.aplicacionesweb.springapp.services;

import java.util.Date;
import java.util.List;

import es.unileon.aplicacionesweb.springapp.logic.domain.Transaction;

/**
 * Service for management transactions.
 * 
 * @author Miguel Revellado Marcos
 *
 */
public interface TransactionsService {

	/**
	 * Get all the transactions.
	 * @return list of transactions.
	 */
	public List<Transaction> getTransactions();
	
	/**
	 * Add a transaction to the transaction list.
	 * 
	 * @param amount of the transaction.
	 * @param date Date of the transaction.
	 * @param effectiveDate Effective date of the transaction.
	 * @param subject Subject of the transaction.
	 * @param extraInformation Additional information of the transaction.
	 * @return True if the transaction was successfully added, false otherwise.
	 */
	public boolean addTransaction(double amount ,Date date, Date effectiveDate, String subject, String extraInformation);
}
