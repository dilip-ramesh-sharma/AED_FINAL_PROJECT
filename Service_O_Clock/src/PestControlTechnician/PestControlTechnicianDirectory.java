/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PestControlTechnician;

import java.util.ArrayList;

/**
 *
 * @author tanujkodali
 */
public class PestControlTechnicianDirectory {
    private ArrayList<PestControlTechnician> pestControlTechnicianList;
    private PestControlTechnician technician;
    
    public PestControlTechnicianDirectory() {
        pestControlTechnicianList = new ArrayList<PestControlTechnician>();
    }

    public ArrayList<PestControlTechnician> getPestControlTechnicianList() {
        return pestControlTechnicianList;
    }

    public void setPestControlTechnicianList(ArrayList<PestControlTechnician> pestControlTechnicianList) {
        this.pestControlTechnicianList = pestControlTechnicianList;
    }


    public PestControlTechnician getTechnician() {
        return technician;
    }

    public void setTechnician(PestControlTechnician technician) {
        this.technician = technician;
    }
    
     public PestControlTechnician createPestControlTechnician(String name, String username){
        technician = new PestControlTechnician(name, username);
        pestControlTechnicianList.add(technician);
        return technician;
    }
    
    public void deleteAmbulance(String username){
         for(int i=0; i < pestControlTechnicianList.size(); i++){
            if(pestControlTechnicianList.get(i).getTechnicianName().equals(username)){
                pestControlTechnicianList.remove(i);
            }
        }
    }
}
