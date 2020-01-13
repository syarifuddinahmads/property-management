/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views;

import controllers.LoginController;
import controllers.MainController;
import data.Data;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import models.User;
import static views.ComponentView.etUsername;

/**
 *
 * @author udin
 */
public class LoginView extends ComponentView {

    static LoginController loginController = new LoginController();
    static MainController mainController = new  MainController();
    String username;
    String password;

    public LoginView() {

        lblLogin.setBounds(160, 22, 200, 32);
        lblLogin.setFont(new Font("Verdana", Font.BOLD, 20));
        add(lblLogin);

        lblUsername.setBounds(62, 60, 200, 26);
        add(lblUsername);
        etUsername.setBounds(62, 90, 275, 28);
        add(etUsername);

        lblPassword.setBounds(62, 130, 200, 26);
        add(lblPassword);
        etPassword.setBounds(62, 160, 275, 28);
        add(etPassword);

        btnCancel.setBounds(90, 212, 100, 26);
        add(btnCancel);

        btnLogin.setBounds(210, 212, 100, 26);
        add(btnLogin);

        btnLogin.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                username = etUsername.getText().toLowerCase().toString();
                password = etPassword.getText().toLowerCase().toString();
                if (username.equals("") && password.equals("")) {
                    JOptionPane.showMessageDialog(null, "Username & Password belum diisi !");
                } else {
                    User user = loginController.doLogin(username, password);
                    if (user == null) {
                        JOptionPane.showMessageDialog(null, "Username & Password Salah !");
                    }else{
                        Data.userLoggin = user;
                        if (user.getType() == 1) {
                            mainController.mainView();
                        }else{
                            mainController.memberPaymentView();
                        }
                        etUsername.setText("");
                        etPassword.setText("");
                        setVisible(false);
                    }
                }
            }
        });

        setTitle("Login");
        setLayout(null);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 350);
        setVisible(true);

    }

}
