package es.unileon.aplicacionesweb.springapp.services;

import java.io.Serializable;
import java.util.List;

import es.unileon.aplicacionesweb.springapp.logic.domain.Transaction;

/**
 * Transactions manager
 * 
 * @author Miguel Revellado Marcos
 *
 */
public interface TransactionsManager extends Serializable{

	/**
	 * Add a transaction to the transaction list.
	 * 
	 * @param transaction The transaction we want to add.
	 * @return True if the transaction was successfully added, false otherwise.
	 */
	public boolean addTransaction(Transaction transaction);
    
	/**
	 * Get all the transactions.
	 * @return list of transactions.
	 */
    public List<Transaction> getTransactions();

}