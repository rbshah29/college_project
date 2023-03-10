package com.student_bank.project.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import com.student_bank.project.Utility.Session.GlobalSessionDetails;

@Controller
public class LogoutController {
	@RequestMapping(value="/logout")
    public ModelAndView logout(){
		GlobalSessionDetails.getInstance().endSession();
		ModelAndView mv = new ModelAndView();
		mv.setViewName("welcome");
        return mv;
    }
}

    

