package com.student_bank.project.Utility.account;


import java.util.Random;

import com.student_bank.project.Interfaces.ICreateAccount;
import com.student_bank.project.Interfaces.IStudentFactory;
import com.student_bank.project.Interfaces.Iaccount;
import com.student_bank.project.factory.StudentFactory;

public class CreateAccount implements ICreateAccount{
	  IStudentFactory ifactory = new StudentFactory();

	String name;
	private Iaccount account = ifactory.makeAccount();
	public CreateAccount(String name){
		this.name = name;
	}

	@Override
	public String createAccountNo() {
		Random rand = new Random(System.currentTimeMillis());
		int [] accountArray =  new int[5];
		for (int i = 0; i< 5; i++) {
			accountArray[i] = rand.nextInt(10);
		}

		StringBuilder disp = new StringBuilder();
		for (int i: accountArray) {
			disp.append(i);
		}

		//Refactoring INLINE TEMP
		return disp.toString();
	}
	@Override
	public String setAccountType() {
		String type = "checking";
		return type;
	}
	@Override
	public String setAccountBalance() {
		String bal = "1000.00";
		return bal;
	}
	@Override
	public String setAccountInterest() {
		String interest = "1.5";
		return interest;
	}
	@Override
	public String setAccountName(String accountName) {
		return accountName;
	}
	@Override
	public Iaccount getAccount() {
		account.setAccountNo(createAccountNo());
		account.setAccountBalance(setAccountBalance());
		account.setAccountInterest(setAccountInterest());
		account.setAccountType(setAccountType());
		account.setAccountName(name);
		return account;
	}




}
