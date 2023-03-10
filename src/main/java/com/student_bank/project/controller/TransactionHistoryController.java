package com.student_bank.project.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import com.student_bank.project.Interfaces.IStudentFactory;
import com.student_bank.project.Utility.Session.GlobalSessionDetails;
import com.student_bank.project.classes.SQL.TransactionSQL;
import com.student_bank.project.classes.SQL.TransactionHistorySQL;
import com.student_bank.project.classes.model.TransactionHistory;
import com.student_bank.project.factory.StudentFactory;

@Controller
public class TransactionHistoryController {
	  IStudentFactory ifactory = new StudentFactory();

        TransactionHistorySQL transactionHistoryDB = ifactory.makeTransactionHistoryDB();
        TransactionSQL transaction = ifactory.makeTransactionDB();

        @RequestMapping(value="/transactionHistoryData")
        public ModelAndView TransactionHistory(@RequestParam int accountNum){
        	if (GlobalSessionDetails.getInstance().getSession()==false){
	ModelAndView mv = new ModelAndView();
    			mv.setViewName("signIn");
    			return mv;
    		}else {
            ModelAndView mv = new ModelAndView("showTransactionHistory");
            try{
                TransactionHistory th = ifactory.makeTransactionHistory();
                th.transactionData(accountNum, transactionHistoryDB);
                mv.addObject("tranData",transactionHistoryDB.transactionHistoryData(accountNum));
                int accountNo = transaction.fetch(accountNum);
                mv.addObject("balance", transaction.fetchBalance(accountNo));
            }catch(Exception e){
                mv.setViewName("transactionError");
                mv.addObject("errorMsg", e.getMessage());
            }
            return mv;
    		}
        }   
}
