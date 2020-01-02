/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views;

import controllers.MainController;
import controllers.StaffController;
import data.Data;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;

/**
 *
 * @author udin
 */
public class MainView extends ComponentView{

    static MainController mainController = new MainController();
    
    public MainView() {
        
        btnStaff.setBounds(24, 24, 120, 26);
        add(btnStaff);
        
        btnCustomer.setBounds(24, 64, 120, 26);
        add(btnCustomer);
        
        btnProperty.setBounds(24, 104, 120, 26);
        add(btnProperty);
        
        btnTransaction.setBounds(24, 144, 120, 26);
        add(btnTransaction);
        
        btnLogout.setBounds(24, 188, 120, 26);
        add(btnLogout);
        
        btnStaff.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
                mainController.staffView();
            }
        });
        
        btnCustomer.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
                mainController.customerView();
            }
        });
        
        btnProperty.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
                mainController.propertyView();
            }
        });
        
        btnTransaction.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
                mainController.transactionView();
            }
        });
        
        btnLogout.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
                Data.isLoggedIn = false;
                mainController.loginView();
            }
        });
        
        
        setTitle("Main");
        setLayout(null);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(600, 450);
        setVisible(true);
        
    }
    
}
