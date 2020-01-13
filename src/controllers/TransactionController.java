/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import java.util.ArrayList;
import models.Transaction;
import models.TransactionDetail;
import services.TransactionService;

/**
 *
 * @author USER
 */
public class TransactionController extends MainController{
    
    static TransactionService transactionService = new TransactionService();
    
    public Transaction insert(Transaction transaction){
        return transactionService.insert(transaction);
    }
    
    public TransactionDetail insertDetail(TransactionDetail transactionDetail){
        return transactionService.insertDetail(transactionDetail);
    }
    
    public Transaction getTransactionMember(){
        return transactionService.getTransactionMember();
    }
    
    public ArrayList<TransactionDetail> getTransactionDetailMember(int id){
        return transactionService.getTransactionDetailMember(id);
    }
    
}
