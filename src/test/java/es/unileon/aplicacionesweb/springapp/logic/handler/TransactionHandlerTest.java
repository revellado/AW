package es.unileon.aplicacionesweb.springapp.logic.handler;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TransactionHandlerTest {

	TransactionHandler transactionHandler;
	
	@Before
	public void setUp() throws Exception {
		transactionHandler = new TransactionHandler(1234, "2011-10-02-18.48.05.123");
	}

	@Test
	public void testToString() {
		
		assertTrue(transactionHandler.toString(),transactionHandler.toString().equals("2011-10-02-18.48.05.123.1234"));
	}

	@Test
	public void testCompareTo() {
		
		TransactionHandler transactionHandler2 =  new TransactionHandler(1234, "2011-10-02-18.48.05.123");
		assertEquals(transactionHandler.compareTo(transactionHandler2), 0);
	}

	@Test
	public void testGetId() {
		
		assertEquals(transactionHandler.getId(), 1234);
	}

	@Test
	public void testSetId() {
		
		transactionHandler.setId(2345);
		assertEquals(transactionHandler.getId(), 2345);
	}

	@Test
	public void testGetTimestamp() {
		
		assertTrue(transactionHandler.getTimestamp().equals("2011-10-02-18.48.05.123"));
	}

	@Test
	public void testSetTimestamp() {
		
		transactionHandler.setTimestamp("2012-10-02-18.48.05.123");
		assertTrue(transactionHandler.getTimestamp().equals("2012-10-02-18.48.05.123"));
	}

}
