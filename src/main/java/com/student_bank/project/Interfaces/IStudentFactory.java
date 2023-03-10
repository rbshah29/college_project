package com.student_bank.project.Interfaces;

import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.Properties;

import com.student_bank.project.Utility.Email.EmailDirector;
import com.student_bank.project.Utility.Email.GmailEmailBuilder;
import com.student_bank.project.Utility.account.CreateAccount;
import com.student_bank.project.classes.DAO.AccountDAO;
import com.student_bank.project.classes.DAO.RegistrationDAO;
import com.student_bank.project.classes.DAO.UserDAO;
import com.student_bank.project.classes.SQL.DepositSQL;
import com.student_bank.project.classes.SQL.TransactionSQL;
import com.student_bank.project.classes.SQL.TransactionHistorySQL;
import com.student_bank.project.classes.model.Deposit;
import com.student_bank.project.classes.model.Transaction;
import com.student_bank.project.classes.model.TransactionHistory;
import com.student_bank.project.classes.model.User;

public interface IStudentFactory {
		public Iuser currentUser();
		Iuser makeUser();
		Iaccount makeAccount();
		RegistrationDAO makeRegistrationSQL();
		AccountDAO makeAccountSQL();
		CreateAccount createAccount(String name);
		GmailEmailBuilder makeGmailEmailBuilder();
		EmailDirector makeEmailDirector();
		UserDAO makeUserSQL(User user);
		Iuser makesignedInUser(Iuser user, String name, String password);
		public Iaccount makeLoggedInUserAccount(Iuser user) throws Exception;
		public Properties makeProperties();
		public InputStream makeFileInputStream(String string) throws FileNotFoundException;
		public TransactionSQL makeTransactionDB();
		public Deposit makeDeposit();
		public DepositSQL makeDepositDB();
		public TransactionHistorySQL makeTransactionHistoryDB();
		public TransactionHistory makeTransactionHistory();
		public Transaction makeTransaction();
}
