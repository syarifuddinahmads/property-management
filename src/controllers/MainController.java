/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import data.Data;
import models.User;
import views.CustomerView;
import views.LoginView;
import views.MainView;
import views.StaffView;

/**
 *
 * @author udin
 */
public class MainController extends AbstractController{

    @Override
    public void injectDataUser() {
        User user = new User((Data.usersArr.size()+1), "admin", "admin", null, null);
        Data.usersArr.add(user);
    }

    @Override
    public void mainView() {
        MainView mainView = new MainView();
    }
    
    @Override
    public void loginView() {
        LoginView loginView = new LoginView();
    }
    
    @Override
    public void staffView(){
        StaffView staffView = new StaffView();
    }
    
    @Override
    public void customerView(){
        CustomerView customerView = new CustomerView();
    }
    
}
