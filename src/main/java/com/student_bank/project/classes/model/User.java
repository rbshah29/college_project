package com.student_bank.project.classes.model;

import java.util.Base64;

import com.student_bank.project.Interfaces.Iuser;


public class User implements Iuser{

	private String firstName;
	private String lastName;
	private String username;
	private String password;
	private String email;
	private int id;
	private String accountNo;
	private String role;
	private String phoneNo;



	public User() {

		this.firstName = "";
		this.lastName = "";
		this.username = "";
		this.password = "";
		this.email = "";
		this.id = 0;
		this.accountNo = "";
		this.role = "";
		this.phoneNo = "";
	}

	@Override
	public void setId(int id) {
		this.id = id;
	}

	@Override
	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}

	@Override
	public String getUserName() {
		return username;
	}

	@Override
	public int getId() {
		return id;
	}

	@Override
	public String getAccountNo() {
		return accountNo;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	@Override
	public void setUserName(String userName) {
		this.username = userName;
	}

	@Override
	public String getEmail() {
		return email;
	}

	@Override
	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String getName() {
		return lastName;
	}

	@Override
	public void setName(String lastName) {
		this.lastName = lastName;
	}

	@Override
	public String getFirstName() {
		return firstName;
	}

	@Override
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	@Override
	public String getLastName() {
		return lastName;
	}

	@Override
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	@Override
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	@Override
	public String getPassword() {
		return password;
	}

	@Override
	public String getPhoneNo() {
		return phoneNo;
	}

	@Override
	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}
	
	public  String credEncode(){
        String cred = username+password;
        String encodedCred = Base64.getEncoder().encodeToString(cred.getBytes());

        return encodedCred;
    }

}
