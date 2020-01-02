/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views;

import controllers.StaffController;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JTable;
import models.Staff;
import models.User;
import data.Data;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author udin
 */
public class StaffView extends ComponentView {

    StaffController staffController = new StaffController();
    DefaultTableModel tableModel;
    String nama;
    String username;
    String password;
    String noHp;
    int id;
    String alamat;

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

        btnEdit.setBounds(400, 298, 100, 26);
        add(btnEdit);

        btnUpdate.setBounds(535, 298, 100, 26);
        add(btnUpdate);

        btnDelete.setBounds(665, 298, 100, 26);
        add(btnDelete);

        btnClose.setBounds(800, 298, 100, 26);
        add(btnClose);

        initDataStaff();

        btnCancel.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                resetFieldStaff();
            }
        });

        btnSimpan.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                saveStaff();
            }
        });

        btnEdit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int index = tblUser.getSelectedRow();
                editStaff(index);
            }
        });

        btnDelete.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int index = tblUser.getSelectedRow();
                deleteStaff(index);
            }
        });

        btnUpdate.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int index = tblUser.getSelectedRow();
                updateStaff(index);
            }
        });

        btnClose.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                resetFieldStaff();
                setVisible(false);
                staffController.mainView();
            }
        });

        setTitle("STAFF");
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
        for (int i = 0; i < Data.staffArr.size(); i++) {
            tableModel.addRow(new Object[]{(i + 1), Data.staffArr.get(i).getNamaStaff(), Data.staffArr.get(i).getNoHpStaff(), Data.staffArr.get(i).getAlamatStaff()});
        }
        tblUser.setModel(tableModel);
        tblUserScroll.setBounds(400, 48, 500, 225);
        add(tblUserScroll);
    }

    public static void resetFieldStaff() {
        etName.setText("");
        etPassword.setText("");
        etUsername.setText("");
        etAlamat.setText("");
        etNoHp.setText("");
    }

    public void saveStaff() {
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
            Staff staff = new Staff(id, nama, noHp, alamat, id, username, password);
            staffController.insert(staff);
            initDataStaff();
            resetFieldStaff();
        }
    }

    public void deleteStaff(int id) {
        if (id < 0) {
            JOptionPane.showMessageDialog(null, "Pilih data yang akan dihapus !");
        } else {
            int dialogButton = JOptionPane.YES_NO_OPTION;
            int dialogResult = JOptionPane.showConfirmDialog(null, "Apakah anda akan menghapus data ini ?", "Warning", dialogButton);
            if (dialogResult == JOptionPane.YES_OPTION) {
                int idStaff = Data.staffArr.get(id).getIdStaff();
                Staff staffDelete = staffController.delete(idStaff);
                if (staffDelete == null) {
                    JOptionPane.showMessageDialog(null, "Gagal menghapus data staff !");
                } else {
                    initDataStaff();
                    JOptionPane.showMessageDialog(null, "Data staff berhasil dihapus !");
                }
            } else {
                JOptionPane.showMessageDialog(null, "Menghapus data staff dibatalkan !");
            }

        }
    }

    public void editStaff(int id) {
        if (id < 0) {
            JOptionPane.showMessageDialog(null, "Pilih data yang akan diedit !");
        } else {
            int idStaff = Data.staffArr.get(id).getIdStaff();
            Staff staff = staffController.edit(idStaff);
            resetFieldStaff();
            etUsername.setText(staff.getUsername());
            etPassword.setText("");
            etName.setText(staff.getNamaStaff());
            etNoHp.setText(staff.getNoHpStaff());
            etAlamat.setText(staff.getAlamatStaff());
        }
    }

    public void updateStaff(int idStaff) {
        if (idStaff < 0) {
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
                Staff staff = new Staff(id, nama, noHp, alamat, id, username, password);
                Staff staffUpdate = staffController.update(staff, idStaff);
                if (staffUpdate == null) {
                    JOptionPane.showMessageDialog(null, "Gagal mengupdate data staff !");
                } else {
                    initDataStaff();
                    resetFieldStaff();
                    JOptionPane.showMessageDialog(null, "Data staff berhasil diperbarui !");
                }
                
            }
        }
    }

}
