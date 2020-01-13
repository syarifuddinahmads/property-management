/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import data.Data;
import models.Customer;
import models.Property;
import models.Staff;
import models.TransactionDetail;
import models.TypeProperty;
import models.User;
import views.CustomerView;
import views.LoginView;
import views.MainView;
import views.MemberPaymentView;
import views.PropertyView;
import views.StaffView;
import views.TransactionView;

/**
 *
 * @author udin
 */
public class MainController {

    public void injectDataUser() {
        int id = Data.staffArr.size() + 1;
        User user = new User(id, "admin", "admin", 1);
        Data.usersArr.add(user);
        Staff staff = new Staff(id, "Admin", "081331", "Surabaya", id, "admin", "admin");
        Data.staffArr.add(staff);

        int idCustomer = Data.customersArr.size() + 1;
        User userCust = new User(idCustomer, "customer", "customer", 0);
        Data.usersArr.add(userCust);
        Customer customer = new Customer(idCustomer, "Customer", "00000", "Surabaya", idCustomer, "customer", "customer");
        Data.customersArr.add(customer);
    }
    
    public void injectDataTransaction(){
        
        int id = Data.transactionDetailArr.size() + 1;
        TransactionDetail transactionDetail = new TransactionDetail(id, id, "", "", id);
        
    }
    

    public void injectDataTypeProperty() {
        TypeProperty typeProperty = new TypeProperty((Data.typePropertyArr.size() + 1), "Savira 760");
        Data.typePropertyArr.add(typeProperty);
        Property property = new Property(1, "SAvira 1", typeProperty.getNamaTypeProperty(), 0, 0, 3, 1000000, 0);
        Data.propertyArr.add(property);
        TypeProperty typeProperty1 = new TypeProperty((Data.typePropertyArr.size() + 1), "Savira  B360");
        Data.typePropertyArr.add(typeProperty1);
        Property property1 = new Property(2, "SAvira 2", typeProperty1.getNamaTypeProperty(), 0, 0, 6, 2300000, 0);
        Data.propertyArr.add(property1);
        TypeProperty typeProperty2 = new TypeProperty((Data.typePropertyArr.size() + 1), "Savira  T66");
        Data.typePropertyArr.add(typeProperty2);
        Property property2 = new Property(3, "SAvira 3", typeProperty2.getNamaTypeProperty(), 0, 0, 2, 1500000, 0);
        Data.propertyArr.add(property2);
    }

    public void mainView() {
        MainView mainView = new MainView();
    }

    public void loginView() {
        LoginView loginView = new LoginView();
    }

    public void staffView() {
        StaffView staffView = new StaffView();
    }

    public void customerView() {
        CustomerView customerView = new CustomerView();
    }

    public void propertyView() {
        PropertyView propertyView = new PropertyView();
    }

    public void transactionView() {
        TransactionView transactionView = new TransactionView();
    }
    
    public void memberPaymentView(){
        MemberPaymentView memberPaymentView = new MemberPaymentView();
    }
}
