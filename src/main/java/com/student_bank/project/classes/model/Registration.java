package com.student_bank.project.classes.model;

import com.student_bank.project.Interfaces.Iregistration;
import com.student_bank.project.Utility.Constants.StudentBankConstants;

public class Registration implements Iregistration {

	private String userName;
	private String firstName;
	private String lastName;
	private String middleName;
	private String password;
	private String address;
	private String city;
	private String postalCode;
	private String phoneNumber;
	private String dob;

	private String email;
	private String accNo;

	public Registration() {
		userName = "";
		password = "";
		dob = "";
		address = "";
		city = "";
		postalCode = "";
		phoneNumber = "";
		firstName = "";
		lastName = "";
		middleName = "";
		email = "";
		accNo = "";

	}

	public boolean validatePhoneNumberLength() throws Exception {
		if (phoneNumber.length() <= 9) {
			throw new Exception(StudentBankConstants.INVALID_PHONE);

		} else
			return true;
	}

	public boolean validatePhoneNumberIsDigit() throws Exception {
		if (phoneNumber.matches(StudentBankConstants.VALIDATION_DIGIT)) {
			throw new Exception(StudentBankConstants.INVALID_PHONE);
		} else
			return true;
	}

	@Override
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	@Override
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	@Override
	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	@Override
	public void setPass(String pass) {
		this.password = pass;
	}

	@Override
	public void setDOB(String dob) {
		this.dob = dob;
	}

	@Override
	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}

	@Override
	public void setPhoneno(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	@Override
	public void setUser(String userName) {
		this.userName = userName;
	}

	@Override
	public String getUserName() {
		return this.userName;
	}

	@Override
	public String getAddress() {
		return address;
	}

	@Override
	public String getCity() {
		return city;
	}

	@Override
	public String getDob() {
		return dob;
	}

	@Override
	public String getEmail() {
		return email;
	}

	@Override
	public String getFirstName() {
		return firstName;
	}

	@Override
	public String getLastName() {
		return lastName;
	}

	@Override
	public String getMiddleName() {
		return middleName;
	}

	@Override
	public String getPass() {
		return password;
	}

	@Override
	public String getPhoneNumber() {
		return phoneNumber;
	}

	@Override
	public String getPostalCode() {
		return postalCode;
	}

	@Override
	public void setDob(String dob) {
		this.dob = dob;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public boolean validatePasswordContainsDigit() throws Exception {
		if (password.matches(StudentBankConstants.PASSWORD_VALIDATE_DIGIT)) {
			return true;
		} else
			throw new Exception(StudentBankConstants.PASSWORD_NO_DIGIT);

	}

	public boolean validateEmailValid() throws Exception {
		if (email.matches(StudentBankConstants.EMAIL_VALIDATE)) {
			return true;
		} else
			throw new Exception(StudentBankConstants.EMAIL_INVALID);
	}

	public boolean validatePasswordContainsLowercase() throws Exception {
		if (password.matches(StudentBankConstants.PASSWORD_LOWERCASE_VALIDATE)) {
			return true;
		} else
			throw new Exception(StudentBankConstants.PASSWORD_NO_LOWERCASE);
	}

	public boolean validatePasswordContainsUppercase() throws Exception {
		if (password.matches(StudentBankConstants.PASSWORD_UPPERCASE_VALIDATE)) {
			return true;
		} else
			throw new Exception(StudentBankConstants.PASSWORD_NO_UPPERCASE);
	}

	public boolean validatePasswordContainsSpecial() throws Exception {
		if (password.matches(StudentBankConstants.PASSWORD_SPECIAL_VALIDATE)) {
			return true;
		} else
			throw new Exception(StudentBankConstants.PASSWORD_NO_SPECIAL);

	}

	@Override
	public boolean validateAll() throws Exception {
		
			if (validatePasswordContainsSpecial() && validatePasswordContainsUppercase()
					&& validatePasswordContainsLowercase() && validateEmailValid() && validatePasswordContainsDigit()) {
				return true;
			}
		
		return false;
	}

	@Override
	public void setAccNo(String accNo) {
		this.accNo = accNo;

	}

	@Override
	public String getAccNo() {
		return accNo;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}
}
