/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views;

import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JTable;

/**
 *
 * @author USER
 */
public class PropertyView extends ComponentView{

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
        
        etLuas.setBounds(124, 148, 240, 26);
        add(etLuas);
        
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
        
        
        String[] columnsNames = {"firstName", "LastName", "sport", "# ofYear", "vegetarian"};

        Object[][] data = {{"Katty", "Smith", "SnowBoard", new Integer(5), new Boolean(false)}, {"Jhon", "Doe", "Rowing", new Integer(3), new Boolean(true)},
                {"Sue", "Black", "Knitting", new Integer(2), new Boolean(false)},{"Jane", "White", "Speed ride", new Integer(20), new Boolean(true)},{"Katty", "Smith", "SnowBoard", new Integer(5), new Boolean(false)}, {"Jhon", "Doe", "Rowing", new Integer(3), new Boolean(true)},
                {"Sue", "Black", "Knitting", new Integer(2), new Boolean(false)},{"Jane", "White", "Speed ride", new Integer(20), new Boolean(true)},{"Katty", "Smith", "SnowBoard", new Integer(5), new Boolean(false)}, {"Jhon", "Doe", "Rowing", new Integer(3), new Boolean(true)},
                {"Sue", "Black", "Knitting", new Integer(2), new Boolean(false)},{"Jane", "White", "Speed ride", new Integer(20), new Boolean(true)},{"Katty", "Smith", "SnowBoard", new Integer(5), new Boolean(false)}, {"Jhon", "Doe", "Rowing", new Integer(3), new Boolean(true)},
                {"Sue", "Black", "Knitting", new Integer(2), new Boolean(false)},{"Jane", "White", "Speed ride", new Integer(20), new Boolean(true)},{"Katty", "Smith", "SnowBoard", new Integer(5), new Boolean(false)}, {"Jhon", "Doe", "Rowing", new Integer(3), new Boolean(true)},
                {"Sue", "Black", "Knitting", new Integer(2), new Boolean(false)},{"Jane", "White", "Speed ride", new Integer(20), new Boolean(true)}};

        JTable t = new JTable(data, columnsNames);
        add(t.getTableHeader(), BorderLayout.PAGE_START);
        add(t, BorderLayout.CENTER);
        t.setBounds(400, 48, 500, 225);
        add(t);
        
        
        
        setTitle("PROPERTY");
        setLayout(null);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(950, 450);
        setVisible(true);
        
    }
    
}
