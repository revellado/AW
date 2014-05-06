package es.unileon.aplicacionesweb.springapp.services;

import java.util.List;

import es.unileon.aplicacionesweb.springapp.logic.domain.Transaction;

public class SimpleTransactionManager implements TransactionsManager {

	private static final long serialVersionUID = 1L;
	 
	private List<Transaction> transactions;
	
	public boolean addTransaction(Transaction transaction) {
		
		return this.transactions.add(transaction);
	}

	public List<Transaction> getTransactions() {
		
		return this.transactions;
	}
	
	public void setTransactions(List<Transaction> transactions) {
		
		this.transactions = transactions;
	}

}
