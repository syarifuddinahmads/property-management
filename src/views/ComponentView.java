/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author udin
 */
public class ComponentView extends JFrame {

    // Login View
    JLabel lblLogin = new JLabel("LOGIN");
    JLabel lblUsername = new JLabel("Username");
    JLabel lblPassword = new JLabel("Paswword");
    JLabel lblNama = new JLabel("Nama");
    JLabel lblNoHp = new JLabel("No HP");
    JLabel lblAlamat = new JLabel("Alamat");
    JTextField etUsername = new JTextField();
    JPasswordField etPassword = new JPasswordField();
    JTextField etName = new JTextField();
    JTextField etNoHp = new JTextField();
    JTextField etAlamat = new JTextField();
    JButton btnLogin = new JButton("Login");
    JButton btnCancel = new JButton("Cancel");
    JButton btnSimpan = new JButton("Simpan");

    // Main View
    JLabel lblTitleProperty = new JLabel("Savira Property Surabaya");
    JLabel lblDescProperty = new JLabel("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.");
    JButton btnStaff = new JButton("Staff");

}
