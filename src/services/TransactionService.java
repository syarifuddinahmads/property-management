/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import data.Data;
import interfaces.TransactionInterface;
import java.util.ArrayList;
import models.Transaction;
import models.TransactionDetail;
import models.User;

/**
 *
 * @author USER
 */
public class TransactionService implements TransactionInterface{

    @Override
    public Transaction insert(Transaction transaction) {
        System.out.println("=="+transaction.getProperty().getNamaProperty());
        Data.transactionArr.add(transaction);
        User user = new User((Data.usersArr.size()+1), transaction.getCustomer().getUsername(), transaction.getCustomer().getPassword(), 0);
        Data.usersArr.add(user);
        return transaction;
    }

    @Override
    public TransactionDetail insertDetail(TransactionDetail transactionDetail) {
        Data.transactionDetailArr.add(transactionDetail);
        return transactionDetail;
    }

    @Override
    public Transaction getTransactionMember() {
        User userLogin = Data.userLoggin;
        
        Transaction transaction = null;
        
        for (int i = 0; i < Data.transactionArr.size(); i++) {
            if(Data.transactionArr.get(i).getCustomer().getUsername().equals(userLogin.getUsername())){
               transaction = Data.transactionArr.get(i);
            }
        }
        
        return transaction;
    }

    @Override
    public ArrayList<TransactionDetail> getTransactionDetailMember(int idTransaction) {
        ArrayList<TransactionDetail> transactionDetails = new ArrayList<>();
        
        for (int i = 0; i < Data.transactionDetailArr.size(); i++) {
            if(Data.transactionDetailArr.get(i).getIdTransaction() == idTransaction){
                transactionDetails.add(Data.transactionDetailArr.get(i));
            }
        }
        
        return transactionDetails;
    }

    
}
