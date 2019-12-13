/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

import models.Property;

/**
 *
 * @author USER
 */
public interface PropertyInterface {
    public Property getData();
    public Property insert(Property property);
    public Property edit(int id);
    public Property search(int id);
    public Property delete(int id);
    public Property update(Property property,int id);
    public void detail();
}
