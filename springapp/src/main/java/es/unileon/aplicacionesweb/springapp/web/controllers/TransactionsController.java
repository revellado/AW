package es.unileon.aplicacionesweb.springapp.web.controllers;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import es.unileon.aplicacionesweb.springapp.logic.domain.Transaction;
import es.unileon.aplicacionesweb.springapp.services.TransactionsService;

/**
 * Controller for the index view.
 */
@Controller
public class TransactionsController {

	/** Logger for this class and subclasses */
    protected final Log log = LogFactory.getLog(getClass());
    
    /**
     * The service for manage the transactions.
     */
    @Autowired
    private TransactionsService transactionsService;


    /**
     * Mapping for the index view.
     */
	@RequestMapping(value="/hello.htm", method = RequestMethod.GET)
    public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    	List<Transaction> transactions = transactionsService.getTransactions();
    	
    	Map<String, Object> myModel = new HashMap<String, Object>();
    	myModel.put("transactions", transactions);
    	
    	log.info("Returning hello view");

        return new ModelAndView("hello",myModel);
    }
	
	/**
	 * 
	 * @param transactionsService
	 */
    public void setTransactionsService(TransactionsService transactionsService) {
		this.transactionsService = transactionsService;
	}
}
