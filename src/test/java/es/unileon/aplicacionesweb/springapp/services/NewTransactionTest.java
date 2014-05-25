package es.unileon.aplicacionesweb.springapp.services;

import static org.junit.Assert.*;

import java.util.Date;

import org.junit.Before;
import org.junit.Test;

public class NewTransactionTest {

	private NewTransaction newTransaction;
	
	@Before
	public void setUp() throws Exception {
		
		newTransaction = new NewTransaction();
	}

	@Test
	public void testGetExtraInformation() {
		
		newTransaction.setExtraInformation("extra information");
		assertTrue(newTransaction.getExtraInformation().equals("extra information"));
	}

	@Test
	public void testSetExtraInformation() {
		
		newTransaction.setExtraInformation("extra information");
		assertTrue(newTransaction.getExtraInformation().equals("extra information"));
	}

	@Test
	public void testGetAmount() {
		
		newTransaction.setAmount(2d);
		assertEquals(newTransaction.getAmount(), 2d, 0);
	}

	@Test
	public void testSetAmount() {
		
		newTransaction.setAmount(2d);
		assertEquals(newTransaction.getAmount(), 2d, 0);
	}

	@Test
	public void testGetDate() {
		
		Date date = new Date();
		newTransaction.setDate(date);
		assertTrue(newTransaction.getDate().equals(date));
	}

	@Test
	public void testSetDate() {
		
		Date date = new Date();
		newTransaction.setDate(date);
		assertTrue(newTransaction.getDate().equals(date));
	}

	@Test
	public void testGetEffectiveDate() {
		
		Date effectiveDate = new Date();
		newTransaction.setEffectiveDate(effectiveDate);
		assertTrue(newTransaction.getEffectiveDate().equals(effectiveDate));
	}

	@Test
	public void testSetEffectiveDate() {
		
		Date effectiveDate = new Date();
		newTransaction.setEffectiveDate(effectiveDate);
		assertTrue(newTransaction.getEffectiveDate().equals(effectiveDate));
	}

	@Test
	public void testGetSubject() {
		
		String subject = "Subject";
		newTransaction.setSubject(subject);
		assertTrue(newTransaction.getSubject().equals(subject));
	}

	@Test
	public void testSetSubject() {

		String subject = "Subject";
		newTransaction.setSubject(subject);
		assertTrue(newTransaction.getSubject().equals(subject));
	}

}
