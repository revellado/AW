package es.unileon.aplicacionesweb.springapp.web.controllers;

import java.beans.PropertyEditorSupport;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
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

import es.unileon.aplicacionesweb.springapp.logic.account.DetailedInformation;
import es.unileon.aplicacionesweb.springapp.logic.handler.TransactionType;
import es.unileon.aplicacionesweb.springapp.services.NewTransaction;
import es.unileon.aplicacionesweb.springapp.services.TransactionsService;
import es.unileon.aplicacionesweb.springapp.validator.EnumEditor;

@Controller
@RequestMapping(value="/addtransaction.htm")
public class AddTransactionController {

    /** Logger for this class and subclasses */
    protected final Log logger = LogFactory.getLog(getClass());

    @Autowired
    private TransactionsService transactionsService;

	@RequestMapping(method = RequestMethod.POST)
    public String onSubmit(@Valid NewTransaction newTransaction, BindingResult result)
    {
        if (result.hasErrors()) {
        	System.out.println("Han habido errores");
        	logger.info("Han habido errores: " + result.getErrorCount()+" estos");
            return "addtransaction";
        }
        
        transactionsService.addTransaction(newTransaction.getAmount(), newTransaction.getDate(), newTransaction.getEffectiveDate(), newTransaction.getSubject(), newTransaction.getExtraInformation());
        System.out.println("No Han habido errores");
        logger.info("No Han habido errores");
        return "redirect:/hello.htm";
        
    }

    @RequestMapping(method = RequestMethod.GET)
    protected NewTransaction formBackingObject(HttpServletRequest request) throws ServletException {
    	NewTransaction newTransaction = new NewTransaction();
    	
//    	request.setAttribute("typeList",TransactionType.values());
    	
        return newTransaction;
    }

    public void setTransactionsService(TransactionsService transactionsService) {
		this.transactionsService = transactionsService;
	}
    
    public TransactionsService getTransactionsService() {
		return transactionsService;
	}
    
    @InitBinder
    public void initBinder(WebDataBinder binder) {
        CustomDateEditor editor = new CustomDateEditor(new SimpleDateFormat("dd/MM/yyyy"), true);
       
        binder.registerCustomEditor(Date.class, editor);
        
        binder.registerCustomEditor(DetailedInformation.class, new PropertyEditorSupport() {
            @Override
            public void setAsText(String value) throws IllegalArgumentException {
                if(!StringUtils.hasText(value))
                    return;
                DetailedInformation extraInformation = new DetailedInformation(value);
                setValue(extraInformation);
            }

            @Override
            public String getAsText() {
                if(getValue() == null)
                    return "";
                DetailedInformation extraInformation = (DetailedInformation) getValue();
                return (extraInformation.getInfo().toString());
            }
        });
    }

}