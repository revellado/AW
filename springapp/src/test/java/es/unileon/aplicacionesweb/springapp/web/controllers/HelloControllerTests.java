package es.unileon.aplicacionesweb.springapp.web.controllers;

import static org.junit.Assert.*;

import org.junit.Test;
import org.springframework.web.servlet.ModelAndView;

import es.unileon.aplicacionesweb.springapp.web.controllers.HelloController;


public class HelloControllerTests {

    @Test
    public void testHandleRequestView() throws Exception{		
        HelloController controller = new HelloController();
        ModelAndView modelAndView = controller.handleRequest(null, null);
        assertNotNull(modelAndView.getModel());
        String nowValue = (String) modelAndView.getModel().get("now");
        assertNotNull(nowValue);
        assertEquals("hello", modelAndView.getViewName());
    }

}