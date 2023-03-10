package com.student_bank.project.Interfaces;

import com.student_bank.project.Utility.Email.Email;

public interface IEmailBuilder {

   IEmailBuilder to(String to);

   IEmailBuilder cc(String cc);

   IEmailBuilder bcc(String bcc);

   IEmailBuilder subject(String subject);

   IEmailBuilder body(String body);

   IEmailBuilder properties();

   Email build();

   void send();
}