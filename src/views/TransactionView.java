/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views;

import data.Data;
import javax.swing.JFrame;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author USER
 */
public class TransactionView extends ComponentView{
    
    DefaultTableModel tableModel;

    public TransactionView() {
        
        
        initDataStaff();
        
        setTitle("TRANSACTION");
        setLayout(null);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(950, 450);
        setVisible(true);
        
    }
    
    public void initDataStaff() {
        String[] headerTable = {"#", "Name", "No Telp", "Alamat"};
        tableModel = new DefaultTableModel(null, headerTable);
        tableModel.setRowCount(0);
        for (int i = 0; i < Data.transactionArr.size(); i++) {
            tableModel.addRow(new Object[]{});
        }
        tblTransaction.setModel(tableModel);
        tblTransactionScroll.setBounds(400, 48, 500, 225);
        add(tblTransactionScroll);
    }
    
}
