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
   private int status;

    public TransactionDetail(int idTransaction, int idDetailTransaction, String totalPayment, String dateTransaction, int status) {
        this.idTransaction = idTransaction;
        this.idDetailTransaction = idDetailTransaction;
        this.totalPayment = totalPayment;
        this.dateTransaction = dateTransaction;
        this.status = status;
    }
   
    public int getIdTransaction() {
        return idTransaction;
    }

    public void setIdTransaction(int idTransaction) {
        this.idTransaction = idTransaction;
    }

    public int getIdDetailTransaction() {
        return idDetailTransaction;
    }

    public void setIdDetailTransaction(int idDetailTransaction) {
        this.idDetailTransaction = idDetailTransaction;
    }

    public String getTotalPayment() {
        return totalPayment;
    }

    public void setTotalPayment(String totalPayment) {
        this.totalPayment = totalPayment;
    }

    public String getDateTransaction() {
        return dateTransaction;
    }

    public void setDateTransaction(String dateTransaction) {
        this.dateTransaction = dateTransaction;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    
    
}
