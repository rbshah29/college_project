package com.student_bank.project.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.student_bank.project.Utility.Session.GlobalSessionDetails;

@Controller
public class PaymentController {
    @RequestMapping(value="/payment")
    public ModelAndView payment(){
    	ModelAndView mv = new ModelAndView();
		if (GlobalSessionDetails.getInstance().getSession()){
			mv.setViewName("payment");
		}
		else {
			mv.setViewName("signIn");
		}
		return mv;
    }
}