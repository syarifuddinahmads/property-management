/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import interfaces.PropertyInterface;
import models.Property;
import data.Data;

/**
 *
 * @author USER
 */
public class PropertyService implements PropertyInterface {

    @Override
    public Property getData() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Property insert(Property property) {
        Data.propertyArr.add(property);
        return property;
    }

    @Override
    public Property edit(int id) {
        Property property = null;
        for (int i = 0; i < Data.propertyArr.size(); i++) {
            if (Data.propertyArr.get(i).getIdProperty() == id) {
                property = Data.propertyArr.get(i);
            }
        }

        return property;
    }

    @Override
    public Property search(int id) {
        Property property = null;
        for (int i = 0; i < Data.propertyArr.size(); i++) {
            if (Data.propertyArr.get(i).getIdProperty() == id) {
                property = Data.propertyArr.get(i);
            }
        }

        return property;
    }

    @Override
    public Property delete(int id) {
        Property property = null;
        for (int i = 0; i < Data.propertyArr.size(); i++) {
            if (Data.propertyArr.get(i).getIdProperty() == id) {
                property = Data.propertyArr.get(i);
                Data.propertyArr.remove(i);
            }
        }

        return property;
    }

    @Override
    public Property update(Property property, int id) {
        Property propertyUpdate = Data.propertyArr.get(id);
        propertyUpdate.setHargaProperty(property.getHargaProperty());
        propertyUpdate.setLebarProperty(property.getLebarProperty());
        propertyUpdate.setPanjangProperty(property.getPanjangProperty());
        propertyUpdate.setLuasProperty(property.getPanjangProperty() * property.getLebarProperty());
        propertyUpdate.setNamaProperty(property.getNamaProperty());
        propertyUpdate.setTipeProperty(property.getTipeProperty());
        return propertyUpdate;
    }

    @Override
    public void detail() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
