/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import data.Data;
import models.TypeProperty;
import models.User;
import views.CustomerView;
import views.LoginView;
import views.MainView;
import views.PropertyView;
import views.StaffView;
import views.TransactionView;

/**
 *
 * @author udin
 */
public class MainController extends AbstractController {

    @Override
    public void injectDataUser() {
        int id = Data.staffArr.size() + 1;
        User user = new User(id, "admin", "admin", 1);
        Data.usersArr.add(user);
    }
    
    @Override
    public void injectDataTypeProperty() {
        TypeProperty typeProperty = new TypeProperty((Data.typePropertyArr.size()+1), "Savira 760");
        Data.typePropertyArr.add(typeProperty);
        TypeProperty typeProperty1 = new TypeProperty((Data.typePropertyArr.size()+1), "Savira  B360");
        Data.typePropertyArr.add(typeProperty1);
        TypeProperty typeProperty2 = new TypeProperty((Data.typePropertyArr.size()+1), "Savira  T66");
        Data.typePropertyArr.add(typeProperty2);
    }

    @Override
    public void mainView() {
        MainView mainView = new MainView();
    }

    @Override
    public void loginView() {
        LoginView loginView = new LoginView();
    }

    @Override
    public void staffView() {
        StaffView staffView = new StaffView();
    }

    @Override
    public void customerView() {
        CustomerView customerView = new CustomerView();
    }

    @Override
    public void propertyView() {
        PropertyView propertyView = new PropertyView();
    }

    @Override
    public void transactionView() {
        TransactionView transactionView = new TransactionView();
    }
}
