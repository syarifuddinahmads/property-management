/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import data.Data;
import interfaces.StaffInterface;
import java.util.ArrayList;
import models.Staff;

/**
 *
 * @author udin
 */
public class StaffService implements StaffInterface {

    @Override
    public Staff getData() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Staff insert(Staff staff) {
        Data.staffArr.add(staff);
        return staff;
    }

    @Override
    public Staff edit(int id) {
        Staff staff = null;
        for (int i = 0; i < Data.staffArr.size(); i++) {
            if (Data.staffArr.get(i).getIdStaff() == id) {
                staff = Data.staffArr.get(i);
            }
        }
        return staff;

    }

    @Override
    public Staff search(int id) {
        Staff staff = null;
        for (int i = 0; i < Data.staffArr.size(); i++) {
            if (Data.staffArr.get(i).getIdStaff() == id) {
                staff = Data.staffArr.get(i);
            }
        }
        return staff;
    }

    @Override
    public Staff delete(int id) {
        Staff staff = null;
        for (int i = 0; i < Data.staffArr.size(); i++) {
            if (Data.staffArr.get(i).getIdStaff() == id) {
                staff = Data.staffArr.get(i);
                Data.staffArr.remove(i);
            }
        }
        return staff;
    }

    @Override
    public Staff update(Staff staff, int id) {
        Staff staffUpdate = Data.staffArr.get(id);
        staffUpdate.setUsername(staff.getUsername());
        staffUpdate.setPassword(staff.getPassword());
        staffUpdate.setNamaStaff(staff.getNamaStaff());
        staffUpdate.setNoHpStaff(staff.getNoHpStaff());
        staffUpdate.setAlamatStaff(staff.getAlamatStaff());
        return staffUpdate;
    }

    @Override
    public void detail() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
