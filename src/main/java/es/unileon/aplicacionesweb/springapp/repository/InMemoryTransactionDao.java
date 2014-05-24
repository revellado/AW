package es.unileon.aplicacionesweb.springapp.repository;

import java.util.List;

import es.unileon.aplicacionesweb.springapp.domain.Transaction;

public class InMemoryTransactionDao implements TransactionDao {

	private List<Transaction> transactions;
	
	public InMemoryTransactionDao(List<Transaction> transactions){
		this.transactions = transactions;
	}
	
	public List<Transaction> getTransactionsList() {
		return transactions;
	}

	public void saveTransaction(Transaction transaction) {
		this.transactions.add(transaction);
	}
}
