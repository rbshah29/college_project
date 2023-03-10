package com.student_bank.project.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import com.student_bank.project.Interfaces.IStudentFactory;
import com.student_bank.project.Utility.Session.GlobalSessionDetails;
import com.student_bank.project.classes.model.Transaction;
import com.student_bank.project.factory.StudentFactory;

@Controller
public class TransactionController {
	  IStudentFactory ifactory = new StudentFactory();

    @RequestMapping(value = "/makeTransaction")
    public ModelAndView makeTransaction(@RequestParam int sAcc, @RequestParam int dAcc, @RequestParam int tAmount) {
    	if (GlobalSessionDetails.getInstance().getSession() == false){
			ModelAndView mv = new ModelAndView();
			mv.setViewName("signIn");
			return mv;
		}
    	else {
        ModelAndView mv = new ModelAndView();
        
        try {
            Transaction transaction = ifactory.makeTransaction();
            boolean success = transaction.transactions(sAcc, dAcc, tAmount);
            if (success) {
                mv.setViewName("transactionSucess");
                transaction.TransactionHistory(sAcc,dAcc,tAmount);
            }
        } catch (Exception e) {
            mv.setViewName("transactionError");
            mv.addObject("errorMsg", e.getMessage());
        }
        return mv;
    }
    }

    @Controller
    public class depositController {
        @RequestMapping(value="/transaction_history")
        public ModelAndView payment(){
        	if (GlobalSessionDetails.getInstance().getSession()== false){
    			ModelAndView mv = new ModelAndView();
    			mv.setViewName("signIn");
    			return mv;
    		}else
    			
            return new ModelAndView("transactionHistory");
        }   
    }


}
