package es.unileon.aplicacionesweb.springapp.services.impl;

import java.util.Date;
import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import es.unileon.aplicacionesweb.springapp.domain.Transaction;
import es.unileon.aplicacionesweb.springapp.repository.TransactionDao;
import es.unileon.aplicacionesweb.springapp.services.TransactionsService;

/**
* Implementation of the interface TransactionsService.
* 
* @author Miguel Revellado Marcos
 */
@Service
public class TransactionsServiceImpl implements TransactionsService {
	
	protected final Log logger = LogFactory.getLog(getClass());
	
    @Autowired
	private TransactionDao transactionsDao;

	/* (non-Javadoc)
	 * @see es.unileon.aplicacionesweb.springapp.services.TransactionsService#getTransactions()
	 */
	public List<Transaction> getTransactions() {
		return transactionsDao.getTransactionsList();
	}

	/* (non-Javadoc)
	 * @see es.unileon.aplicacionesweb.springapp.services.TransactionsService#addTransaction(double, java.util.Date, java.util.Date, java.lang.String, java.lang.String, java.lang.String)
	 */
	public void addTransaction(double amount, Date date, Date effectiveDate, String subject, String extraInformation) {
		
		Transaction transaction = new Transaction();
		transaction.setAmount(amount);
		transaction.setDate(date);
		transaction.setEffectiveDate(effectiveDate);
		transaction.setSubject(subject);
		transaction.setExtraInformation(extraInformation);
		
		transactionsDao.saveTransaction(transaction);
	}
	
	public void setTransactionDao(TransactionDao transactionsDao){
		this.transactionsDao = transactionsDao;
	}
}
