/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

import java.util.ArrayList;
import models.Transaction;
import models.TransactionDetail;

/**
 *
 * @author USER
 */
public interface TransactionInterface {
 
    public Transaction insert(Transaction transaction);
    
    public TransactionDetail insertDetail(TransactionDetail transactionDetail);
    
    public Transaction getTransactionMember();
    
    public ArrayList<TransactionDetail> getTransactionDetailMember(int idTransaction);
    
}
