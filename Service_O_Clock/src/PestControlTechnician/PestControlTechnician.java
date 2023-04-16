/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.PestControlTechnician;

import java.util.ArrayList;

/**
 *
 * @author tanujkodali
 */
public class PestControlTechnician {
    private String TechnicianName;
    private String TechnicianUsername;
    //private ArrayList<EmergencyWorkRequest> emgRequestList;
    private String TechnicianAddress;
    private String TechnicianPhNum;
    private Boolean availability = true;
            
    public  PestControlTechnician(String name, String userName){
        this.TechnicianName = name;
        this.TechnicianUsername = userName;
     //   emgRequestList = new ArrayList<EmergencyWorkRequest>();
    }

    public String getTechnicianName() {
        return TechnicianName;
    }

    public void setTechnicianName(String TechnicianName) {
        this.TechnicianName = TechnicianName;
    }

    public String getTechnicianUsername() {
        return TechnicianUsername;
    }

    public void setTechnicianUsername(String TechnicianUsername) {
        this.TechnicianUsername = TechnicianUsername;
    }

    public String getTechnicianAddress() {
        return TechnicianAddress;
    }

    public void setTechnicianAddress(String TechnicianAddress) {
        this.TechnicianAddress = TechnicianAddress;
    }

    public String getTechnicianPhNum() {
        return TechnicianPhNum;
    }

    public void setTechnicianPhNum(String TechnicianPhNum) {
        this.TechnicianPhNum = TechnicianPhNum;
    }

    public Boolean getAvailability() {
        return availability;
    }

    public void setAvailability(Boolean availability) {
        this.availability = availability;
    }
    

}
