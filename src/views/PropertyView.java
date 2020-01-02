/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views;

import controllers.PropertyController;
import data.Data;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import static jdk.nashorn.internal.runtime.Debug.id;
import models.Property;
import models.Staff;
import static views.ComponentView.etLebar;
import static views.ComponentView.etLuas;
import static views.ComponentView.etPanjang;
import static views.StaffView.resetFieldStaff;

/**
 *
 * @author USER
 */
public class PropertyView extends ComponentView {

    static PropertyController propertyController = new PropertyController();
    DefaultTableModel tableModel;
    private int idProperty;
    private String namaProperty;
    private String tipeProperty;
    private float panjangProperty = 0;
    private float lebarProperty = 0;
    private float luasProperty = 0;
    private float hargaProperty = 0;
    private int totalProperty;

    public PropertyView() {

        lblNama.setBounds(24, 48, 100, 26);
        add(lblNama);

        etName.setBounds(124, 48, 240, 26);
        add(etName);

        lblPanjang.setBounds(24, 96, 100, 26);
        add(lblPanjang);

        etPanjang.setBounds(124, 96, 70, 26);
        add(etPanjang);

        lblLebar.setBounds(224, 96, 100, 26);
        add(lblLebar);

        etLebar.setBounds(295, 96, 70, 26);
        add(etLebar);

        lblLuas.setBounds(24, 148, 100, 26);
        add(lblLuas);

        etLuas.setBounds(124, 148, 100, 26);
        etLuas.setEditable(false);
        add(etLuas);
        
        
        lblTotal.setBounds(244, 148, 100, 26);
        add(lblTotal);

        etTotal.setBounds(295, 148, 70, 26);
        add(etTotal);

        lblTipe.setBounds(24, 198, 100, 26);
        add(lblTipe);

        jcTipeProperty.setBounds(124, 198, 240, 26);
        add(jcTipeProperty);

        lblHarga.setBounds(24, 248, 100, 26);
        add(lblHarga);

        etHarga.setBounds(124, 248, 240, 26);
        add(etHarga);

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

        etPanjang.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
            }

            @Override
            public void keyPressed(KeyEvent e) {
            }

