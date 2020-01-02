/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import controllers.MainController;
import data.Data;
import views.LoginView;

/**
 *
 * @author udin
 */
public class TugasAkhirPraktikumPBO {

    static MainController mainController = new MainController();

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        mainController.injectDataUser();
        mainController.injectDataTypeProperty();
        boolean statusLogin = Data.isLoggedIn;
        if (statusLogin) {
            mainController.mainView();
        } else {
            mainController.loginView();
//            mainController.transactionView();
        }
    }

}
