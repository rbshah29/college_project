package com.student_bank.project.factory;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.Properties;
import com.student_bank.project.Interfaces.IStudentFactory;
import com.student_bank.project.Interfaces.Iaccount;
import com.student_bank.project.Interfaces.Iuser;
import com.student_bank.project.Utility.Constants.StudentBankConstants;
import com.student_bank.project.Utility.Email.EmailDirector;
import com.student_bank.project.Utility.Email.GmailEmailBuilder;
import com.student_bank.project.Utility.Session.GlobalSessionDetails;
import com.student_bank.project.Utility.account.CreateAccount;
import com.student_bank.project.classes.DAO.AccountDAO;
import com.student_bank.project.classes.DAO.RegistrationDAO;
import com.student_bank.project.classes.DAO.UserDAO;
import com.student_bank.project.classes.SQL.AccountSQL;
import com.student_bank.project.classes.SQL.DepositSQL;
import com.student_bank.project.classes.SQL.RegistrationSQL;
import com.student_bank.project.classes.SQL.TransactionSQL;
import com.student_bank.project.classes.SQL.TransactionHistorySQL;
import com.student_bank.project.classes.SQL.UserSQL;
import com.student_bank.project.classes.model.Account;
import com.student_bank.project.classes.model.Deposit;
import com.student_bank.project.classes.model.Transaction;
import com.student_bank.project.classes.model.TransactionHistory;
import com.student_bank.project.classes.model.User;

public class StudentFactory implements IStudentFactory {

	@Override
	public Iaccount makeAccount() {
		return new Account();
	}

	@Override
	public Iuser makeUser() {
		return new User();
	}

	@Override
	public RegistrationDAO makeRegistrationSQL() {
		return new RegistrationSQL();
	}

	@Override
	public AccountDAO makeAccountSQL() {
		return new AccountSQL(new Account());
	}

	@Override
	public CreateAccount createAccount(String name) {
		return new CreateAccount(name);
	}

	@Override
	public GmailEmailBuilder makeGmailEmailBuilder() {
		return new GmailEmailBuilder();
	}

	@Override
	public EmailDirector makeEmailDirector() {
		return new EmailDirector();
	}

	@Override
	public UserDAO makeUserSQL(User user) {
		return new UserSQL(user);
	}

	@Override
	public Iuser makesignedInUser(Iuser user, String name, String password) {
		try {
			user = new UserSQL(user).getUserByNameAndPassword(name, password);
			if (user != null) {
				GlobalSessionDetails.getInstance().setUser(user);
			}
		} catch (Exception e) {
			e.getMessage();
		}
		return user;
	}

	@Override
	public Iuser currentUser() {

		return GlobalSessionDetails.getInstance().getUser();
	}

	@Override
	public Iaccount makeLoggedInUserAccount(Iuser user) throws Exception {
		Iaccount account = new AccountSQL(new Account()).findById(user.getAccountNo());
		if (account != null) {
			GlobalSessionDetails.getInstance().startSession();
			return account;

		} else
			throw new Exception(StudentBankConstants.LOGIN_FAIL);

	
	}

	@Override
	public Properties makeProperties() {

		return new Properties();
	}

	@Override
	public InputStream makeFileInputStream(String string) throws FileNotFoundException {

		return new FileInputStream(string);
	}

	@Override
	public TransactionSQL makeTransactionDB() {
		return new TransactionSQL();
	}

	@Override
	public Deposit makeDeposit() {
		return new Deposit();
	}

	@Override
	public DepositSQL makeDepositDB() {
		return new DepositSQL();
	}

	@Override
	public TransactionHistorySQL makeTransactionHistoryDB() {
		return new TransactionHistorySQL();
	}

	@Override
	public TransactionHistory makeTransactionHistory() {
		return new TransactionHistory();
	}

	@Override
	public Transaction makeTransaction() {
		return new Transaction();
	}

}