            @Override
            public void keyReleased(KeyEvent e) {
                lebarProperty = etLebar.getText().equals("") ? 0 : Float.valueOf(etLebar.getText());
                panjangProperty = etPanjang.getText().equals("") ? 0 : Float.valueOf(etPanjang.getText());
                luasProperty = panjangProperty * lebarProperty;
                etLuas.setText(String.valueOf(luasProperty));
            }
        });

        etLebar.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
            }

            @Override
            public void keyPressed(KeyEvent e) {
            }

            @Override
            public void keyReleased(KeyEvent e) {
                lebarProperty = etLebar.getText().equals("") ? 0 : Float.valueOf(etLebar.getText());
                panjangProperty = etPanjang.getText().equals("") ? 0 : Float.valueOf(etPanjang.getText());
                luasProperty = panjangProperty * lebarProperty;
                etLuas.setText(String.valueOf(luasProperty));
            }
        });

        initDataProperty();

        btnCancel.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                resetFieldProperty();
            }
        });

        btnSimpan.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                saveProperty();
            }
        });

        btnEdit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int index = tblProperty.getSelectedRow();
                editProperty(index);
            }
        });

        btnDelete.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int index = tblProperty.getSelectedRow();
                deleteProperty(index);
            }
        });

        btnUpdate.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int index = tblProperty.getSelectedRow();
                updateProperty(index);
            }
        });

        btnClose.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                resetFieldProperty();
                setVisible(false);
                propertyController.mainView();
            }
        });

        setTitle("PROPERTY");
        setLayout(null);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(950, 450);
        setVisible(true);

    }

    public void initDataProperty() {
        
        for (int i = 0; i < Data.typePropertyArr.size(); i++) {
            jcTipeProperty.addItem(Data.typePropertyArr.get(i).getNamaTypeProperty());
        }
        
        String[] headerTable = {"#", "Name", "Panjang", "Lebar", "Luas","Total", "Tipe","Harga"};
        tableModel = new DefaultTableModel(null, headerTable);
        tableModel.setRowCount(0);
        for (int i = 0; i < Data.propertyArr.size(); i++) {
            tableModel.addRow(new Object[]{(i + 1), Data.propertyArr.get(i).getNamaProperty(), Data.propertyArr.get(i).getPanjangProperty(), Data.propertyArr.get(i).getLebarProperty(), Data.propertyArr.get(i).getLuasProperty(),Data.propertyArr.get(i).getTotalProperty(), Data.propertyArr.get(i).getTipeProperty(),Data.propertyArr.get(i).getHargaProperty()});
        }
        tblProperty.setModel(tableModel);
        tblPopertyScroll.setBounds(400, 48, 500, 225);
        add(tblPopertyScroll);
    }

    public static void resetFieldProperty() {
        etName.setText("");
        etHarga.setText("");
        etLebar.setText("");
        etPanjang.setText("");
        etLuas.setText("");
        jcTipeProperty.setSelectedItem("");
    }

    public void saveProperty() {
        namaProperty = etName.getText();
        hargaProperty = Float.valueOf(etHarga.getText());
        lebarProperty = Float.valueOf(etLebar.getText());
        panjangProperty = Float.valueOf(etPanjang.getText());
        luasProperty = Float.valueOf(etLuas.getText());
        tipeProperty = jcTipeProperty.getSelectedItem().toString();
        totalProperty = Integer.parseInt(etTotal.getText());
        idProperty = (Data.propertyArr.size() + 1);
        if (namaProperty.equals("")) {
            JOptionPane.showMessageDialog(null, "Nama property wajib diisi !");
        } else if (tipeProperty.equals("")) {
            JOptionPane.showMessageDialog(null, "Tipe property wajib diisi !");
        } else if (luasProperty < 0) {
            JOptionPane.showMessageDialog(null, "Luas property wajib diisi !");
        } else if (panjangProperty < 0) {
            JOptionPane.showMessageDialog(null, "Panjang property wajib diisi !");
        } else if (lebarProperty < 0) {
            JOptionPane.showMessageDialog(null, "Lebar property wajib diisi !");
        } else if (hargaProperty < 0) {
            JOptionPane.showMessageDialog(null, "Harga property wajib diisi !");
        } else if (totalProperty < 0) {
            JOptionPane.showMessageDialog(null, "Total property wajib diisi !");
        } else {
            Property property = new Property(idProperty, namaProperty, tipeProperty, panjangProperty, lebarProperty, luasProperty, hargaProperty,totalProperty);
            propertyController.insert(property);
            initDataProperty();
            resetFieldProperty();
        }
    }

    public void deleteProperty(int id) {
        if (id < 0) {
            JOptionPane.showMessageDialog(null, "Pilih data yang akan dihapus !");
        } else {
            int dialogButton = JOptionPane.YES_NO_OPTION;
            int dialogResult = JOptionPane.showConfirmDialog(null, "Apakah anda akan menghapus data ini ?", "Warning", dialogButton);
            if (dialogResult == JOptionPane.YES_OPTION) {
                int idProperty = Data.propertyArr.get(id).getIdProperty();
                Property propertyDelete = propertyController.delete(idProperty);
                if (propertyDelete == null) {
                    JOptionPane.showMessageDialog(null, "Gagal menghapus data Property !");
                } else {
                    initDataProperty();
                    JOptionPane.showMessageDialog(null, "Data Property berhasil dihapus !");
                }
            } else {
                JOptionPane.showMessageDialog(null, "Menghapus data Property dibatalkan !");
            }

        }
    }

    public void editProperty(int id) {
        if (id < 0) {
            JOptionPane.showMessageDialog(null, "Pilih data yang akan diedit !");
        } else {
            int idProperty = Data.propertyArr.get(id).getIdProperty();
            Property property = propertyController.edit(idProperty);
            resetFieldProperty();
            etName.setText(property.getNamaProperty());
            etHarga.setText(String.valueOf(property.getHargaProperty()));
            etLebar.setText(String.valueOf(property.getLebarProperty()));
            etPanjang.setText(String.valueOf(property.getPanjangProperty()));
            etLuas.setText(String.valueOf(property.getLuasProperty()));
            jcTipeProperty.setSelectedItem(property.getTipeProperty());
            etTotal.setText(String.valueOf(property.getTotalProperty()));
        }
    }

    public void updateProperty(int idProperty) {
        if (idProperty < 0) {
            JOptionPane.showMessageDialog(null, "Pilih data yang akan update !");
        } else {
            namaProperty = etName.getText();
            hargaProperty = Float.valueOf(etHarga.getText());
            lebarProperty = Float.valueOf(etLebar.getText());
            panjangProperty = Float.valueOf(etPanjang.getText());
            luasProperty = Float.valueOf(etLuas.getText());
            tipeProperty = jcTipeProperty.getSelectedItem().toString();
            totalProperty = Integer.parseInt(etTotal.getText());
            idProperty = (Data.propertyArr.size() + 1);
            if (namaProperty.equals("")) {
                JOptionPane.showMessageDialog(null, "Nama property wajib diisi !");
            } else if (tipeProperty.equals("")) {
                JOptionPane.showMessageDialog(null, "Tipe property wajib diisi !");
            } else if (luasProperty < 0) {
                JOptionPane.showMessageDialog(null, "Luas property wajib diisi !");
            } else if (panjangProperty < 0) {
                JOptionPane.showMessageDialog(null, "Panjang property wajib diisi !");
            } else if (lebarProperty < 0) {
                JOptionPane.showMessageDialog(null, "Lebar property wajib diisi !");
            } else if (hargaProperty < 0) {
                JOptionPane.showMessageDialog(null, "Harga property wajib diisi !");
            }else if (totalProperty < 0) {
                JOptionPane.showMessageDialog(null, "Total property wajib diisi !");
            } else {
                Property property = new Property(idProperty, namaProperty, tipeProperty, panjangProperty, lebarProperty, luasProperty, hargaProperty,totalProperty);
                Property propertyUpdate = propertyController.update(property, idProperty);
                if (propertyUpdate == null) {
                    JOptionPane.showMessageDialog(null, "Gagal mengupdate data Property !");
                } else {
                    initDataProperty();
                    resetFieldProperty();
                    JOptionPane.showMessageDialog(null, "Data Property berhasil diperbarui !");
                }

            }
        }
    }

}
