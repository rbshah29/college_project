package com.student_bank.project.classes.SQL;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.student_bank.project.Interfaces.Iuser;
import com.student_bank.project.Utility.Constants.StudentBankConstants;
import com.student_bank.project.classes.DAO.UserDAO;
import com.student_bank.project.database.ConnectDatabase;

public class UserSQL implements UserDAO{

	Connection connection;
	Iuser user;

	public UserSQL(Iuser user){

		this.user = user;
		this.connection  = ConnectDatabase.getInstance().getConnection();
	}


	@Override
	public Iuser findById(int id) throws SQLException {
	            PreparedStatement ps = connection.prepareStatement(StudentBankConstants.USER_SELECT);
	            ps.setInt(1, id);
	            ResultSet rs = ps.executeQuery();
	            if(rs.next())
	            {


	                user.setId(rs.getInt("id"));
	                user.setName( rs.getString("name") );
	                user.setEmail(rs.getString("email"));
	                user.setUserName(rs.getString("uName"));
	                user.setAccountNo(rs.getString("accNo"));

	                return user;
	            }

	            else 
	            	throw new SQLException();
		 
		
	}

	@Override
	public List<Iuser> findAll() throws SQLException {
			List<Iuser> users = new ArrayList<>();
            PreparedStatement ps = connection.prepareStatement(StudentBankConstants.USER_SELECT_ALL);
            ResultSet rs = ps.executeQuery();
            if(rs.next()) {
            while(rs.next())
            {

                user.setId(rs.getInt("id"));
                user.setName( rs.getString("name") );
                user.setEmail(rs.getString("email"));
                user.setUserName(rs.getString("uName"));
                user.setAccountNo(rs.getString("accNo"));
                users.add(user);

            }
            return users;
            }
         
        else 
        	throw new SQLException();
	}

	
	public boolean updateUser(Iuser user) {
	int check =0;

		try {

            PreparedStatement ps = connection.prepareStatement(StudentBankConstants.USER_UPDATE);
            ps.setString(1, user.getFirstName());
            ps.setString(1, user.getLastName());
            ps.setString(3, user.getAccountNo());
            ps.setInt(4, user.getId());
            check = ps.executeUpdate();
            if(check == 1)
            {

                return true;
            }

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
		return false;

	}

	@Override
	public boolean deleteUser(Iuser user) {
		int check =0;

		try {

            PreparedStatement ps = connection.prepareStatement(StudentBankConstants.USER_DELETE);
            ps.setInt(1, user.getId());
            check = ps.executeUpdate();
            if(check == 1)
            {

                return true;
            }

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
		return false;
	}

	@Override
	public Iuser getUserByNameAndPassword(String username, String password ) throws SQLException {
	        PreparedStatement ps = connection.prepareStatement(StudentBankConstants.USER_LOGIN);
	        ps.setString(1, username);
	        ps.setString(2, password);
	        ResultSet rs = ps.executeQuery();

	        if(rs.next())
	        {
                user.setId(rs.getInt("id"));
                user.setName( rs.getString("fName") );
                user.setEmail(rs.getString("email"));
                user.setUserName(rs.getString("uName"));
                user.setAccountNo(rs.getString("accNo"));
                return user;

	        }

       else 
       	throw new SQLException();
	}

}
