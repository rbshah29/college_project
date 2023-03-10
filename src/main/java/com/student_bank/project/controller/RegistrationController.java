package com.student_bank.project.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.student_bank.project.Interfaces.IStudentFactory;
import com.student_bank.project.Interfaces.Iaccount;
import com.student_bank.project.Utility.account.CreateAccount;
import com.student_bank.project.classes.model.Registration;
import com.student_bank.project.factory.StudentFactory;

@Controller
public class RegistrationController {
	IStudentFactory factory = new StudentFactory();
	Iaccount account;

	@SuppressWarnings("finally")
	@RequestMapping(value="/registration_sub")
	public ModelAndView registerPage(@ModelAttribute("registration") Registration registration ) {
		ModelAndView mv = new ModelAndView();

		try {
			if (registration.validateAll()) {	
			createAccount(registration.getFirstName());
			register(registration);
			sendEmail(registration.getEmail(), factory);
			mv.setViewName("registration_complete");
			mv.addObject("registration", registration);
			}
		}catch(Exception e) {
			mv.setViewName("registrationError");
            mv.addObject("errorMsg", e.getMessage());
		}
		finally{
			return mv;
		}

	}

	private void register(Registration registration) {
		registration.setAccNo(account.getAccountNo());
		factory.makeRegistrationSQL().registerUser(registration);
		factory.makeAccountSQL().createAccount(account);		
	}

	private void createAccount(String firstName) {
		CreateAccount createAccount = factory.createAccount(firstName);
		account = factory.makeAccount();
		account=createAccount.getAccount();
	
	}

	private void sendEmail(String email, IStudentFactory factory) {
		
		factory.makeEmailDirector().sendRegistrationMessage(factory.makeGmailEmailBuilder(), email);;
				
		
	}

	@RequestMapping("registration")
	public ModelAndView signInPage() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("registration");
		return mv;
	}



}