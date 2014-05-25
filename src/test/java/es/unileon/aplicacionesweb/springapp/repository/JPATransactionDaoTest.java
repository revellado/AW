package es.unileon.aplicacionesweb.springapp.repository;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import es.unileon.aplicacionesweb.springapp.domain.Transaction;

public class JPATransactionDaoTest {
	
    private ApplicationContext context;
    private TransactionDao transactionsDao;
    
	@Before
	public void setUp() throws Exception {
		context = new ClassPathXmlApplicationContext("classpath:test-context.xml");
		transactionsDao = (TransactionDao) context.getBean("transactionDao");
	}

	@Test
	public void testGetTransactionsList() {
		List<Transaction> transactions = transactionsDao.getTransactionsList();
        assertEquals(3,transactions.size(), 0);
	}

	@Test
	public void testSaveTransaction() {
		
		List<Transaction> transactions = transactionsDao.getTransactionsList();

		Transaction transaction = transactions.get(0);
        Double amount = transaction.getAmount();
        transaction.setAmount(200.12);
        transactionsDao.saveTransaction(transaction);

        List<Transaction> updatedTransactions = transactionsDao.getTransactionsList();
        Transaction updatedTransaction = updatedTransactions.get(0);
        assertEquals(updatedTransaction.getAmount(), 200.12, 0);

        updatedTransaction.setAmount(amount);
        transactionsDao.saveTransaction(updatedTransaction);
	}

}
