package com.student_bank.project.transactionHistory;

import java.util.ArrayList;
import java.util.List;

import com.student_bank.project.classes.DAO.TransactionHistoryDAO;

public class TransactionHistoryDBMock implements TransactionHistoryDAO{
    List<String> accNum= new ArrayList<>();
    public TransactionHistoryDBMock(){
        accNum.add("1234");
    }
    public List<String> transactionHistoryData(int accnum){
        if (accnum == 1){
            return accNum;
        }else{
            return accNum;
        }
    }
}
