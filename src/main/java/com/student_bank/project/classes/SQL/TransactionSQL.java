package com.student_bank.project.classes.SQL;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import com.student_bank.project.Interfaces.ITransaction;
import com.student_bank.project.Utility.Constants.StudentBankConstants;
import com.student_bank.project.database.ConnectDatabase;


public class TransactionSQL implements ITransaction {
   
    Connection connection = ConnectDatabase.getInstance().getConnection();

    public int fetch(int acc) throws Exception{
        int getAccNum = 0;
        
            PreparedStatement statement = connection.prepareStatement(StudentBankConstants.Transaction_SQL);
            statement.setInt(1, acc);
            System.out.println(statement.toString());
            ResultSet resultSet = statement.executeQuery();
            if(resultSet.next()){
                getAccNum = resultSet.getInt("accNo");
            }else{
                throw new Exception("Account Not Found "+acc);
            }
        return getAccNum;
    }

    public int fetchBalance(int accNum) throws Exception{
        int balance = 0;
        
            String sql = "SELECT accBal FROM account where accNo=?";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setInt(1, accNum);
            System.out.println(statement.toString());
            ResultSet resultSet = statement.executeQuery();
            if(resultSet.next()){
                balance = resultSet.getInt("accBal");
            }else{
                throw new Exception("Account Not Found "+accNum);
            }
        return balance;
    }

    public int update(int updateAcc, int AccNum){
        int update_account = 0;
        try{
            String sql = "UPDATE account SET accBal = ? where accNo= ?";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setInt(1, updateAcc);
            statement.setInt(2, AccNum);  
            statement.execute();
        }catch(Exception e){
            e.printStackTrace();
        }
        return update_account;
    }

    public int transactionHistory(int sAccNumber,int dAccNumber, int tAmount){
        int update_account = 0;
        try{
            String sql = "INSERT INTO TransactionHistory (SourceAccount, DestinationAccount, TransferAmount) VALUES (? ,? ,?);";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setInt(1, sAccNumber);
            statement.setInt(2, dAccNumber);
            statement.setInt(3, tAmount);
            statement.execute();
        }catch(Exception e){
            e.printStackTrace();
        }
        return update_account;
    }

}
