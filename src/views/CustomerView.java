/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views;

import controllers.CustomerController;
import data.Data;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import models.Customer;
import models.Staff;
import static views.ComponentView.etName;

/**
 *
 * @author udin
 */
public class CustomerView extends ComponentView {
    static CustomerController customerController = new CustomerController();
    DefaultTableModel tableModel;
    String nama = etName.getText();
    String username;
    String password;
    String noHp;
    int id;
    String alamat;

    public CustomerView() {
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

        btnEdit.setBounds(400, 298, 100, 26);
        add(btnEdit);

        btnUpdate.setBounds(535, 298, 100, 26);
        add(btnUpdate);

        btnDelete.setBounds(665, 298, 100, 26);
        add(btnDelete);

        btnClose.setBounds(800, 298, 100, 26);
        add(btnClose);
        
        initDataCustomer();

        btnCancel.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                resetFieldCustomer();
            }
        });

        btnSimpan.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                saveCustomer();
            }
        });

        btnEdit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int index = tblUser.getSelectedRow();
                editCustomer(index);
            }
        });

        btnDelete.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int index = tblUser.getSelectedRow();
                deleteCustomer(index);
            }
        });

        btnUpdate.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int index = tblUser.getSelectedRow();
                updateCustomer(index);
            }
        });

        btnClose.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                resetFieldCustomer();
                setVisible(false);
            }
        });

        setTitle("CUSTOMER");
        setLayout(null);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(925, 550);
        setVisible(true);

    }
    
    public void initDataCustomer() {
        String[] headerTable = {"#", "Name", "No Telp", "Alamat"};
        tableModel = new DefaultTableModel(null, headerTable);
        tableModel.setRowCount(0);
        for (int i = 0; i < Data.customersArr.size(); i++) {
            tableModel.addRow(new Object[]{(i + 1), Data.customersArr.get(i).getNamaCustomer(), Data.customersArr.get(i).getNoHpCustomer(), Data.customersArr.get(i).getAlamatCustomer()});
        }
        tblUser.setModel(tableModel);
        tblUserScroll.setBounds(400, 48, 500, 225);
        add(tblUserScroll);
    }

    public static void resetFieldCustomer() {
        etName.setText("");
        etPassword.setText("");
        etUsername.setText("");
        etAlamat.setText("");
        etNoHp.setText("");
    }

    public void saveCustomer() {
        nama = etName.getText();
        username = etUsername.getText();
        password = etPassword.toString();
        noHp = etNoHp.getText();
        id = (Data.customersArr.size() + 1);
        alamat = etAlamat.getText();
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
        } else {
            Customer customer = new Customer(id, nama, noHp, alamat, id, username, password);
            customerController.insert(customer);
            initDataCustomer();
            resetFieldCustomer();
        }
    }

    public void deleteCustomer(int id) {
        if (id < 0) {
            JOptionPane.showMessageDialog(null, "Pilih data yang akan dihapus !");
        } else {
            int dialogButton = JOptionPane.YES_NO_OPTION;
            int dialogResult = JOptionPane.showConfirmDialog(null, "Apakah anda akan menghapus data ini ?", "Warning", dialogButton);
            if (dialogResult == JOptionPane.YES_OPTION) {
                int idCustomer = Data.customersArr.get(id).getIdCustomer();
                Customer customerDelete = customerController.delete(idCustomer);
                if (customerDelete == null) {
                    JOptionPane.showMessageDialog(null, "Gagal menghapus data staff !");
                } else {
                    initDataCustomer();
                    JOptionPane.showMessageDialog(null, "Data staff berhasil dihapus !");
                }
            } else {
                JOptionPane.showMessageDialog(null, "Menghapus data staff dibatalkan !");
            }

        }
    }

    public void editCustomer(int id) {
        if (id < 0) {
            JOptionPane.showMessageDialog(null, "Pilih data yang akan diedit !");
        } else {
            int idCustomer = Data.customersArr.get(id).getIdCustomer();
            Customer customer = customerController.edit(idCustomer);
            resetFieldCustomer();
            etUsername.setText(customer.getUsername());
            etPassword.setText("");
            etName.setText(customer.getNamaCustomer());
            etNoHp.setText(customer.getNoHpCustomer());
            etAlamat.setText(customer.getAlamatCustomer());
        }
    }

    public void updateCustomer(int idCustomer) {
        if (idCustomer < 0) {
            JOptionPane.showMessageDialog(null, "Pilih data yang akan update !");
        } else {
            nama = etName.getText();
            username = etUsername.getText();
            password = etPassword.toString();
            noHp = etNoHp.getText();
            id = (Data.staffArr.size() + 1);
            alamat = etAlamat.getText();
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
            } else {
                Customer customer = new Customer(id, nama, noHp, alamat, id, username, password);
                Customer customerUpdate = customerController.update(customer, idCustomer);
                if (customerUpdate == null) {
                    JOptionPane.showMessageDialog(null, "Gagal mengupdate data staff !");
                } else {
                    initDataCustomer();
                    resetFieldCustomer();
                    JOptionPane.showMessageDialog(null, "Data staff berhasil diperbarui !");
                }
                
            }
        }
    }

}
