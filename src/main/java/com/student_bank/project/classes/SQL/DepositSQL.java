package com.student_bank.project.classes.SQL;

import java.sql.Connection;
import java.sql.PreparedStatement;
import com.student_bank.project.Utility.Constants.StudentBankConstants;
import com.student_bank.project.classes.DAO.DepositDAO;
import com.student_bank.project.database.ConnectDatabase;

public class DepositSQL implements DepositDAO{
    public int update(int accountNum, int depositBalance){
        Connection connection = ConnectDatabase.getInstance().getConnection();
        int update_account = 0;

        try{
            PreparedStatement statement = connection.prepareStatement(StudentBankConstants.Deposit_SQL);
            statement.setInt(1, depositBalance);
            statement.setInt(2, accountNum);
            statement.execute();
        }catch(Exception e){
            e.printStackTrace();
        }
        
        return update_account;
    }
}
