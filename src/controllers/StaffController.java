/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import models.User;
import services.StaffService;
import views.StaffView;

/**
 *
 * @author udin
 */
public class StaffController extends AbstractController {

    static StaffService staffService = new StaffService();

    @Override
    public void staffView() {
        StaffView staffView = new StaffView();
    }

    public User insert(User user) {
        return staffService.insert(user);
    }
    
    
    
}
