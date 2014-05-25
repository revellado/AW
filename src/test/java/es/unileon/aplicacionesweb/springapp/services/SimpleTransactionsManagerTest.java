package es.unileon.aplicacionesweb.springapp.services;

import static org.junit.Assert.*;

import java.util.Date;
import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import es.unileon.aplicacionesweb.springapp.logic.domain.GenericTransaction;
import es.unileon.aplicacionesweb.springapp.logic.domain.Transaction;

public class SimpleTransactionsManagerTest {

	private SimpleTransactionsManager transactionsManager;
	
	@Before
	public void setUp() throws Exception {
		transactionsManager = new SimpleTransactionsManager();
	}

	@Test
	public void testAddTransaction() {
		
		List<Transaction> transactions = new ArrayList<Transaction>();
		Transaction transaction = new GenericTransaction(2d, new Date(), "Subject");
		transactionsManager.setTransactions(transactions);
		transactionsManager.addTransaction(transaction);
		assertEquals(transactionsManager.getTransactions().size(), 1);
	}

	@Test
	public void testGetTransactions() {

		List<Transaction> transactions = new ArrayList<Transaction>();
		transactionsManager.setTransactions(transactions);
		assertEquals(transactionsManager.getTransactions().size(), 0);
	}

	@Test
	public void testSetTransactions() {
		
		List<Transaction> transactions = new ArrayList<Transaction>();
		transactionsManager.setTransactions(transactions);
		assertEquals(transactionsManager.getTransactions().size(), 0);
	}

}
