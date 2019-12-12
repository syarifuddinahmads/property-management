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
    public Object edit(int id);
    public Object search(int id);
    public Object delete(int id);
    public void update(Object object);
    public void detail();
    
}
