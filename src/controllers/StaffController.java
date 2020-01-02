/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import models.Staff;
import services.StaffService;
import views.StaffView;

/**
 *
 * @author udin
 */
public class StaffController extends MainController {

    static StaffService staffService = new StaffService();

    @Override
    public void staffView() {
        StaffView staffView = new StaffView();
    }

    public Staff insert(Staff staff) {
        return this.staffService.insert(staff);
    }

    public Staff edit(int id) {
        return this.staffService.edit(id);
    }

    public Staff delete(int id) {
        return this.staffService.delete(id);
    }
    
    public Staff update(Staff staff, int id){
        return this.staffService.update(staff, id);
    }

}
