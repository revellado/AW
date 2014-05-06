package es.unileon.aplicacionesweb.springapp.services;

import java.util.Date;
import java.util.List;

import es.unileon.aplicacionesweb.springapp.logic.account.DetailedInformation;
import es.unileon.aplicacionesweb.springapp.logic.domain.Transaction;
import es.unileon.aplicacionesweb.springapp.logic.handler.TransactionType;

public interface TransactionsService {

	public List<Transaction> getTransactions();
	
	public boolean addTransaction(double amount ,Date date, Date effectiveDate, String subject, DetailedInformation extraInformation);
}
