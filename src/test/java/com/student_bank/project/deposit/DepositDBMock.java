package com.student_bank.project.deposit;

import com.student_bank.project.classes.DAO.DepositDAO;

public class DepositDBMock implements DepositDAO{
    int accountNum;
    int depositBalance;
    public DepositDBMock(){
        accountNum = 1234;
        depositBalance = 100;
    }
    public int update(int accnum,int deposit){
        if (accnum == 6452){
            depositBalance=depositBalance+deposit;
            return 0;
        }else{
            return 1;
        }
    }
}
 