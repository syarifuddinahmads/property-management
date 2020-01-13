/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

/**
 *
 * @author USER
 */
public class Transaction {
    
    private int idTransaction;
    private User user;
    private Customer customer;
    private Property property;
    private float dpAngsuran ;
    private float biayaAngsuran;
    private int totalAngsuran;
    private String grandTotalAngsuran;

    public Transaction(int idTransaction, User user, Customer customer, Property property, float dpAngsuran, float biayaAngsuran, int totalAngsuran, String grandTotalAngsuran) {
        this.idTransaction = idTransaction;
        this.user = user;
        this.customer = customer;
        this.property = property;
        this.dpAngsuran = dpAngsuran;
        this.biayaAngsuran = biayaAngsuran;
        this.totalAngsuran = totalAngsuran;
        this.grandTotalAngsuran = grandTotalAngsuran;
    }

    public int getIdTransaction() {
        return idTransaction;
    }

    public void setIdTransaction(int idTransaction) {
        this.idTransaction = idTransaction;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Property getProperty() {
        return property;
    }

    public void setProperty(Property property) {
        this.property = property;
    }

    public float getDpAngsuran() {
        return dpAngsuran;
    }

    public void setDpAngsuran(float dpAngsuran) {
        this.dpAngsuran = dpAngsuran;
    }

    public float getBiayaAngsuran() {
        return biayaAngsuran;
    }

    public void setBiayaAngsuran(float biayaAngsuran) {
        this.biayaAngsuran = biayaAngsuran;
    }

    public int getTotalAngsuran() {
        return totalAngsuran;
    }

    public void setTotalAngsuran(int totalAngsuran) {
        this.totalAngsuran = totalAngsuran;
    }

    public String getGrandTotalAngsuran() {
        return grandTotalAngsuran;
    }

    public void setGrandTotalAngsuran(String grandTotalAngsuran) {
        this.grandTotalAngsuran = grandTotalAngsuran;
    }

    
    
}
