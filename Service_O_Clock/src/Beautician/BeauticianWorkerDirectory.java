/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Beautician;

import java.util.ArrayList;

/**
 *
 * @author 91730
 */
public class BeauticianWorkerDirectory {
    
    private ArrayList<BeauticianWorker> beauticianList;
//    private FieldWorker FieldWorker;

    public BeauticianWorkerDirectory() {
        this.beauticianList = new ArrayList<>();
    }
    
    
//    public FieldWorkerDirectory() {
//        beauticianList = new ArrayList<FieldWorker>();
//    }

//    public ArrayList<FieldWorker> getFieldWorkerList() {
//        return FieldWorkerList;
//    }
//
//
//    public void setFieldWorkerList(ArrayList<FieldWorker> FieldWorkerList) {
//        this.FieldWorkerList = FieldWorkerList;
//    }\

    public ArrayList<BeauticianWorker> getBeauticianList() {
        return beauticianList;
    }

    public void setBeauticianList(ArrayList<BeauticianWorker> beauticianList) {
        this.beauticianList = beauticianList;
    }

    
    public BeauticianWorker createBeauticianWorker(String name, String username){
        BeauticianWorker bW = new BeauticianWorker(name, username);
        beauticianList.add(bW);
        return bW;
    }
    
    public void deleteBeauticianWorker(String username){
         for(int i=0; i < beauticianList.size(); i++){
            if(beauticianList.get(i).getBeauticianName().equals(username)){
                beauticianList.remove(i);
            }
        }
    }
    
}
