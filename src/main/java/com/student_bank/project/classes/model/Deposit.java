package com.student_bank.project.classes.model;
import com.student_bank.project.Interfaces.IStudentFactory;
import com.student_bank.project.classes.DAO.DepositDAO;
import com.student_bank.project.classes.SQL.TransactionSQL;
import com.student_bank.project.factory.StudentFactory;

public class Deposit {
	  IStudentFactory ifactory = new StudentFactory();

    public boolean deposit(int sAccNum, int depositBalance,DepositDAO dDB) throws Exception{

        TransactionSQL transactionDB = ifactory.makeTransactionDB();
        int sAccNumber = transactionDB.fetch(sAccNum);
        int dBalance = transactionDB.fetchBalance(sAccNumber);
        dBalance = dBalance + depositBalance;
        dDB.update(sAccNumber, dBalance);
        return true;
    }

}
