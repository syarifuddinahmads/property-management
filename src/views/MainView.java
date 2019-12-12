/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views;

import controllers.StaffController;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;

/**
 *
 * @author udin
 */
public class MainView extends ComponentView{

    static StaffController staffController  = new StaffController();
    
    public MainView() {
        
        btnStaff.setBounds(24, 24, 100, 26);
        add(btnStaff);
        
        btnStaff.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                staffController.staffView();
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
