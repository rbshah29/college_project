package com.student_bank.project.classes.DAO;

import java.sql.SQLException;
import java.util.List;

import com.student_bank.project.Interfaces.Iuser;


public interface UserDAO {
	Iuser findById(int id) throws SQLException;
	List<Iuser> findAll() throws SQLException;
	Iuser getUserByNameAndPassword(String username, String password) throws SQLException;
	boolean updateUser(Iuser user);
	boolean deleteUser(Iuser user);
}
