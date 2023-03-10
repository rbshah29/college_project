package com.student_bank.project.Utility.Email;

import com.student_bank.project.Interfaces.IEmailBuilder;
import com.student_bank.project.Utility.Constants.StudentBankConstants;

public class EmailDirector {

	public void sendRegistrationMessage(IEmailBuilder emailbuilder, String to ) {
		emailbuilder.subject(StudentBankConstants.REGISTER_EMAIL_SUBJECT)
		.to(to)
		.body(StudentBankConstants.REGISTER_EMAIL_BODY)
		.properties()
		.send();
	}

	public void sendSignInNotification(IEmailBuilder emailbuilder, String to ) {
		emailbuilder.subject(StudentBankConstants.SIGNIN_EMAIL_SUBJECT)
		.to(to)
		.body(StudentBankConstants.SIGNIN_EMAIL_BODY)
		.properties()
		.send();

	}

}
