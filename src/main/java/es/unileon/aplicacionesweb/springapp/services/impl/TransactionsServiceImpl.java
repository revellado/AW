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
import es.unileon.aplicacionesweb.springapp.services.TransactionsManager;
import es.unileon.aplicacionesweb.springapp.services.TransactionsService;

/**
* Implementation of the interface TransactionsService.
* 
* @author Miguel Revellado Marcos
 */
@Service
public class TransactionsServiceImpl implements TransactionsService {
	
	protected final Log logger = LogFactory.getLog(getClass());
	
	/**
	 * The transaction manager.
	 */
	@Autowired
    private TransactionsManager transactionManager;

	/* (non-Javadoc)
	 * @see es.unileon.aplicacionesweb.springapp.services.TransactionsService#getTransactions()
	 */
	public List<Transaction> getTransactions() {
		return transactionManager.getTransactions();
	}

	/* (non-Javadoc)
	 * @see es.unileon.aplicacionesweb.springapp.services.TransactionsService#addTransaction(double, java.util.Date, java.util.Date, java.lang.String, java.lang.String, java.lang.String)
	 */
	public boolean addTransaction(double amount, Date date, Date effectiveDate,
			String subject, String extraInformation) {
		
		DetailedInformation detailedInformation = new DetailedInformation(extraInformation);
		
		Transaction transaction = new GenericTransaction(amount,date,subject,detailedInformation);
		transaction.setEffectiveDate(effectiveDate);
		
		return transactionManager.addTransaction(transaction);
	}
	
	/**
	 * 
	 * @return the transactions manager.
	 */
	public TransactionsManager getTransactionManager() {
		return transactionManager;
	}
	
	/**
	 * 
	 * @param transactionManager
	 */
	public void setTransactionManager(TransactionsManager transactionManager) {
		this.transactionManager = transactionManager;
	}
}
