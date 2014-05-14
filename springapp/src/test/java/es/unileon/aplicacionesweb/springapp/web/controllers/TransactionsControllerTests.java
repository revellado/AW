package es.unileon.aplicacionesweb.springapp.web.controllers;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

import org.junit.Test;
import org.springframework.web.servlet.ModelAndView;

import es.unileon.aplicacionesweb.springapp.logic.account.DetailedInformation;
import es.unileon.aplicacionesweb.springapp.logic.domain.GenericTransaction;
import es.unileon.aplicacionesweb.springapp.logic.domain.Transaction;
import es.unileon.aplicacionesweb.springapp.services.SimpleTransactionManager;
import es.unileon.aplicacionesweb.springapp.services.impl.TransactionsServiceImpl;
import es.unileon.aplicacionesweb.springapp.web.controllers.TransactionsController;

public class TransactionsControllerTests {

    @Test
    public void testHandleRequestView() throws Exception{
    	
        TransactionsController controller = new TransactionsController();
        
        TransactionsServiceImpl transactionsService = new TransactionsServiceImpl();
        
        SimpleTransactionManager transactionManager = new SimpleTransactionManager();
        
        List<Transaction> transactions = new ArrayList<Transaction>();
        
        Transaction transaction = new GenericTransaction(2.0, new Date(), "Subject", new DetailedInformation("Extra info"));
        transaction.setEffectiveDate(new Date());
        
        transactions.add(transaction);
        transactionManager.setTransactions(transactions);
        transactionsService.setTransactionManager(transactionManager);
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