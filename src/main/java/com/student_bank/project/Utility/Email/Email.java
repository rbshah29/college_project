package com.student_bank.project.Utility.Email;

public class Email {

		  private  String to;
		  private  String cc;
		  private  String bcc;
		  private  String from;
		  private  String subject;
		  private  String body;






		  public Email(String to, String cc, String bcc, String from, String subject, String body) {

			this.to = to;
			this.cc = cc;
			this.bcc = bcc;
			this.from = from;
			this.subject = subject;
			this.body = body;
		}

		public String getFrom() {
			  return from;
		  }
		  public String getCc() {
			  return cc;
		  }
		  public String getBcc() {
			  return bcc;
		  }
		  public String getSubject() {
			  return subject;
		  }

		  public String getBody() {
			  return body;
		  }


		  public void setTo(String to) {
			this.to = to;
		}

		public void setCc(String cc) {
			this.cc = cc;
		}

		public void setBcc(String bcc) {
			this.bcc = bcc;
		}

		public void setFrom(String from) {
			this.from = from;
		}

		public void setSubject(String subject) {
			this.subject = subject;
		}

		public void setBody(String body) {
			this.body = body;
		}

		public String getTo() {
			  return to;
		  }



}


