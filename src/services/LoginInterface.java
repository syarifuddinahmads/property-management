/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import models.User;

/**
 *
 * @author udin
 */
public interface LoginInterface {
    public User doLogin(String username, String password);
}