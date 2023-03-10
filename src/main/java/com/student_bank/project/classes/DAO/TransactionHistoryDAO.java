package com.student_bank.project.classes.DAO;

import java.util.List;

public interface TransactionHistoryDAO {
    public List<String> transactionHistoryData(int accountNumber);
}
