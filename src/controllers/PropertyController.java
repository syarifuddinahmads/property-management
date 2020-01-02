/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import models.Property;
import services.PropertyService;
import views.PropertyView;

/**
 *
 * @author USER
 */
public class PropertyController extends MainController {
    
    static PropertyService propertyService = new PropertyService();

    @Override
    public void propertyView() {
        PropertyView propertyView = new PropertyView();
    }
    
    public Property insert(Property property) {
        return this.propertyService.insert(property);
    }

    public Property edit(int id) {
        return this.propertyService.edit(id);
    }

    public Property delete(int id) {
        return this.propertyService.delete(id);
    }
    
    public Property update(Property property, int id){
        return this.propertyService.update(property, id);
    }

}
