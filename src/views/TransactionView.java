/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views;

import controllers.CustomerController;
import controllers.TransactionController;
import data.Data;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import models.Customer;
import models.Property;
import models.Staff;
import models.Transaction;
import static views.ComponentView.etBiayaAngsuran;
import static views.ComponentView.etDpAngsuran;
import static views.ComponentView.etHarga;
import static views.ComponentView.etName;
import static views.ComponentView.jcTotalAngsuran;

/**
 *
 * @author USER
 */
public class TransactionView extends ComponentView {

    static CustomerController customerController = new CustomerController();
    static TransactionController transactionController = new TransactionController();

    DefaultTableModel tableModel;
    String nama;
    String username;
    String password;
    String noHp;
    int id;
    String alamat;
    int totalAngsuran;
    float biayaAngsuran;
    float dpAngsuran;
    float grandTotalAngsuran;

    public TransactionView() {

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

        lblHarga.setBounds(400, 300, 100, 26);
        add(lblHarga);

        etHarga.setBounds(400, 330, 150, 26);
        etHarga.setEditable(false);
        add(etHarga);

        lblTotalAngsuran.setBounds(600, 300, 100, 26);
        add(lblTotalAngsuran);

        jcTotalAngsuran.setBounds(600, 330, 100, 26);
        add(jcTotalAngsuran);

        lblBiayaAngsuran.setBounds(750, 300, 150, 26);
        add(lblBiayaAngsuran);

        etBiayaAngsuran.setBounds(750, 330, 150, 26);
        etBiayaAngsuran.setEditable(false);
        add(etBiayaAngsuran);

        lblDpAngsuran.setBounds(400, 370, 100, 26);
        add(lblDpAngsuran);

        etDpAngsuran.setBounds(400, 400, 150, 26);
        add(etDpAngsuran);

        lblGrandTotalAngsuran.setBounds(600, 370, 100, 26);
        etGrandTotalAngsuran.setEditable(false);
        add(lblGrandTotalAngsuran);

        etGrandTotalAngsuran.setBounds(600, 400, 150, 26);
        add(etGrandTotalAngsuran);

        btnClose.setBounds(535, 475, 100, 26);
        add(btnClose);

        btnCancel.setBounds(665, 475, 100, 26);
        add(btnCancel);

        btnSimpan.setBounds(800, 475, 100, 26);
        add(btnSimpan);

        tblProperty.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                int index = tblProperty.getSelectedRow();
                Property propertySelected = Data.propertyArr.get(index);
                etHarga.setText(Float.toString(propertySelected.getHargaProperty()));
            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {

            }

            @Override
            public void mouseExited(MouseEvent e) {

            }
        });

        jcTotalAngsuran.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String tenor = jcTotalAngsuran.getSelectedItem().toString();
                if (!tenor.equals("0")) {
                    int index = tblProperty.getSelectedRow();
                    Property propertySelected = Data.propertyArr.get(index);
                    int angsuran = Integer.parseInt(tenor) * 12;
                    if(etDpAngsuran.getText().equals("")){
                        biayaAngsuran = propertySelected.getHargaProperty() / angsuran;
                    }else{
                        dpAngsuran = Float.valueOf(etDpAngsuran.getText());
                        biayaAngsuran = (propertySelected.getHargaProperty() - dpAngsuran) / angsuran;
                    }
                    etBiayaAngsuran.setText(String.valueOf(biayaAngsuran));
                }
            }
        });

        etDpAngsuran.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int index = tblProperty.getSelectedRow();
                Property propertySelected = Data.propertyArr.get(index);
                String tenor = jcTotalAngsuran.getSelectedItem().toString();
                dpAngsuran = Float.valueOf(etDpAngsuran.getText());
                int angsuran = Integer.parseInt(tenor) * 12;
                biayaAngsuran = (propertySelected.getHargaProperty() - dpAngsuran) / angsuran;
                etBiayaAngsuran.setText(String.valueOf(biayaAngsuran));
            }
        });

        btnSimpan.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                saveTransaction();
            }
        });

        btnCancel.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                resetFieldCustomer();
            }
        });

        btnClose.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
                transactionController.mainView();
            }
        });

        initDataProperty();

        setTitle("TRANSACTION");
        setLayout(null);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(950, 575);
        setVisible(true);

    }

    public void initDataProperty() {

        for (int i = 0; i < Data.typePropertyArr.size(); i++) {
            jcTipeProperty.addItem(Data.typePropertyArr.get(i).getNamaTypeProperty());
        }

        jcTotalAngsuran.addItem(0);
        jcTotalAngsuran.addItem(1);
        jcTotalAngsuran.addItem(3);
        jcTotalAngsuran.addItem(5);
        jcTotalAngsuran.addItem(10);

        String[] headerTable = {"#", "Name", "Panjang", "Lebar", "Luas", "Total", "Tipe", "Harga"};
        tableModel = new DefaultTableModel(null, headerTable);
        tableModel.setRowCount(0);
        for (int i = 0; i < Data.propertyArr.size(); i++) {
            tableModel.addRow(new Object[]{(i + 1), Data.propertyArr.get(i).getNamaProperty(), Data.propertyArr.get(i).getPanjangProperty(), Data.propertyArr.get(i).getLebarProperty(), Data.propertyArr.get(i).getLuasProperty(), Data.propertyArr.get(i).getTotalProperty(), Data.propertyArr.get(i).getTipeProperty(), Data.propertyArr.get(i).getHargaProperty()});
        }
        tblProperty.setModel(tableModel);
        tblPopertyScroll.setBounds(400, 48, 500, 225);
        add(tblPopertyScroll);
    }

    public static void resetFieldCustomer() {
        etName.setText("");
        etPassword.setText("");
        etUsername.setText("");
        etAlamat.setText("");
        etNoHp.setText("");
        etDpAngsuran.setText("");
        jcTotalAngsuran.setSelectedIndex(0);
        etBiayaAngsuran.setText("");
        etGrandTotalAngsuran.setText("");
        etHarga.setText("");
    }

    public void saveTransaction() {
        nama = etName.getText();
        username = etUsername.getText();
        password = etPassword.toString();
        noHp = etNoHp.getText();
        id = (Data.customersArr.size() + 1);
        alamat = etAlamat.getText();
        totalAngsuran = (int) jcTotalAngsuran.getSelectedItem();
        String biaya = etBiayaAngsuran.getText();
        String dp = etDpAngsuran.getText();
        String grandTotal = etGrandTotalAngsuran.getText();
        int indexProperty = tblProperty.getSelectedRow();
        if (username.equals("")) {
            JOptionPane.showMessageDialog(null, "Username wajib diisi !");
        } else if (password.equals("")) {
            JOptionPane.showMessageDialog(null, "Password wajib diisi !");
        } else if (nama.equals("")) {
            JOptionPane.showMessageDialog(null, "Nama wajib diisi !");
        } else if (noHp.equals("")) {
            JOptionPane.showMessageDialog(null, "No HP wajib diisi !");
        } else if (alamat.equals("")) {
            JOptionPane.showMessageDialog(null, "Alamat wajib diisi !");
        } else if (indexProperty < 0) {
            JOptionPane.showMessageDialog(null, "Property belum dipilih !");
        } else {
            dpAngsuran = Float.valueOf(dp) ;
            biayaAngsuran = Float.valueOf(biaya);
            String tenor = jcTotalAngsuran.getSelectedItem().toString();
            totalAngsuran = Integer.parseInt(tenor);
            grandTotalAngsuran = Float.valueOf(grandTotal);
            Property property = Data.propertyArr.get(indexProperty);
            Staff staff = Data.staffLoggin;
            Customer customer = new Customer(id, nama, noHp, alamat, id, username, password);
            Transaction transaction = new Transaction((Data.transactionArr.size() + 1), staff, customer, property, dpAngsuran, biayaAngsuran, totalAngsuran, grandTotalAngsuran);
            transactionController.insert(transaction);
            customerController.insert(customer);
            resetFieldCustomer();
        }
    }
}
