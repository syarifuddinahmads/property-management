/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import javax.swing.table.TableColumnModel;

/**
 *
 * @author udin
 */
public class MemberPaymentView{
    private JFrame frame = new JFrame();
    private JLabel textMember = new JLabel();
    private JTextField entry_Anggaran = new JTextField();
    private JTextField angka = new JTextField();
    private JButton bayarButton = new JButton("Bayar");
    private JTable table = new JTable();
    private JScrollPane scroll;
    private DefaultTableCellRenderer celRender;
    private JOptionPane message = new JOptionPane();
    
    public MemberPaymentView(){
        this.textMember.setBounds(25, 50, 300, 25);
        this.textMember.setText("Member Payment View");
        this.textMember.setFont(new Font("Times new roman", Font.BOLD, 26));
        this.frame.add(this.textMember);
        
        Border border = new EmptyBorder(5, 5, 5, 5);
        this.entry_Anggaran.setBounds(25, 100, 150, 40);
        this.entry_Anggaran.setText(""); //Set Text DataBase
        this.entry_Anggaran.setFont(new Font("Arial", Font.CENTER_BASELINE, 16));
        this.entry_Anggaran.setBorder(border);
        this.frame.add(this.entry_Anggaran);
        
        this.angka.setBounds(240, 100, 100, 40);
        this.angka.setText(""); // Set Text DataBase
        this.angka.setFont(new Font("Arial", Font.CENTER_BASELINE, 16));
        this.angka.setBorder(border);
        this.frame.add(this.angka);
        
        this.bayarButton.setBounds(400, 100, 100, 40);
        this.bayarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                MemberPaymentView.this.setMessage();
            }
        });
        this.frame.add(this.bayarButton);
        
        String[] colTable = {"Id", "Customer", "Tgl Pembayaran", "Status"};
        DefaultTableModel tableModel = new DefaultTableModel(null, colTable);
        tableModel.addRow(new Object[]{"1", "WKWKWK", "2019-09-08", "Lunas"});
//        tableModel.getCo
        this.table.setModel(tableModel);
        this.table.getColumnModel().getColumn(0).setPreferredWidth(0);
        this.celRender = new DefaultTableCellRenderer();
        this.celRender.setHorizontalAlignment(JLabel.CENTER);
        this.table.getColumnModel().getColumn(0).setCellRenderer(this.celRender);
        this.scroll = new JScrollPane(this.table);
        this.scroll.setBounds(120, 200, 700, 300);
        this.frame.add(this.scroll);
        
        this.frame.setTitle("Member Payment View");
        this.frame.setSize(1000, 700);
        this.frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.frame.setLayout(null);
        this.frame.setVisible(true);
        this.frame.setLocationRelativeTo(null);
    }
    public void setMessage(){
        int a = this.message.showConfirmDialog(this.frame, "Are You Sure ?");
        if (a==this.message.YES_OPTION){
            System.out.println("YES");
        }
//        this.message.showMessageDialog(this.frame, "Yakin Ingin Membayar", "");
    }
    
}
