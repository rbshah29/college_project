package com.student_bank.project.classes.model;

import com.student_bank.project.classes.SQL.TransactionSQL;

public class Balance {
    public int dBalance;

    public boolean balance(int aID) throws Exception{
        TransactionSQL transactionDB = new TransactionSQL();
        int sAccNumber = transactionDB.fetch(aID);
        dBalance += transactionDB.fetchBalance(sAccNumber);
        return true;
    }
}
