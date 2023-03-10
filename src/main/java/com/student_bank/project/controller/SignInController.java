package com.student_bank.project.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.student_bank.project.Interfaces.IStudentFactory;
import com.student_bank.project.Interfaces.Iuser;
import com.student_bank.project.factory.StudentFactory;

@Controller

public class SignInController {

	Iuser user;

	@SuppressWarnings("finally")
	@RequestMapping(value="/signIn", method = RequestMethod.POST)
	public ModelAndView signInPage(@RequestParam(required=false)  String userName, @RequestParam(required=false) String password ) {
		ModelAndView mv = new ModelAndView();
		try {
			
			
			IStudentFactory factory = new StudentFactory();
			user= factory.makesignedInUser(factory.makeUser(),userName,  password);
			mv.addObject("user", user );
			mv.addObject("account", factory.makeLoggedInUserAccount(user));
			mv.setViewName("dashboard");

		
		}
		catch(Exception e){
			mv.addObject("errorMsg", e.getMessage());
			mv.setViewName("signInError");
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
		finally {
			return mv;
		}
	}



	@RequestMapping(value="signIn", method = RequestMethod.GET)
	public ModelAndView signInPage() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("signIn");
		return mv;
	}

}
