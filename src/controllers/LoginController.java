/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import models.User;
import services.LoginService;
import views.LoginView;

/**
 *
 * @author udin
 */
public class LoginController extends AbstractController{

    static LoginService loginService = new LoginService();
    
    @Override
    public void loginView() {
        LoginView loginView = new LoginView();
    }
    
    @Override
    public User doLogin(String username, String password){
        return loginService.doLogin(username, password);
    }
}
