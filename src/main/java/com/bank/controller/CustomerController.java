package com.bank.controller;

import java.util.regex.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class CustomerController {
	// PAN validation for correct format
	@RequestMapping("/panValidate")
	public ModelAndView panValidation(HttpServletRequest request,
			   HttpServletResponse response) {
		  String pan=request.getParameter("panNumber"); 
	      String message;
	      if(pan != null && 
	    		  pan.matches("[A-Z]{5}[0-9]{4}[A-Z]{1}")){
	    	  message = "Pan number is valid";
		      return new ModelAndView("welcome", 
		    		  "message", message);  
	    	  	    	  
	      }else{
	    	  message = "Invalid PAN number";
	    	  return new ModelAndView("welcome", 
	    			  "message", message);
	      }
	   }
	// adhaar validation for correct format
	@RequestMapping("/adhaarValidate")
	public ModelAndView adhaarValidation(HttpServletRequest request,
			   HttpServletResponse response) {
		  String adh=request.getParameter("adhaar");  
	      String message;
	      String regex
          = "^[2-9]{1}[0-9]{3}\\s[0-9]{4}\\s[0-9]{4}$";
	      Pattern p = Pattern.compile(regex);
	      Matcher m = p.matcher(adh);
	      if(adh != null && 
	    		  m.matches()){
	    	  message = "Adhaar number is valid";
		      return new ModelAndView("welcome", 
		    		  "message", message);  
	    	  	    	  
	      }else{
	    	  message = "Invalid Ahaar number";
	    	  return new ModelAndView("welcome", 
	    			  "message", message);
	      }
	   }

}
