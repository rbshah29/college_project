package com.student_bank.project;

import java.util.List;

import com.student_bank.project.Interfaces.Iregistration;
import com.student_bank.project.Interfaces.Iuser;
import com.student_bank.project.classes.DAO.RegistrationDAO;
import com.student_bank.project.classes.DAO.UserDAO;
import com.student_bank.project.classes.model.User;

public class MockDatabase implements RegistrationDAO, UserDAO{

	private String lastName = "ade";
	private String firstName = "deji";
	private String password="Ade@1250";
	private String cred= "YWRlQWRlQDEyNTA=";
	private String dob= "25/10/1943";
	private String middleName ="ayo";
	private String address = "1234 Gottigen Street";
	private String city = "Halifax";
	private String postalCode = "B3k3r4";
	private String phoneNumber= "7821232345";
	private String email= "test@email.com";
	private String userName = "Adedeji";
	private Iregistration registration;
	private String accBalance = "1000";
	private String accInterest= "1.5";
	private String accType= "checking";
	private String accNo= "2345";
	private User user;








	public void setPassNodigits(){
		password = "adewere";
	}

	@Override
	public boolean registerUser(Iregistration iregistration) {
		iregistration.setCity(city);
		iregistration.setDOB(dob);
		iregistration.setEmail(email);
		iregistration.setFirstName(firstName);
		iregistration.setLastName(lastName);
		iregistration.setMiddleName(middleName);
		iregistration.setPass(password);
		iregistration.setPhoneno(phoneNumber);
		iregistration.setPostalCode(postalCode);
		iregistration.setUser(userName);
		this.setRegistration(iregistration);
		return true;
	}

	public Iregistration getRegistration() {
		return registration;
	}

	public void setRegistration(Iregistration iregistration) {
		this.registration = iregistration;
	}

	


	
	@Override
	public List<Iuser> findAll() {
		return null;
	}

	

	

	

	@Override
	public Iuser findById(int id) {
		return null;
	}

	@Override
	public Iuser getUserByNameAndPassword(String username, String password) {
		return null;
	}

	@Override
	public boolean updateUser(Iuser user) {
		return false;
	}

	@Override
	public boolean deleteUser(Iuser user) {
		return false;
	}

	public void createUser(User user) {
		user.setAccountNo(accNo);
		user.setFirstName(firstName);
		user.setEmail(email);
		user.setLastName(lastName);
		user.setPassword(password);
		user.setLastName(lastName);
		user.setUsername(userName);
		user.setPhoneNo(phoneNumber);
		this.setUser(user);
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

}

