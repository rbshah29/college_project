package com.student_bank.project.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import com.student_bank.project.Interfaces.IStudentFactory;
import com.student_bank.project.Utility.Session.GlobalSessionDetails;
import com.student_bank.project.classes.SQL.DepositSQL;
import com.student_bank.project.classes.model.Deposit;
import com.student_bank.project.factory.StudentFactory;


@Controller
public class DepositController {
	  IStudentFactory ifactory = new StudentFactory();

    @RequestMapping(value = "/deposit")
    public ModelAndView deposit() {
    	if (GlobalSessionDetails.getInstance().getSession()== false){
			ModelAndView mv = new ModelAndView();
			mv.setViewName("signIn");
			return mv;
		}else
        return new ModelAndView("deposit");
    }

    @RequestMapping(value = "/depositMoney", method = RequestMethod.POST)
    public ModelAndView deposit(@RequestParam int accountID, @RequestParam int depositAmount) throws Exception {

    	if (GlobalSessionDetails.getInstance().getSession()==false){
			ModelAndView mv = new ModelAndView();
			mv.setViewName("signIn");
			return mv;
		}
    	else {
        ModelAndView mv = new ModelAndView();
        System.out.println("--------" + accountID + depositAmount);
        try {
            Deposit deposit = ifactory.makeDeposit();
            DepositSQL depositDB=ifactory.makeDepositDB();
            boolean deposited = deposit.deposit(accountID, depositAmount,depositDB);
            if(deposited){
                mv.setViewName("depositSuccess");
            }
        } catch (Exception e) {
            mv.setViewName("depositUnsuccessful");
            mv.addObject("errorMsg", e.getMessage());
            e.printStackTrace();
        }
        return mv;
    	}
    }
}
