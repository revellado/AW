package es.unileon.aplicacionesweb.springapp.repository;

import java.util.List;

import es.unileon.aplicacionesweb.springapp.domain.Transaction;

public interface TransactionDao {

	 public List<Transaction> getTransactionsList();

	 public void saveTransaction(Transaction transaction);
}
