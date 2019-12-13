/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import interfaces.CrudBaseInterface;
import data.Data;
import models.User;

/**
 *
 * @author udin
 */
public class StaffService implements CrudBaseInterface{

    @Override
    public User insert(User user) {
        if (user != null) {
            Data.usersArr.add(user);
        }
        return null;
    }

    @Override
    public User edit(int id) {
        User user = null;
        for (int i = 0; i < Data.usersArr.size(); i++) {
            if (Data.usersArr.get(i).getId() == id) {
                user = Data.usersArr.get(i);
            }
        }

        return user;
    }

    @Override
    public User search(int id) {
       User user = null;
        for (int i = 0; i < Data.usersArr.size(); i++) {
            if (Data.usersArr.get(i).getId() == id) {
                user = Data.usersArr.get(i);
            }
        }

        return user;
    }

    @Override
    public User delete(int id) {
        User user = null;
        for (int i = 0; i < Data.usersArr.size(); i++) {
            if (Data.usersArr.get(i).getId() == id) {
                user = Data.usersArr.get(i);
                Data.usersArr.remove(i);
            }
        }

        return user;
    }

    @Override
    public void update(User User, int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void detail() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public User getData() {
        return null;
    }
    
}
