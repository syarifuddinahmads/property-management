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
public class TypeProperty {
    int idTypeProperty;
    String namaTypeProperty;

    public TypeProperty(int idTypeProperty, String namaTypeProperty) {
        this.idTypeProperty = idTypeProperty;
        this.namaTypeProperty = namaTypeProperty;
    }

    public int getIdTypeProperty() {
        return idTypeProperty;
    }

    public void setIdTypeProperty(int idTypeProperty) {
        this.idTypeProperty = idTypeProperty;
    }

    public String getNamaTypeProperty() {
        return namaTypeProperty;
    }

    public void setNamaTypeProperty(String namaTypeProperty) {
        this.namaTypeProperty = namaTypeProperty;
    }
    
    
}
