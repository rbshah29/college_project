package com.student_bank.project.classes.DAO;


import java.util.List;

import com.student_bank.project.Interfaces.Iaccount;

public interface AccountDAO {
	Iaccount findById(String id) throws Exception;
	List<Iaccount> findAll() throws Exception;
	boolean updateAccount(Iaccount account);
	boolean deleteAccount(Iaccount account);
	boolean createAccount(Iaccount account);

	}



