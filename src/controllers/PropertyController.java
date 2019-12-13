/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import views.PropertyView;

/**
 *
 * @author USER
 */
public class PropertyController extends AbstractController {

    @Override
    public void propertyView() {
        PropertyView propertyView = new PropertyView();
    }

}
