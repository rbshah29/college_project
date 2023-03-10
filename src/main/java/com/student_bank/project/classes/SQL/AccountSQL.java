package com.student_bank.project.classes.SQL;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import com.student_bank.project.Interfaces.Iaccount;
import com.student_bank.project.Utility.Constants.StudentBankConstants;
import com.student_bank.project.classes.DAO.AccountDAO;
import com.student_bank.project.database.ConnectDatabase;

public class AccountSQL implements AccountDAO {

	Iaccount account;

	Connection connection = ConnectDatabase.getInstance().getConnection();

	public AccountSQL(Iaccount account) {
		this.account = account;
	}

	@Override
	public Iaccount findById(String id) throws Exception {
			PreparedStatement ps = connection.prepareStatement(StudentBankConstants.ACCOUNT_SELECT);
			ps.setString(1, id);
			ResultSet rs = ps.executeQuery();
			if(rs.next())
			{

				account.setAccountNo(rs.getString("accNo"));
				account.setAccountBalance(rs.getString("accBal"));
				account.setAccountInterest(rs.getString("accInt"));
				account.setAccountType(rs.getString("accType"));
				account.setAccountName(rs.getString("accName"));


				return account;
			}
			else
			throw new Exception(StudentBankConstants.LOGIN_FAIL);
	}

	@Override
	public List<Iaccount> findAll() throws Exception {

		List<Iaccount> accounts = new ArrayList<>();

		PreparedStatement ps = connection.prepareStatement(StudentBankConstants.ACCOUNT_SELECT_ALL);
		ResultSet rs = ps.executeQuery();
		if (rs.next()) {
			while (rs.next()) {
				account.setAccountNo(rs.getString("accNo"));
				account.setAccountBalance(rs.getString("accBal"));
				account.setAccountInterest(rs.getString("accInt"));
				account.setAccountType(rs.getString("accType"));
				account.setAccountName(rs.getString("accName"));
				accounts.add(account);
			}
			return accounts;
		} else
			throw new Exception(StudentBankConstants.LOGIN_FAIL);
	}

	@Override
	public boolean createAccount(Iaccount account) {
		int check = 0;
		try {
			PreparedStatement ps = connection.prepareStatement(StudentBankConstants.ACCOUNT_CREATE);
			System.out.println(check + "g");
			ps.setString(1, account.getAccountNo());
			ps.setString(2, account.getAccountBalance());
			ps.setString(3, account.getAccountInterest());
			ps.setString(5, account.getAccountName());
			ps.setString(4, account.getAccountType());
			check = ps.executeUpdate();
			if (check == 1) {
				return true;
			}

		} catch (SQLException ex) {
			ex.printStackTrace();
		}
		return false;
	}

	@Override
	public boolean updateAccount(Iaccount account) {
		int check = 0;
		try {
			PreparedStatement ps = connection.prepareStatement(StudentBankConstants.ACCOUNT_UPDATE);
			ps.setString(1, account.getAccountName());
			ps.setString(2, account.getAccountInterest());
			ps.setString(3, account.getAccountBalance());
			ps.setString(4, account.getAccountType());
			ps.setString(5, account.getAccountNo());
			check = ps.executeUpdate();
			if (check == 1) {
				return true;
			}
		} catch (SQLException ex) {
			ex.printStackTrace();
		}
		return false;
	}

	@Override
	public boolean deleteAccount(Iaccount account) {
		int check = 0;
		try {
			PreparedStatement ps = connection.prepareStatement(StudentBankConstants.ACCOUNT_DELETE);
			ps.setString(1, account.getAccountNo());
			check = ps.executeUpdate();
			if (check == 1) {
				return true;
			}
		} catch (SQLException ex) {
			ex.printStackTrace();
		}
		return false;
	}

}
