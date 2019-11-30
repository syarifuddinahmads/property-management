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
    private int tipeProperty;
    private float panjangProperty;
    private float lebarProperty;
    private float luasProperty;

    public Property(int idProperty, String namaProperty, int tipeProperty, float panjangProperty, float lebarProperty, float luasProperty) {
        this.idProperty = idProperty;
        this.namaProperty = namaProperty;
        this.tipeProperty = tipeProperty;
        this.panjangProperty = panjangProperty;
        this.lebarProperty = lebarProperty;
        this.luasProperty = luasProperty;
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

    public int getTipeProperty() {
        return tipeProperty;
    }

    public void setTipeProperty(int tipeProperty) {
        this.tipeProperty = tipeProperty;
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
    
    
    
}
