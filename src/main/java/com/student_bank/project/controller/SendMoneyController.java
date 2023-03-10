package com.student_bank.project.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.student_bank.project.Utility.Session.GlobalSessionDetails;

@Controller
public class SendMoneyController {
    @RequestMapping(value="/send_money")
    public ModelAndView payment(){
    	ModelAndView mv = new ModelAndView();
		if (GlobalSessionDetails.getInstance().getSession()){
			mv.setViewName("sendMoney");
			
		}
		else {
			mv.setViewName("signIn");
		}
		return mv;
	}
    
}
