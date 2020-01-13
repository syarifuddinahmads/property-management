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
public class Staff extends User{
    private int idStaff;
    private String namaStaff;
    private String noHpStaff;
    private String alamatStaff;

    public Staff(int idStaff, String namaStaff, String noHpStaff, String alamatStaff, int id, String username, String password) {
        super(id, username, password,1);
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

    public String getNoHpStaff() {
        return noHpStaff;
    }

    public void setNoHpStaff(String noHpStaff) {
        this.noHpStaff = noHpStaff;
    }

    public String getAlamatStaff() {
        return alamatStaff;
    }

    public void setAlamatStaff(String alamatStaff) {
        this.alamatStaff = alamatStaff;
    }
    
    
}
