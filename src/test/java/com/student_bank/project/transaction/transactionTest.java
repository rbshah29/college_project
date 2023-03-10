package com.student_bank.project.transaction;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class transactionTest {
    @Test
    public void successTransactionTest(){
        TransactionMock t = new TransactionMock();

        Assertions.assertEquals(6452, t.fetch(1)) ;
    }

    @Test
    public void unsuccessTransactionTest(){
        TransactionMock t = new TransactionMock();

        Assertions.assertNotEquals(6450, t.fetch(1)) ;
    }
}
