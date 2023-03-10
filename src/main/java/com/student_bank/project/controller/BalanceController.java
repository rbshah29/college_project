package com.student_bank.project.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.student_bank.project.Utility.Session.GlobalSessionDetails;
import com.student_bank.project.classes.model.Balance;

@Controller
public class BalanceController {
    
    @RequestMapping(value ="/balance")
    public ModelAndView balance() {
    	if (GlobalSessionDetails.getInstance().getSession() == false){
			ModelAndView mv = new ModelAndView();
			mv.setViewName("signIn");
			return mv;
		}
    	else
        return new ModelAndView("getBalance");
    }

    @RequestMapping(value = "/getBalance", method = RequestMethod.POST)
    public ModelAndView deposit(@RequestParam int accountNum) throws Exception {
		if (GlobalSessionDetails.getInstance().getSession()==false){
			ModelAndView mv = new ModelAndView();
			mv.setViewName("signIn");
			return mv;
		}
		else {
        Balance bal = new Balance();
        ModelAndView modelView = new ModelAndView("viewBalance");
        try{
            bal.balance(accountNum);
            modelView.addObject("balance", bal.dBalance);
        }catch(Exception e){
            
            modelView.setViewName("balance_error");
            modelView.addObject("errorMsg", e.getMessage());
        }
		
        return modelView;
        
		}
    }
}
