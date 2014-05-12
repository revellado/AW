package es.unileon.aplicacionesweb.springapp.web.controllers;

import static org.junit.Assert.*;

import java.util.List;
import java.util.Map;

import org.junit.Test;
import org.springframework.web.servlet.ModelAndView;

import es.unileon.aplicacionesweb.springapp.logic.domain.Transaction;
import es.unileon.aplicacionesweb.springapp.web.controllers.HelloController;

public class HelloControllerTests {

    @Test
    public void testHandleRequestView() throws Exception{
    	
        HelloController controller = new HelloController();
        
        ModelAndView modelAndView = controller.handleRequest(null, null);
        
        assertNotNull(modelAndView.getModel());
        assertEquals("hello", modelAndView.getViewName());
        
        Map<String, Object> modelMap = (Map<String, Object>) modelAndView.getModel().get("model");
        List<Transaction> transactions = (List<Transaction>) modelMap.get("transactions");
        assertEquals(2, transactions.size());
    }

}