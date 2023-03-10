package com.student_bank.project.classes.SQL;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.student_bank.project.Interfaces.Iregistration;
import com.student_bank.project.Utility.Constants.StudentBankConstants;
import com.student_bank.project.classes.DAO.RegistrationDAO;
import com.student_bank.project.database.ConnectDatabase;

public class RegistrationSQL implements RegistrationDAO{


	 Connection connection  = ConnectDatabase.getInstance().getConnection();

	@Override
	public boolean registerUser(Iregistration registration) {
		int check1 =0;
		int check2=0;

		try {

            PreparedStatement ps = connection.prepareStatement(StudentBankConstants.REGISTRATION_CREATE);
            ps.setString(1, registration.getFirstName());
            ps.setString(2, registration.getLastName());
            ps.setString(3, registration.getMiddleName());
            ps.setString(4, registration.getUserName());
            ps.setString(5, registration.getEmail());
            ps.setString(6, registration.getAddress());
            ps.setString(7, registration.getCity());
            ps.setString(8, registration.getDob());
            ps.setString(9, registration.getPhoneNumber());
            ps.setString(10, registration.getPostalCode());

            check1 = ps.executeUpdate();




        } catch (SQLException ex) {
            ex.printStackTrace();
        }

		try {

            PreparedStatement ps = connection.prepareStatement(StudentBankConstants.USER_CREATE);

            ps.setString(1, registration.getFirstName());
            ps.setString(2, registration.getLastName());
            ps.setString(3, registration.getUserName());
            ps.setString(4, registration.getPass());
            ps.setString(5, registration.getEmail());
            ps.setString(6, registration.getPhoneNumber());
            ps.setString(7, registration.getAccNo());

            check2 = ps.executeUpdate();




        } catch (SQLException ex) {
            ex.printStackTrace();
        }


		if(check1 == 1 && check2 ==1)
        {

            return true;
        }

		return false;
	}

}
