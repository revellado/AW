package es.unileon.aplicacionesweb.springapp.services.impl;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import es.unileon.aplicacionesweb.springapp.logic.domain.GenericTransaction;
import es.unileon.aplicacionesweb.springapp.logic.domain.Transaction;
import es.unileon.aplicacionesweb.springapp.services.SimpleTransactionsManager;

public class TransactionsServiceImplTests {

	TransactionsServiceImpl transactionsService;
	
	@Before
	public void setUp() throws Exception {
		transactionsService = new TransactionsServiceImpl();
	}

	@Test
	public void testGetTransactions() {
		
		SimpleTransactionsManager transactionsManager = new SimpleTransactionsManager();
		List<Transaction> transactions = new ArrayList<Transaction>();
		transactionsManager.setTransactions(transactions);
		transactionsService.setTransactionManager(transactionsManager);
		assertEquals(transactionsService.getTransactions().size(), 0);
		
	}

	@Test
	public void testAddTransaction() {
		
		SimpleTransactionsManager transactionsManager = new SimpleTransactionsManager();
		List<Transaction> transactions = new ArrayList<Transaction>();
		Transaction transaction = new GenericTransaction(2d, new Date(), "Subject");
		transactionsManager.setTransactions(transactions);
		transactionsService.setTransactionManager(transactionsManager);
		transactionsManager.addTransaction(transaction);
		assertEquals(transactionsService.getTransactions().size(), 1);
	}

	@Test
	public void testGetTransactionManager() {
		
		SimpleTransactionsManager transactionsManager = new SimpleTransactionsManager();
		List<Transaction> transactions = new ArrayList<Transaction>();
		transactionsManager.setTransactions(transactions);
		transactionsService.setTransactionManager(transactionsManager);
		assertTrue(transactionsService.getTransactionManager() != null);
	}

	@Test
	public void testSetTransactionManager() {
		
		SimpleTransactionsManager transactionsManager = new SimpleTransactionsManager();
		List<Transaction> transactions = new ArrayList<Transaction>();
		transactionsManager.setTransactions(transactions);
		transactionsService.setTransactionManager(transactionsManager);
		assertTrue(transactionsService.getTransactionManager() != null);
	}

}
