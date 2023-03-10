package com.student_bank.project.classes.SQL;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.Date;
import com.student_bank.project.Utility.Constants.StudentBankConstants;
import com.student_bank.project.classes.DAO.TransactionHistoryDAO;
import com.student_bank.project.database.ConnectDatabase;

public class TransactionHistorySQL implements TransactionHistoryDAO{
    Connection connection = ConnectDatabase.getInstance().getConnection();
    static Date date = new Date();
    public List<String> transactionHistoryData(int accountNumber) {
        List<String> tranData = new ArrayList<>();
        try {
            PreparedStatement statement = connection.prepareStatement(StudentBankConstants.TransactionHistory_SQL);
            statement.setInt(1, accountNumber);
            statement.execute();
            ResultSet RS = statement.executeQuery();
            	tranData =convertResponse(RS);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return tranData;
    }
    
    public static List<String> convertResponse (ResultSet rs){ 
        List<String> tranData = new ArrayList<>();
        String stringdata ="";
        try{
            while (rs.next()) {
                String source = rs.getString("SourceAccount");
                String destination = rs.getString("DestinationAccount");
                String totalAmount = rs.getString("TransferAmount");
                String dateInserted = rs.getString("Date_Created");
                stringdata = "From Account Number "+source + " To Account Number  " + destination + " Transaction Amount was " + totalAmount + " on " + dateInserted;
                tranData.add(stringdata);
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        return tranData;
    }
  
    
}
