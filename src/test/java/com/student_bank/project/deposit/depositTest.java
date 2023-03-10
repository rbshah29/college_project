package com.student_bank.project.deposit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import com.student_bank.project.classes.DAO.DepositDAO;
import com.student_bank.project.classes.model.Deposit;

public class depositTest {
    @Test
    public void successDepositTest() throws Exception{
        Deposit d = new Deposit();
        DepositDAO dDB = new DepositDBMock();
        Assertions.assertEquals(true,d.deposit(1, 64522,dDB));
    }

    @Test
    public void unsuccessDepositTest() throws Exception{
        Deposit d = new Deposit();
        DepositDAO dDB = new DepositDBMock();
        Assertions.assertNotEquals(false,d.deposit(1, 64522,dDB));
    }
}
