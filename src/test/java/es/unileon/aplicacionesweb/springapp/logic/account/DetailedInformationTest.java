package es.unileon.aplicacionesweb.springapp.logic.account;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class DetailedInformationTest {

	private DetailedInformation detailedInformation;
	
	@Before
	public void setUp() throws Exception {
		detailedInformation = new DetailedInformation();
	}

	@Test
	public void testAppendInformationString() {
		
		detailedInformation.appendInformation("Information");
		assertTrue(detailedInformation.toString().equals("Information\n"));
	}

	@Test
	public void testAppendInformatonStringBuilder() {
		
		StringBuilder information = new StringBuilder("String Builder");
		detailedInformation.appendInformaton(information);
		assertTrue(detailedInformation.toString().equals("String Builder\n"));
	}

	@Test
	public void testDoFinal() {
		
		detailedInformation.appendInformation("Information");
		detailedInformation.doFinal();
		detailedInformation.appendInformation("Info");
		assertTrue(detailedInformation.toString().equals("Information\n"));
	}

	@Test
	public void testToString() {
		detailedInformation.appendInformation("Information");
		assertTrue(detailedInformation.toString().equals("Information\n"));
	}

	@Test
	public void testGetInfo() {
		detailedInformation.appendInformation("Information");
		assertTrue(detailedInformation.getInfo().toString().equals("Information\n"));
	}

	@Test
	public void testSetInfo() {
		
		StringBuilder information = new StringBuilder("String Builder");
		detailedInformation.setInfo(information);
		assertTrue(detailedInformation.getInfo().toString().equals("String Builder"));
	}

	@Test
	public void testIsNonEditable() {
		detailedInformation.setNonEditable(true);
		assertTrue(detailedInformation.isNonEditable());
	}

	@Test
	public void testSetNonEditable() {
		assertFalse(detailedInformation.isNonEditable());
		detailedInformation.setNonEditable(true);
		assertTrue(detailedInformation.isNonEditable());
	}

}
