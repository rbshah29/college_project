package com.student_bank.project.Utility.Constants;

public class StudentBankConstants {
	public static final String ACCOUNT_UPDATE= "UPDATE account SET accName=?, accInt=?, accBal=?, accType=? WHERE accNo=?";
	public static final String ACCOUNT_DELETE= "DELETE FROM account WHERE accNo=?";
	public static final String ACCOUNT_CREATE= "INSERT INTO account(accNo, accBal, accInt, accType, accName) VALUES (?, ?, ?, ?, ?)";
	public static final String ACCOUNT_SELECT_ALL="SELECT * FROM account";
	public static final String ACCOUNT_SELECT="SELECT * FROM account WHERE accNo=?";
	public static final String REGISTRATION_CREATE="INSERT INTO registration (fName, lName, mName, uName, email, address, city, dob, phone, po) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
	public static final String USER_CREATE="INSERT INTO user (fName, lName, uName, password, email, phone, accNo ) VALUES ( ?, ?, ?, ?, ?, ?, ?)";
	public static final String USER_SELECT="SELECT * FROM user WHERE id=?";
	public static final String USER_SELECT_ALL="SELECT * FROM user";
	public static final String USER_UPDATE=	"UPDATE user SET fName=?, lName=?, accNo=? WHERE id=?";
	public static final String USER_DELETE="DELETE FROM user WHERE id=?";
	public static final String USER_LOGIN=	"SELECT * FROM user WHERE uName=? AND password=?";
	public static final String FROM= "dalhtest@gmail.com";
	public static final String PASS = "iobjhejbfzxlfdux";
	public static final String SMTP_HOST = "mail.smtp.host";
	public static final String SMTP_HOST_ADDRESS = "smtp.gmail.com";
	public static final String SMTP_PORT = "mail.smtp.port";
	public static final String SMTP_PORT_ADDRESS = "587";
	public static final String SMTP_STARTTLS = "mail.smtp.starttls.enable";
	public static final String TRUE = "true";
	public static final String SMTP_AUTH = "mail.smtp.auth";
	public static final String SMTP_PROTOCOLS = "mail.smtp.ssl.protocols";
	public static final String SMTP_PROTOCOL_USED="TLSv1.2";
	public static final String SMTP_TRUST="mail.smtp.ssl.trust";
	public static final String SMTP_TRUST_VALUE="*";
	public static final String VALIDATION_DIGIT="\\D";
	public static final String INVALID_PHONE="Please include valid phone number";
	public static final String PASSWORD_NO_DIGIT="Password has no digits";
	public static final String PASSWORD_NO_LOWERCASE="Please include at least one Lowercase character in password";
	public static final String PASSWORD_NO_UPPERCASE="Please include at least one Uppercase character in password";
	public static final String PASSWORD_NO_SPECIAL="Please include at least one Special character in password";
	public static final String EMAIL_INVALID="email invalid";
	public static final String PASSWORD_VALIDATE_DIGIT=".*[0-9].*";
	public static final String EMAIL_VALIDATE="^(.+)@(.+)$";
	public static final String PASSWORD_LOWERCASE_VALIDATE=".*[a-z].*";
	public static final String PASSWORD_UPPERCASE_VALIDATE	=".*[A-Z].*";
	public static final String PASSWORD_SPECIAL_VALIDATE=".*[!@#$%&*()_+=|<>?{}\\[\\]~-].*";
	public static final String REGISTER_EMAIL_BODY="We would like to thank you for joining our Bank, here's a coupon for PizzaPizza to celebrate you!!! Coupon:WER23WR";
	public static final String REGISTER_EMAIL_SUBJECT="Welcome to Student Bank";
	public static final String SIGNIN_EMAIL_SUBJECT="Login to Student Bank";
	public static final String SIGNIN_EMAIL_BODY="We would like to notify you of a login to our Bank platform with your account. Call 234 if this was not you";
	public static final String PROPERTIES_PATH_DB="src/main/java/com/student_bank/project/database/dbConfig.properties";
	public static final Object SECURE = "SECURE_MODE";
	public static final String Deposit_SQL = "UPDATE account SET accBal = ? where accNo= ?";
	public static final String TransactionHistory_SQL = "SELECT * FROM TransactionHistory where SourceAccount = ? ";
	public static final String Transaction_SQL =  "SELECT accNo FROM user where id=?";
	public static final String LOGIN_FAIL = "Invalid User name or Password";
	public static final String LOGIN_FAIL_SQL = "SQL Error in DB please investigate";



}
