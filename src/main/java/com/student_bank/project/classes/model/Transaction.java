package com.student_bank.project.classes.model;

import com.student_bank.project.Interfaces.IStudentFactory;
import com.student_bank.project.classes.SQL.TransactionSQL;
import com.student_bank.project.factory.StudentFactory;

public class Transaction {
	  IStudentFactory ifactory = new StudentFactory();

    public boolean transactions(int sAcc,int dAcc,int tAmount) throws Exception{
        TransactionSQL transactionDB = ifactory.makeTransactionDB();
        int sAccNumber = transactionDB.fetch(sAcc);
        int sAccBalance = transactionDB.fetchBalance(sAccNumber);
        int dAccNumber = transactionDB.fetch(dAcc);
        int dAccBalance = transactionDB.fetchBalance(dAccNumber);

        if(sAccNumber>=tAmount){
            int updatedsAcc = sAccBalance - tAmount;
            int updateddAcc = dAccBalance + tAmount;
    
            transactionDB.update(updateddAcc, sAccNumber);
            transactionDB.update(updatedsAcc, dAccNumber);
        }else{

            throw new Exception("Insufficient Balance");
        }       
        return true;
    }

    public boolean TransactionHistory(int sAccount, int dAccount, int totalAmount) {
        TransactionSQL transactionDB = ifactory.makeTransactionDB();
        transactionDB.transactionHistory(sAccount,dAccount,totalAmount);
        return true;
    }

    

}
