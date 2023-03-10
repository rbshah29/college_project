package com.student_bank.project.transactionHistory;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
public class transactionHistoryTest {
    @Test
    public void successTransactionHistory(){
        TransactionHistoryDBMock Tdb = new TransactionHistoryDBMock();
        Assertions.assertEquals("1234", Tdb.transactionHistoryData(1).get(0));
    }
    
    @Test
    public void unsuccessTransactionHistory(){
        TransactionHistoryDBMock Tdb = new TransactionHistoryDBMock();
        Assertions.assertNotEquals("12324", Tdb.transactionHistoryData(1).get(0));
    }
}
