package es.unileon.aplicacionesweb.springapp.web.controllers;

import static org.junit.Assert.*;

import java.util.List;
import java.util.Map;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.*;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.web.servlet.ModelAndView;

import es.unileon.aplicacionesweb.springapp.logic.domain.Transaction;
import es.unileon.aplicacionesweb.springapp.web.controllers.HelloController;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:/test-context.xml")
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