/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import data.Data;
import interfaces.CustomerInterface;
import models.Customer;

/**
 *
 * @author udin
 */
public class CustomerService implements CustomerInterface {

    @Override
    public Customer getData() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Customer insert(Customer customer) {
        Data.customersArr.add(customer);
        return customer;
    }

    @Override
    public Customer edit(int id) {
        Customer customer = null;
        for (int i = 0; i < Data.customersArr.size(); i++) {
            if (Data.customersArr.get(i).getIdCustomer() == id) {
                customer = Data.customersArr.get(i);
            }
        }
        return customer;
    }

    @Override
    public Customer search(int id) {
        Customer customer = null;
        for (int i = 0; i < Data.customersArr.size(); i++) {
            if (Data.customersArr.get(i).getIdCustomer() == id) {
                customer = Data.customersArr.get(i);
            }
        }
        return customer;
    }

    @Override
    public Customer delete(int id) {
        Customer customer = null;
        for (int i = 0; i < Data.customersArr.size(); i++) {
            if (Data.customersArr.get(i).getIdCustomer() == id) {
                customer = Data.customersArr.get(i);
                Data.customersArr.remove(i);
            }
        }
        return customer;
    }

    @Override
    public Customer update(Customer customer, int id) {
        Customer customerUpdate = Data.customersArr.get(id);
        customerUpdate.setUsername(customer.getUsername());
        customerUpdate.setPassword(customer.getPassword());
        customerUpdate.setNamaCustomer(customer.getNamaCustomer());
        customerUpdate.setNoHpCustomer(customer.getNoHpCustomer());
        customerUpdate.setAlamatCustomer(customer.getAlamatCustomer());
        return customerUpdate;
    }

    @Override
    public void detail() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
