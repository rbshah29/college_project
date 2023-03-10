package com.student_bank.project.classes.model;

import com.student_bank.project.Interfaces.IStudentFactory;
import com.student_bank.project.classes.DAO.TransactionHistoryDAO;
import com.student_bank.project.classes.SQL.TransactionHistorySQL;
import com.student_bank.project.factory.StudentFactory;

public class TransactionHistory {
	  IStudentFactory ifactory = new StudentFactory();


    public boolean transactionData(int accountNum, TransactionHistoryDAO IDB) {
        TransactionHistorySQL transactionHistoryDB = ifactory.makeTransactionHistoryDB();
        transactionHistoryDB.transactionHistoryData(accountNum);
        return true;
    }

}
