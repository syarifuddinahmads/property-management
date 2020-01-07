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
    private Staff staff;
    private Customer customer;
    private Property property;
    private float dpAngsuran ;
    private float biayaAngsuran;
    private int totalAngsuran;
    private String grandTotalAngsuran;

    public Transaction(int idTransaction, Staff staff, Customer customer, Property property, float dpAngsuran, float biayaAngsuran, int totalAngsuran, String grandTotalAngsuran) {
        this.idTransaction = idTransaction;
        this.staff = staff;
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

    public Staff getStaff() {
        return staff;
    }

    public void setStaff(Staff staff) {
        this.staff = staff;
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
