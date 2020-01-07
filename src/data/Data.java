/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

import java.util.ArrayList;
import models.Customer;
import models.Property;
import models.Staff;
import models.Transaction;
import models.TypeProperty;
import models.User;

/**
 *
 * @author udin
 */
public class Data {
    
    public static boolean isLoggedIn = false;
    public static Staff staffLoggin = null;
    public static ArrayList<User> usersArr = new ArrayList<>();
    public static ArrayList<Customer> customersArr = new ArrayList<>();
    public static ArrayList<Staff> staffArr = new ArrayList<>();
    public static ArrayList<Property> propertyArr = new ArrayList<>();
    public static ArrayList<TypeProperty> typePropertyArr = new ArrayList<>();
    public static ArrayList<Transaction> transactionArr = new ArrayList<>();
    public static ArrayList<Transaction> transactionDetailArr = new ArrayList<>();
    
    
}
