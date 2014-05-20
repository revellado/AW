package es.unileon.aplicacionesweb.springapp.web.controllers;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import es.unileon.aplicacionesweb.springapp.services.NewTransaction;
import es.unileon.aplicacionesweb.springapp.services.TransactionsService;

/**
 * Controller for the add transaction view.
 */
@Controller
@RequestMapping(value="/addtransaction.htm")
public class AddTransactionController {

    /** Logger for this class and subclasses */
    protected final Log log = LogFactory.getLog(getClass());

    /**
     * The service for manage the transactions.
     */
    @Autowired
    private TransactionsService transactionsService;

    /**
     * Mapping for onSubmit form.
     * @param newTransaction the transaction we want to add.
     * @param result result of validate the transaction.
     * @return the view we return.
     */
	@RequestMapping(method = RequestMethod.POST)
    public String onSubmit(@Valid NewTransaction newTransaction, BindingResult result)
    {
        if (result.hasErrors()) {
        	log.info("Error en algun campo.");
            return "addtransaction";
        }
        
        transactionsService.addTransaction(newTransaction.getAmount(), newTransaction.getDate(), newTransaction.getEffectiveDate(), newTransaction.getSubject(), newTransaction.getExtraInformation());
        
        return "redirect:/hello.htm";
        
    }

	/**
	 * Mapping to create the transaction that we will fill.
	 * @param request
	 * @return the transaction.
	 * @throws ServletException
	 */
    @RequestMapping(method = RequestMethod.GET)
    protected NewTransaction formBackingObject(HttpServletRequest request) throws ServletException {
    	
    	NewTransaction newTransaction = new NewTransaction();
    	
        return newTransaction;
    }

    /**
     * 
     * @param transactionsService
     */
    public void setTransactionsService(TransactionsService transactionsService) {
		this.transactionsService = transactionsService;
	}
    
    /**
     * 
     * @return the transactions service.
     */
    public TransactionsService getTransactionsService() {
		return transactionsService;
	}
    
    /**
     * Customize the validator.
     * @param binder the default binder.
     */
    @InitBinder
    public void initBinder(WebDataBinder binder) {
        CustomDateEditor editor = new CustomDateEditor(new SimpleDateFormat("dd/MM/yyyy"), true);
       
        binder.registerCustomEditor(Date.class, editor);
    }

}