/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import models.Customer;
import services.CustomerService;

/**
 *
 * @author udin
 */
public class CustomerController {
    
    static CustomerService customerService = new CustomerService();
    
    public Customer insert(Customer customer) {
        return this.customerService.insert(customer);
    }

    public Customer edit(int id) {
        return this.customerService.edit(id);
    }

    public Customer delete(int id) {
        return this.customerService.delete(id);
    }
    
    public Customer update(Customer customer, int id){
        return this.customerService.update(customer, id);
    }
    
}
