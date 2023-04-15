/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package WorkQueue;

import java.util.ArrayList;

/**
 *
 * @author hi
 */
public class SalonWorkQueue {
    ArrayList<SalonWorkRequest> salonWorkRequestList;
    
    public SalonWorkQueue() {
        salonWorkRequestList = new ArrayList();
    }

    public ArrayList<SalonWorkRequest> getSalonWorkRequestList() {
        return salonWorkRequestList;
    }

    public void setSalonWorkRequestList(ArrayList<SalonWorkRequest> salonWorkRequestList) {
        this.salonWorkRequestList = salonWorkRequestList;
    }
    
    
}
