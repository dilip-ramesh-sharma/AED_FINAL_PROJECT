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
public class StoreServiceWorkQueue {
    private ArrayList<StoreServiceWorkRequest> storeServiceRequestList;

    public StoreServiceWorkQueue(){
        this.storeServiceRequestList = new ArrayList<StoreServiceWorkRequest>();
    }

    public ArrayList<StoreServiceWorkRequest> getStoreServiceRequestList() {
        return storeServiceRequestList;
    }

    public void setStoreServiceRequestList(ArrayList<StoreServiceWorkRequest> storeServiceRequestList) {
        this.storeServiceRequestList = storeServiceRequestList;
    }
    
    
}
