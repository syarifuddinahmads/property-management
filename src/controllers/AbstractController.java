/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import models.User;

/**
 *
 * @author udin
 */
public abstract class AbstractController {

    public void injectDataUser() {
    }

    public void loginView() {
    }

    public User doLogin(String username, String password) {
        return null;
    }

    public void mainView() {

    }
    
    public void staffView(){
        
    }
    
    public void customerView(){
        
    }
    
    public void propertyView(){
        
    }
   

}
