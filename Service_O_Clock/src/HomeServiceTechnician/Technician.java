/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package HomeServiceTechnician;

import HomeService.Service;
import WorkQueue.HomeServicesWorkRequest;
import java.util.ArrayList;

/**
 *
 * @author 91730
 */
public class Technician {
    
    private String technicianName;
    private String technicianUsrnme;
    private ArrayList<HomeServicesWorkRequest> homeServiceRequestList;
    private String technicianAddress;
    private String technicianPhoneNumber;
    private Boolean availability = true;
    
    public Technician(String technicianName, String technicianUsrnme) {
        this.technicianName = technicianName;
        this.technicianUsrnme = technicianUsrnme;
        homeServiceRequestList = new ArrayList<HomeServicesWorkRequest>();
    }

    public String getTechnicianName() {
        return technicianName;
    }

    public void setTechnicianName(String technicianName) {
        this.technicianName = technicianName;
    }

    public String getTechnicianUsrnme() {
        return technicianUsrnme;
    }

    public void setTechnicianUsrnme(String technicianUsrnme) {
        this.technicianUsrnme = technicianUsrnme;
    }

    public String getTechnicianAddress() {
        return technicianAddress;
    }

    public void setTechnicianAddress(String technicianAddress) {
        this.technicianAddress = technicianAddress;
    }

    public String getTechnicianPhoneNumber() {
        return technicianPhoneNumber;
    }

    public void setTechnicianPhoneNumber(String technicianPhoneNumber) {
        this.technicianPhoneNumber = technicianPhoneNumber;
    }

    public Boolean getAvailability() {
        return availability;
    }

    public void setAvailability(Boolean availability) {
        this.availability = availability;
    }

    public ArrayList<HomeServicesWorkRequest> getHomeServiceRequestList() {
        return homeServiceRequestList;
    }

    public void setHomeServiceRequestList(ArrayList<HomeServicesWorkRequest> homeServiceRequestList) {
        this.homeServiceRequestList = homeServiceRequestList;
    }

    public void newRequest(String homeServiceCompanyName, String custName, String homeServiceTech, ArrayList<Service> request, String cost, String technicianAddress) {
       HomeServicesWorkRequest homeWork = new HomeServicesWorkRequest();
     
       homeWork.setHomeServTechnicianName(homeServiceTech);
       homeWork.setHomeServiceCompanyName(homeServiceCompanyName);
       homeWork.setCustName(custName);
       homeWork.setHomeServiceRequest(request);
       homeWork.setType(cost);
       homeWork.setServiceAddress(technicianAddress);
       homeWork.setStatus("New Request");
       homeServiceRequestList.add(homeWork);
    }
    
    
    @Override
    public String toString() {
        return technicianName;
    }
    
}
