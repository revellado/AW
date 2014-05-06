package es.unileon.aplicacionesweb.springapp.services.impl;

import java.util.Date;
import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import es.unileon.aplicacionesweb.springapp.logic.account.DetailedInformation;
import es.unileon.aplicacionesweb.springapp.logic.domain.GenericTransaction;
import es.unileon.aplicacionesweb.springapp.logic.domain.Transaction;
import es.unileon.aplicacionesweb.springapp.logic.handler.TransactionType;
import es.unileon.aplicacionesweb.springapp.services.TransactionsManager;
import es.unileon.aplicacionesweb.springapp.services.TransactionsService;

@Service
public class TransactionsServiceImpl implements TransactionsService {
	
	protected final Log logger = LogFactory.getLog(getClass());
	
	@Autowired
    private TransactionsManager transactionManager;

	public List<Transaction> getTransactions() {
		return transactionManager.getTransactions();
	}

	public TransactionsManager getTransactionManager() {
		return transactionManager;
	}
	
	public void setTransactionManager(TransactionsManager transactionManager) {
		this.transactionManager = transactionManager;
	}

	public boolean addTransaction(double amount, Date date, Date effectiveDate,
			String subject, DetailedInformation extraInformation) {
		
		
		System.out.println("Amount: "+ amount + " Date: " + date.toString());
		
		Transaction transaction = new GenericTransaction(amount,date,subject,TransactionType.CHARGE,extraInformation);
		transaction.setEffectiveDate(effectiveDate);
		return transactionManager.addTransaction(transaction);
	}
}
