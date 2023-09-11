package com.bank.controller;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.support.SecurityContextProvider;
import org.springframework.messaging.simp.SimpAttributesContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LoginController {
	@RequestMapping("/login")
	public ModelAndView login(HttpServletRequest request,
			   HttpServletResponse response) {
		  String userName=request.getParameter("userName");  
	      String password=request.getParameter("password");
	      String message;
	      if(userName != null && 
	    		  !userName.equals("") 
	    		  && userName.equals("admin") && 
	    		  password != null && 
	    		  !password.equals("") && 
	    		  password.equals("admin")){
	    	  message = "Welcome To BankOfEclipse HomePage";
		      return new ModelAndView("welcome", 
		    		  "message", message);  
	    	  	    	  
	      }else{
	    	  message = "Wrong username or password.";
	    	  return new ModelAndView("errorPage", 
	    			  "message", message);
	      }
	   }
	@RequestMapping("/logout")
	public String logout(HttpServletRequest request,
			   HttpServletResponse response) throws ServletException {
		  request.getSession().invalidate();
		  Cookie c[]=request.getCookies(); 
		  if(c!=null){ 
			  request.getSession().removeAttribute(c[0].getValue());
			  } 
		 return "redirect:/";
	}
}




