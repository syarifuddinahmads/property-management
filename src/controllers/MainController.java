/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import data.Data;
import static data.Data.staffArr;
import models.Staff;
import models.User;
import views.CustomerView;
import views.LoginView;
import views.MainView;
import views.PropertyView;
import views.StaffView;

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
}
