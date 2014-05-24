package es.unileon.aplicacionesweb.springapp.services;

import java.util.List;

import es.unileon.aplicacionesweb.springapp.logic.domain.Transaction;

/**
 * Implementation of TransactionsManager
 * 
 * @author Miguel Revellado Marcos
 *
 */
public class SimpleTransactionsManager implements TransactionsManager {

	private static final long serialVersionUID = 1L;

	/**
	 * The transactions list.
	 */
	private List<Transaction> transactions;

	/* (non-Javadoc)
	 * @see es.unileon.aplicacionesweb.springapp.services.TransactionsManager#addTransaction(es.unileon.aplicacionesweb.springapp.logic.domain.Transaction)
	 */
	public boolean addTransaction(Transaction transaction) {

		return this.transactions.add(transaction);
	}

	/* (non-Javadoc)
	 * @see es.unileon.aplicacionesweb.springapp.services.TransactionsManager#getTransactions()
	 */
	public List<Transaction> getTransactions() {

		return this.transactions;
	}

	/**
	 * Sets the transactions list.
	 * @param transactions list.
	 */
	public void setTransactions(List<Transaction> transactions) {

		this.transactions = transactions;
	}

}