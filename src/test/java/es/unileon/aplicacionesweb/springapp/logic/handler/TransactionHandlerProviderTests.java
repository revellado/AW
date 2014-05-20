package es.unileon.aplicacionesweb.springapp.logic.handler;

import static org.junit.Assert.*;

import org.junit.Test;

public class TransactionHandlerProviderTests {

	@Test
	public void testGetTransactionHandler() {
		
		Handler transactionHandler = TransactionHandlerProvider.getTransactionHandler();
		
		assertEquals(transactionHandler.compareTo(transactionHandler), 0);
	}
}
