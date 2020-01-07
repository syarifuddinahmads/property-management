/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

/**
 *
 * @author udin
 */
public class TransactionDetail {
   private int idTransaction;
   private int idDetailTransaction;
   private String totalPayment;
   private String dateTransaction;

    public TransactionDetail(int idTransaction, int idDetailTransaction, String totalPayment, String dateTransaction) {
        this.idTransaction = idTransaction;
        this.idDetailTransaction = idDetailTransaction;
        this.totalPayment = totalPayment;
        this.dateTransaction = dateTransaction;
    }   

    public int getIdTransaction() {
        return idTransaction;
    }

    public int getIdDetailTransaction() {
        return idDetailTransaction;
    }

    public String getTotalPayment() {
        return totalPayment;
    }

    public String getDateTransaction() {
        return dateTransaction;
    }
   
    
}
