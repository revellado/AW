package es.unileon.aplicacionesweb.springapp.logic.domain;

import static org.junit.Assert.*;

import java.util.Date;

import org.junit.Before;
import org.junit.Test;

import es.unileon.aplicacionesweb.springapp.logic.account.DetailedInformation;
import es.unileon.aplicacionesweb.springapp.logic.handler.Handler;
import es.unileon.aplicacionesweb.springapp.logic.handler.TransactionHandler;

public class GenericTransactionTests {

	private Transaction transaction;
	@Before
	public void setUp() throws Exception {
		transaction = new GenericTransaction();
	}

	@Test
	public void testGetId() {
		
		Handler transactionHandler = new TransactionHandler(1234, "2011-10-02-18.48.05.123");
		
		transaction.setId(transactionHandler);
		assertEquals(transaction.getId().compareTo(transactionHandler), 0);
	}

	@Test
	public void testGetAmount() {
		
		transaction.setAmount(2.0d);
		assertEquals(transaction.getAmount(), 2.0d, 0);
	}

	@Test
	public void testGetDate() {
		
		Date date = new Date();
		transaction.setDate(date);
		assertTrue(transaction.getDate().equals(date));
	}

	@Test
	public void testGetEffectiveDate() {
		
		Date effectiveDate = new Date();
		transaction.setEffectiveDate(effectiveDate);
		assertTrue(transaction.getEffectiveDate().equals(effectiveDate));
	}

	@Test
	public void testGetSubject() {
		
		String subject = "Subject";
		transaction.setSubject(subject);
		assertTrue(transaction.getSubject().equals(subject));
	}

	@Test
	public void testSetEffectiveDate() {
		
		Date effectiveDate = new Date();
		transaction.setEffectiveDate(effectiveDate);
		assertTrue(transaction.getEffectiveDate().equals(effectiveDate));
	}

	@Test
	public void testGetExtraInformation() {
		
		DetailedInformation extraInformation = new DetailedInformation("Info");
		transaction.setExtraInformation(extraInformation);
		assertTrue(transaction.getExtraInformation().toString().equals("Info"));
	}

	@Test
	public void testSetExtraInformation() {
		
		DetailedInformation extraInformation = new DetailedInformation("Info");
		transaction.setExtraInformation(extraInformation);
		assertTrue(transaction.getExtraInformation().toString().equals("Info"));
	}

	@Test
	public void testSetId() {
		
		Handler transactionHandler = new TransactionHandler(1234, "2011-10-02-18.48.05.123");
		
		transaction.setId(transactionHandler);
		assertEquals(transaction.getId().compareTo(transactionHandler), 0);
	}

	@Test
	public void testSetAmount() {
		
		transaction.setAmount(2.0d);
		assertEquals(transaction.getAmount(), 2.0d, 0);
	}

	@Test
	public void testSetDate() {
		
		Date date = new Date();
		transaction.setDate(date);
		assertTrue(transaction.getDate().equals(date));
	}

	@Test
	public void testSetSubject() {
		
		String subject = "Subject";
		transaction.setSubject(subject);
		assertTrue(transaction.getSubject().equals(subject));
	}

	@Test
	public void testToString() {

		assertTrue(transaction.toString(), transaction.toString().equals("Transaction id=null, amount=0.0, date=null, effectiveDate=null, subject=null"));
	}

}
