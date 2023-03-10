package com.student_bank.project.Utility.Session;
import com.student_bank.project.Interfaces.Iuser;
import com.student_bank.project.classes.model.User;

public class SessionData {

	private final Iuser user= new User();

	public SessionData(){

	}
	public Iuser getUser() {
		return user;
	}

	public void setUser(Iuser user) {
		this.user.setAccountNo(user.getAccountNo());
		this.user.setEmail(user.getEmail());
		this.user.setFirstName(user.getFirstName());
		this.user.setLastName(user.getLastName());
		this.user.setId(user.getId());
		this.user.setName(user.getName());
		this.user.setPhoneNo(user.getPhoneNo());
		this.user.setUserName(user.getUsername());
	}


}
