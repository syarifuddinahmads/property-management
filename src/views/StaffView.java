/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views;

import javax.swing.JFrame;

/**
 *
 * @author udin
 */
public class StaffView extends ComponentView {

    public StaffView() {

        lblUsername.setBounds(24, 48, 100, 26);
        add(lblUsername);

        etUsername.setBounds(124, 48, 240, 26);
        add(etUsername);

        lblPassword.setBounds(24, 96, 100, 26);
        add(lblPassword);
        
        etPassword.setBounds(124, 96, 240, 26);
        add(etPassword);

        lblNama.setBounds(24, 148, 100, 26);
        add(lblNama);
        
        etName.setBounds(124, 148, 240, 26);
        add(etName);
        
        lblNoHp.setBounds(24, 198, 100, 26);
        add(lblNoHp);
        
        etNoHp.setBounds(124, 198, 240, 26);
        add(etNoHp);
        
        lblAlamat.setBounds(24, 248, 100, 26);
        add(lblAlamat);
        
        etAlamat.setBounds(124, 248, 240, 26);
        add(etAlamat);
        
        btnCancel.setBounds(134, 298, 100, 26);
        add(btnCancel);

        
        btnSimpan.setBounds(254, 298, 100, 26);
        add(btnSimpan);

        setTitle("Staff");
        setLayout(null);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 400);
        setVisible(true);

    }

}
