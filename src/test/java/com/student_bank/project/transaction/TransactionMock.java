package com.student_bank.project.transaction;

import com.student_bank.project.Interfaces.ITransaction;

public class TransactionMock implements ITransaction {
    int accID;
    int depositBalance;
    public TransactionMock(){
        accID = 1;
    }
    public int fetch(int accnum){
        int depositBalance;
        if (accnum == 1){
            depositBalance=6452;
            return depositBalance;
        }else{
            return 0;
        }
    }
}
