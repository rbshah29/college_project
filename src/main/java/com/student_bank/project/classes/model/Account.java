package com.student_bank.project.classes.model;

import com.student_bank.project.Interfaces.Iaccount;

public class Account implements Iaccount{

	private String accountNo;
	private String accountName;
	private String accountType;
	private String accountInterest;
	private String accountBalance;

	public Account() {
		accountNo = "";
		accountName = "";
		accountType = "";
		accountInterest="";
		accountBalance = "";
	}

	@Override
	public void setAccountNo(String accountNo) {
		this.accountNo= accountNo;
	}

	@Override
	public void setAccountName(String accountName) {
		this.accountName= accountName;
	}

	@Override
	public void setAccountType(String accountType) {
		this.accountType= accountType;
	}

	@Override
	public void setAccountInterest(String accountInterest) {
		this.accountInterest= accountInterest;
	}

	@Override
	public void setAccountBalance(String accountBalance) {
		this.accountBalance= accountBalance;
	}

	@Override
	public String getAccountNo() {
		return accountNo;
	}

	@Override
	public String getAccountName() {
		return accountName;
	}

	@Override
	public String getAccountType() {
		return accountType;
	}

	@Override
	public String getAccountBalance() {
		return accountBalance;
	}

	@Override
	public String getAccountInterest() {
		return accountInterest;
	}
}
