package es.unileon.aplicacionesweb.springapp.services.impl;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import es.unileon.aplicacionesweb.springapp.domain.Transaction;
import es.unileon.aplicacionesweb.springapp.repository.InMemoryTransactionDao;
import es.unileon.aplicacionesweb.springapp.repository.TransactionDao;

public class TransactionsServiceImplTest {

	TransactionsServiceImpl transactionsService;
	List<Transaction> transactions;
	TransactionDao transactionsDao;
	
	@Before
	public void setUp() throws Exception {
		
		transactionsService = new TransactionsServiceImpl();
		transactions = new ArrayList<Transaction>();
		
		Transaction transaction1 = new Transaction();
		transaction1.setAmount(2.0);
		transaction1.setDate(new Date());
		transaction1.setEffectiveDate(new Date());
		transaction1.setSubject("Subject 1");
		transaction1.setExtraInformation("Extra information 1");
		
		Transaction transaction2 = new Transaction();
		transaction2.setAmount(5.0);
		transaction2.setDate(new Date());
		transaction2.setEffectiveDate(new Date());
		transaction2.setSubject("Subject 2");
		transaction2.setExtraInformation("Extra information 2");
		
		transactions.add(transaction1);
		transactions.add(transaction2);
		
		transactionsDao = new InMemoryTransactionDao(transactions);
		transactionsService.setTransactionDao(transactionsDao);
	}

    @Test
    public void testGetProductsWithNoTransactions() {
    	
    	transactionsService = new TransactionsServiceImpl();
    	transactionsDao = new InMemoryTransactionDao(null);
		transactionsService.setTransactionDao(transactionsDao);
        assertNull(transactionsService.getTransactions());
    }
    
	@Test
	public void testGetTransactions() {
		
		List<Transaction> transactions = transactionsService.getTransactions();
        assertNotNull(transactions);        
        assertEquals(2, transactionsService.getTransactions().size());
    
        Transaction transaction = transactions.get(0);
        assertEquals(2.0, transaction.getAmount(),0);
        assertTrue(transaction.getSubject().equals("Subject 1"));
        assertTrue(transaction.getExtraInformation().equals("Extra information 1"));
        
        transaction = transactions.get(1);
        assertEquals(5.0, transaction.getAmount(),0);
        assertTrue(transaction.getSubject().equals("Subject 2"));
        assertTrue(transaction.getExtraInformation().equals("Extra information 2")); 
	}

	@Test
	public void testAddTransaction() {
		
		transactionsService.addTransaction(10.0, new Date(), new Date(), "Subject 3", "Extra information 3");
		assertEquals(3, transactionsService.getTransactions().size());
	}

}
