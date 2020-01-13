/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views;

import controllers.TransactionController;
import data.Data;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import models.Transaction;
import models.TransactionDetail;

/**
 *
 * @author udin
 */
public class MemberPaymentView {

    private JFrame frame = new JFrame();
    private JLabel textMember = new JLabel();
    private JTextField entry_Anggaran = new JTextField();
    private JLabel angsuran_ke = new JLabel();
    private JLabel jumlah_angsuran = new JLabel();
    private JTextField angka = new JTextField();
    private JButton bayarButton = new JButton("Bayar");
    private JTable table = new JTable();
    private JScrollPane scroll;
    private DefaultTableCellRenderer celRender;
    private JOptionPane message = new JOptionPane();
    private JButton btnLogout = new JButton("Logout");
    private TransactionController transactionController = new TransactionController();
    private DefaultTableModel tableModel;

    private Transaction transaction;
    private ArrayList<TransactionDetail> transactionDetails;
    private int angsuranKe;
    private float jumlahWajibBayar;

    public MemberPaymentView() {

        transaction = transactionController.getTransactionMember();
        transactionDetails = transactionController.getTransactionDetailMember(transaction.getIdTransaction());

        angsuranKe = transactionDetails.size() + 1;
        jumlahWajibBayar = transaction.getBiayaAngsuran();

        this.angka.setText(Integer.toString(angsuranKe));
        this.entry_Anggaran.setText(Float.toString(jumlahWajibBayar));

        this.textMember.setBounds(24, 24, 350, 18);
        this.textMember.setText("Member Payment View");
        this.textMember.setFont(new Font("Times new roman", Font.BOLD, 18));
        this.frame.add(this.textMember);

        this.angsuran_ke.setBounds(24, 70, 200, 25);
        this.angsuran_ke.setText("Pembayaran Ke : ");
        this.angsuran_ke.setFont(new Font("Consolas", Font.BOLD, 16));
        this.frame.add(angsuran_ke);

        this.angka.setBounds(200, 70, 100, 26);
        this.angka.setEditable(false);
        this.frame.add(this.angka);

        this.jumlah_angsuran.setBounds(24, 110, 200, 25);
        this.jumlah_angsuran.setText("Jumlah Bayar : ");
        this.jumlah_angsuran.setFont(new Font("Consolas", Font.BOLD, 16));
        this.frame.add(jumlah_angsuran);

        this.entry_Anggaran.setBounds(200, 110, 200, 26);
        this.entry_Anggaran.setEditable(false);
        this.frame.add(this.entry_Anggaran);

        this.bayarButton.setBounds(200, 150, 100, 26);
        this.frame.add(this.bayarButton);

        this.bayarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String bayar = entry_Anggaran.getText();
                if (bayar.equals("")) {
                    JOptionPane.showMessageDialog(null, "Masukkan jumlah pembayaran !");
                } else {
                    TransactionDetail detailAngsuran = new TransactionDetail(transaction.getIdTransaction(), angsuranKe, "", Float.toString(jumlahWajibBayar), 1);
                    TransactionDetail detail = transactionController.insertDetail(detailAngsuran);
                    if (detail != null) {
                        JOptionPane.showMessageDialog(null, "Angsuran pembayaran anda berhasil ! ");
                        frame.setVisible(false);
                    } else {
                        JOptionPane.showMessageDialog(null, "Angsuran pembayaran anda gagal ! ");
                    }
                    transactionController.memberPaymentView();
                }
            }
        });

        this.btnLogout.setBounds(425, 525, 100, 26);
        this.frame.add(btnLogout);

        this.btnLogout.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.setVisible(false);
                Data.isLoggedIn = false;
                Data.userLoggin = null;
                transactionController.loginView();
            }
        });

        setDataTransaction();

        this.frame.setTitle("Member Payment View");
        this.frame.setSize(550, 600);
        this.frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.frame.setLayout(null);
        this.frame.setVisible(true);
        this.frame.setLocationRelativeTo(null);
    }

    public void setDataTransaction() {

        String[] colTable = {"Id", "Tgl Pembayaran", "Total Bayar", "Status"};
        this.tableModel = new DefaultTableModel(null, colTable);
        this.tableModel.setRowCount(0);
        for (int i = 0; i < transactionDetails.size(); i++) {
            this.tableModel.addRow(new Object[]{(i + 1), transactionDetails.get(i).getDateTransaction(), transactionDetails.get(i).getTotalPayment(), transactionDetails.get(i).getStatus()});
        }
        this.table.setModel(tableModel);
        this.scroll = new JScrollPane(this.table);
        this.scroll.setBounds(24, 300, 500, 200);
        this.frame.add(this.scroll);
    }

}
