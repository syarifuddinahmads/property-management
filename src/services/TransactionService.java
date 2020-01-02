/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import data.Data;
import interfaces.TransactionInterface;
import models.Transaction;

/**
 *
 * @author USER
 */
public class TransactionService implements TransactionInterface{

    @Override
    public Transaction insert(Transaction transaction) {
        System.out.println("=="+transaction.getProperty().getNamaProperty());
        Data.transactionArr.add(transaction);
        return transaction;
    }
    
}
