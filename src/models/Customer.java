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
public class Customer {
    private int idCustomer;
    private String namaCustomer;
    private int noHpCustomer;
    private String alamatCustomer;

    public Customer(int idCustomer, String namaCustomer, int noHpCustomer, String alamatCustomer) {
        this.idCustomer = idCustomer;
        this.namaCustomer = namaCustomer;
        this.noHpCustomer = noHpCustomer;
        this.alamatCustomer = alamatCustomer;
    }

    public int getIdCustomer() {
        return idCustomer;
    }

    public void setIdCustomer(int idCustomer) {
        this.idCustomer = idCustomer;
    }

    public String getNamaCustomer() {
        return namaCustomer;
    }

    public void setNamaCustomer(String namaCustomer) {
        this.namaCustomer = namaCustomer;
    }

    public int getNoHpCustomer() {
        return noHpCustomer;
    }

    public void setNoHpCustomer(int noHpCustomer) {
        this.noHpCustomer = noHpCustomer;
    }

    public String getAlamatCustomer() {
        return alamatCustomer;
    }

    public void setAlamatCustomer(String alamatCustomer) {
        this.alamatCustomer = alamatCustomer;
    }
    
}
