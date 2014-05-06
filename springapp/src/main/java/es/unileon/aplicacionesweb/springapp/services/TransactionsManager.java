package es.unileon.aplicacionesweb.springapp.services;

import java.io.Serializable;
import java.util.List;

import es.unileon.aplicacionesweb.springapp.logic.domain.Transaction;

public interface TransactionsManager extends Serializable{
	
	public boolean addTransaction(Transaction transaction);
    
    public List<Transaction> getTransactions();

}
