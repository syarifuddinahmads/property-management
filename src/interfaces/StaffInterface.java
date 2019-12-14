/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

import models.Staff;



/**
 *
 * @author udin
 */
public interface StaffInterface {
    public Staff getData();
    public Staff insert(Staff staff);
    public Staff edit(int id);
    public Staff search(int id);
    public Staff delete(int id);
    public Staff update(Staff staff,int id);
    public void detail();
    
}
