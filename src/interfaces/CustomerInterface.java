/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

import models.Customer;


/**
 *
 * @author udin
 */
public interface CustomerInterface {
    public Customer getData();
    public Customer insert(Customer customer);
    public Customer edit(int id);
    public Customer search(int id);
    public Customer delete(int id);
    public void update(Customer customer,int id);
    public void detail();
    
}
