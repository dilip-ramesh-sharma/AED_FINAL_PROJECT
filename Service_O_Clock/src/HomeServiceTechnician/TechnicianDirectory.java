/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package HomeServiceTechnician;

import java.util.ArrayList;

/**
 *
 * @author 91730
 */
public class TechnicianDirectory {
    
    private ArrayList<Technician> technicianList;
//    private FieldWorker FieldWorker;

    public TechnicianDirectory() {
        this.technicianList = new ArrayList<>();
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

    public ArrayList<Technician> getTechnicianList() {
        return technicianList;
    }

    public void setTechnicianList(ArrayList<Technician> technicianList) {
        this.technicianList = technicianList;
    }


    public Technician createTechnician(String name, String username){
        Technician technician = new Technician(name, username);
        technicianList.add(technician);
        return technician;
    }
    
    public void deleteTechnician(String username){
         for(int i=0; i < technicianList.size(); i++){
            if(technicianList.get(i).getTechnicianUsrnme().equals(username)){
                technicianList.remove(i);
            }
        }
    }
    
}
