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
public class BeauticianWorker {
    
    
//    private String fieldWorkerName;
//    private String fieldWorkerUsername;
//    private ArrayList<WorkRequest> requestList;
//    private ArrayList<LeafWorkRequest> leafRequestList;
//    private String fieldWorkerAddress;
//    private String fieldWorkerPhNum;
//    private Boolean availability = true;
    
    private String beauticianName;
    private String beauticianUsrnme;
//    private ArrayList<WorkRequest> requestList;
//    private ArrayList<LeafWorkRequest> leafRequestList;
    private String beauticianAddress;
    private String beauticianPhoneNumber;
    private Boolean availability = true;
//    private ArrayList<WorkRequest> beauticianWorkRequestList;
    
//    public FieldWorker(String name, String userName){
//        this.fieldWorkerName = name;
//        this.fieldWorkerUsername = userName;
//        requestList = new ArrayList<WorkRequest>();
//        leafRequestList = new ArrayList<LeafWorkRequest>();
//    }

    public BeauticianWorker(String beauticianName, String beauticianUsrnme) {
        this.beauticianName = beauticianName;
        this.beauticianUsrnme = beauticianUsrnme;
//        requestList = new ArrayList<WorkRequest>();
//        leafRequestList = new ArrayList<LeafWorkRequest>();
    }

    public String getBeauticianName() {
        return beauticianName;
    }

    public void setBeauticianName(String beauticianName) {
        this.beauticianName = beauticianName;
    }

    public String getBeauticianUsrnme() {
        return beauticianUsrnme;
    }

    public void setBeauticianUsrnme(String beauticianUsrnme) {
        this.beauticianUsrnme = beauticianUsrnme;
    }

    public String getBeauticianAddress() {
        return beauticianAddress;
    }

    public void setBeauticianAddress(String beauticianAddress) {
        this.beauticianAddress = beauticianAddress;
    }

    public String getBeauticianPhoneNumber() {
        return beauticianPhoneNumber;
    }

    public void setBeauticianPhoneNumber(String beauticianPhoneNumber) {
        this.beauticianPhoneNumber = beauticianPhoneNumber;
    }

    public Boolean getAvailability() {
        return availability;
    }

    public void setAvailability(Boolean availability) {
        this.availability = availability;
    }
    
//    public void addBeauticianRequest(String beauticianOrgName, String memName, String beauticianWorkerName, ArrayList<Service> request, String cost, String fieldWorkerAddress) {
//       WorkRequest requirement = new WorkRequest();
//     
//       requirement.setFieldWorkerName(fieldWorkerName);
//       requirement.setSnowOrgName(snowOrgName);
//       requirement.setMemName(memName);
//       requirement.setRequest(request);
//       requirement.setType(cost);
//       requirement.setServiceAddress(fieldWorkerAddress);
//       requirement.setStatus("New Request");
//       beauticianWorkRequestList.add(requirement);
//    }
    
    
    @Override
    public String toString() {
        return beauticianName;
    }
    
    
}
