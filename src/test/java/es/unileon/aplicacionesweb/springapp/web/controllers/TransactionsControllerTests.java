package es.unileon.aplicacionesweb.springapp.web.controllers;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

import org.junit.Test;
import org.springframework.web.servlet.ModelAndView;

import es.unileon.aplicacionesweb.springapp.domain.Transaction;
import es.unileon.aplicacionesweb.springapp.repository.InMemoryTransactionDao;
import es.unileon.aplicacionesweb.springapp.services.impl.TransactionsServiceImpl;
import es.unileon.aplicacionesweb.springapp.web.controllers.TransactionsController;

public class TransactionsControllerTests {

    @Test
    public void testHandleRequestView() throws Exception{
    	
        TransactionsController controller = new TransactionsController();
        
        TransactionsServiceImpl transactionsService = new TransactionsServiceImpl();
        
        List<Transaction> transactions = new ArrayList<Transaction>();
        
		Transaction transaction1 = new Transaction();
		transaction1.setAmount(2.0);
		transaction1.setDate(new Date());
		transaction1.setEffectiveDate(new Date());
		transaction1.setSubject("Subject 1");
		transaction1.setExtraInformation("Extra information 1");
		
		transactions.add(transaction1);
		
		transactionsService.setTransactionDao(new InMemoryTransactionDao(transactions));
		
        controller.setTransactionsService(transactionsService);
        
        ModelAndView modelAndView = controller.handleRequest(null, null);
        
        assertNotNull(modelAndView.getModel());
        assertEquals("hello", modelAndView.getViewName());
        
        Map<String, Object> modelMap = (Map<String, Object>) modelAndView.getModel();
        
        @SuppressWarnings("unchecked")
		List<Transaction> transactionsModel = (List<Transaction>) modelMap.get("transactions");
        assertEquals(1, transactionsModel.size());
    }

}