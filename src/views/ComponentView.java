/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JScrollPane;
import javax.swing.JTable;
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
    JLabel lblPanjang = new JLabel("Panjang");
    JLabel lblLebar = new JLabel("Lebar");
    JLabel lblLuas = new JLabel("Luas");
    JLabel lblTipe = new JLabel("Tipe");
    JLabel lblHarga = new JLabel("Harga");
    static JTextField etUsername = new JTextField();
    static JPasswordField etPassword = new JPasswordField();
    static JTextField etName = new JTextField();
    static JTextField etNoHp = new JTextField();
    static JTextField etAlamat = new JTextField();
    static JTextField etPanjang = new JTextField();
    static JTextField etLebar = new JTextField();
    static JTextField etLuas = new JTextField();
    static JTextField etTipe = new JTextField();
    static JTextField etHarga = new JTextField();
    JComboBox jcTipeProperty = new JComboBox();
    JButton btnLogin = new JButton("Login");
    JButton btnCancel = new JButton("Cancel");
    JButton btnSimpan = new JButton("Simpan");
    JButton btnUpdate = new JButton("Update");
    JButton btnDelete = new JButton("Delete");
    JButton btnEdit = new JButton("Edit");
    JButton btnClose = new JButton("Close");
    

    // Main View
    JLabel lblTitleProperty = new JLabel("Savira Property Surabaya");
    JLabel lblDescProperty = new JLabel("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.");
    JButton btnStaff = new JButton("Staff");
    
    JTable tblUser = new JTable();
    JScrollPane tblScroll = new JScrollPane(tblUser);
}
