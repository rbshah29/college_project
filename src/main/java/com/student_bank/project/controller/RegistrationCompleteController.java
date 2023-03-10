package com.student_bank.project.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class RegistrationCompleteController {

	@RequestMapping(value="/registration_complete")
	public ModelAndView registrationComplete() {
        ModelAndView mv = new ModelAndView("registration_complete");

		return mv;
	}
}
