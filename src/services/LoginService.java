/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import interfaces.LoginInterface;
import data.Data;
import models.User;

/**
 *
 * @author udin
 */
public class LoginService implements LoginInterface{

    @Override
    public User doLogin(String username, String password) {
        User user = null;
        
        for (int i = 0; i < Data.usersArr.size(); i++) {
            if (Data.usersArr.get(i).getUsername().toLowerCase().equals(username)) {
                if (Data.usersArr.get(i).getPassword().toLowerCase().equals(password)) {
                    user = Data.usersArr.get(i);
                }
            }
        }
        
        return user;
    }
    
}
