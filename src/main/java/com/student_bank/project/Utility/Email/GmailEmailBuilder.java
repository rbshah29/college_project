package com.student_bank.project.Utility.Email;

import java.util.Properties;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

import com.student_bank.project.Interfaces.IEmailBuilder;
import com.student_bank.project.Utility.Constants.StudentBankConstants;

public class GmailEmailBuilder implements IEmailBuilder  {

	  private  String to;
	  private  String cc;
	  private  String bcc;
	  private  String subject;
	  private  String body;
	  private Properties properties;

	@Override
	public GmailEmailBuilder cc(String cc) {
		this.cc=cc;
		return this;
	}

	@Override
	public GmailEmailBuilder bcc(String bcc) {
		this.bcc=bcc;
		return this;
	}

	@Override
	public GmailEmailBuilder subject(String subject) {
		this.subject=subject;
		return this;
	}

	@Override
	public GmailEmailBuilder body(String body) {
		this.body=body;
		return this;
	}
	@Override
	public IEmailBuilder to(String to) {
		this.to=to;
		return this;
	}

	@Override
	public GmailEmailBuilder properties() {
		 Properties properties = System.getProperties();
	     properties.put(StudentBankConstants.SMTP_HOST, StudentBankConstants.SMTP_HOST_ADDRESS );
	     properties.put(StudentBankConstants.SMTP_PORT, StudentBankConstants.SMTP_PORT_ADDRESS);
	     properties.put(StudentBankConstants.SMTP_STARTTLS , StudentBankConstants.TRUE);
	     properties.put(StudentBankConstants.SMTP_AUTH, StudentBankConstants.TRUE);
	     properties.put(StudentBankConstants.SMTP_PROTOCOLS, StudentBankConstants.SMTP_PROTOCOL_USED);
	     properties.put(StudentBankConstants.SMTP_TRUST,StudentBankConstants.SMTP_TRUST_VALUE);
	     this.properties=properties;

	     return this;
	}

	@Override
	public Email build() {
		return new Email( this.to,  this.cc,  this.bcc, StudentBankConstants.FROM,  this.subject,  this.body);
	}

	@Override
	public void send() {


		Email email= build();
		Session session = Session.getInstance(this.properties, new javax.mail.Authenticator() {

            @Override
			protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(StudentBankConstants.FROM, StudentBankConstants.PASS);

            }

        });

		 session.setDebug(true);

	        try {
	            // Create a default MimeMessage object.
	            MimeMessage message = new MimeMessage(session);

	            // Set From: header field of the header.
	            message.setFrom(new InternetAddress(StudentBankConstants.FROM));

	            // Set To: header field of the header.
	            message.addRecipient(Message.RecipientType.TO, new InternetAddress(email.getTo()));

	            // Set Subject: header field
	            message.setSubject(email.getSubject());

	            // Now set the actual message
	            message.setText(email.getBody());


	            // Send message
	            Transport.send(message);

	        } catch (MessagingException mex) {
	            mex.printStackTrace();

	        }
	}




}
