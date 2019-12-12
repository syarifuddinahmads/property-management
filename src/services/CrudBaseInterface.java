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
public interface CrudBaseInterface {
    
    public User insert(User user);
    public User edit(int id);
    public User search(int id);
    public User delete(int id);
    public void update(User User,int id);
    public void detail();
    
}
