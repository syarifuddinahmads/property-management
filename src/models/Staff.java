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
public class Staff {
    private int idStaff;
    private String namaStaff;
    private int noHpStaff;
    private String alamatStaff;

    public Staff(int idStaff, String namaStaff, int noHpStaff, String alamatStaff) {
        this.idStaff = idStaff;
        this.namaStaff = namaStaff;
        this.noHpStaff = noHpStaff;
        this.alamatStaff = alamatStaff;
    }

    public int getIdStaff() {
        return idStaff;
    }

    public void setIdStaff(int idStaff) {
        this.idStaff = idStaff;
    }

    public String getNamaStaff() {
        return namaStaff;
    }

    public void setNamaStaff(String namaStaff) {
        this.namaStaff = namaStaff;
    }

    public int getNoHpStaff() {
        return noHpStaff;
    }

    public void setNoHpStaff(int noHpStaff) {
        this.noHpStaff = noHpStaff;
    }

    public String getAlamatStaff() {
        return alamatStaff;
    }

    public void setAlamatStaff(String alamatStaff) {
        this.alamatStaff = alamatStaff;
    }
    
    
}
