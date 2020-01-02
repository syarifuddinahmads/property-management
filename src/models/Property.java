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
public class Property {

    private int idProperty;
    private String namaProperty;
    private String tipeProperty;
    private float panjangProperty;
    private float lebarProperty;
    private float luasProperty;
    private float hargaProperty;
    private int totalProperty;

    public Property(int idProperty, String namaProperty, String tipeProperty, float panjangProperty, float lebarProperty, float luasProperty, float hargaProperty, int totalProperty) {
        this.idProperty = idProperty;
        this.namaProperty = namaProperty;
        this.tipeProperty = tipeProperty;
        this.panjangProperty = panjangProperty;
        this.lebarProperty = lebarProperty;
        this.luasProperty = luasProperty;
        this.hargaProperty = hargaProperty;
        this.totalProperty = totalProperty;
    }
    

    public void setTipeProperty(String tipeProperty) {
        this.tipeProperty = tipeProperty;
    }

    public String getTipeProperty() {
        return tipeProperty;
    }

    public void setHargaProperty(float hargaProperty) {
        this.hargaProperty = hargaProperty;
    }

    public float getHargaProperty() {
        return hargaProperty;
    }

    public int getIdProperty() {
        return idProperty;
    }

    public void setIdProperty(int idProperty) {
        this.idProperty = idProperty;
    }

    public String getNamaProperty() {
        return namaProperty;
    }

    public void setNamaProperty(String namaProperty) {
        this.namaProperty = namaProperty;
    }

    public float getPanjangProperty() {
        return panjangProperty;
    }

    public void setPanjangProperty(float panjangProperty) {
        this.panjangProperty = panjangProperty;
    }

    public float getLebarProperty() {
        return lebarProperty;
    }

    public void setLebarProperty(float lebarProperty) {
        this.lebarProperty = lebarProperty;
    }

    public float getLuasProperty() {
        return luasProperty;
    }

    public void setLuasProperty(float luasProperty) {
        this.luasProperty = luasProperty;
    }

    public void setTotalProperty(int totalProperty) {
        this.totalProperty = totalProperty;
    }

    public int getTotalProperty() {
        return totalProperty;
    }
    
    

}
