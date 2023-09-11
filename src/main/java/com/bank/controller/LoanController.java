package com.bank.controller;

import java.text.DecimalFormat;
import java.util.Map;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistryBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mock.web.server.MockWebSession;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.bank.entities.Customer;
import com.bank.model.CustomerModel;

@Controller
public class LoanController {
	//function to get customer details
	@RequestMapping("/loan")
	public ModelAndView loanInfo(HttpServletRequest request,HttpServletResponse response) {
		  Customer cust;
		  String pan=request.getParameter("panNumber");  
	      String message;
	      CustomerModel custm=new CustomerModel();
	      cust=(Customer)(custm.getCustomer(pan));
	      if(cust==null) {
	    	message = "Customer not found";
	    	return new ModelAndView("welcome", 
		    			  "message", message);
	      }else {
	    	  		request.getSession().setAttribute("customer", cust);
	    	  		return new ModelAndView("loanInfo", 
		    		  "customer", cust);
	    	    }
	}
	
	//function to calculate EMI
	@RequestMapping("/emi")
	public ModelAndView emiCal(HttpServletRequest request,HttpServletResponse response) {
		 String message="";
		 float principal=Float.parseFloat(request.getParameter("loanAmount")); 
		 float rate=Float.parseFloat(request.getParameter("rate")); 
		 float time=Float.parseFloat(request.getParameter("time"));
		 rate=rate/(12*100); 
		 double emi= (principal*rate*Math.pow(1+rate,time))/(Math.pow(1+rate,time)-1);
		 DecimalFormat decimalFormatter = new DecimalFormat("#.##");
	     message="Monthly EMI will be Rs. "+decimalFormatter.format(emi);
	     return new ModelAndView("loanInfo", 
	    		 "message", message);
	    	    }
}
