/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SalonServices;

import WorkQueue.SalonWorkRequest;
import java.util.ArrayList;

/**
 *
 * @author hi
 */
public class Salon {
    private String username;
    int requestId = 1;
    private ArrayList<SalonServicesOffered> servicesOfferedList;
    private ArrayList<SalonWorkRequest> salonWorkRequestList;
    private String salonName;
    private String salonAddress;
    private String salonContact;
    private String salonEmail;
    
    public Salon(String username) {
        this.username = username;
        servicesOfferedList = new ArrayList<SalonServicesOffered>();
        salonWorkRequestList = new ArrayList<SalonWorkRequest>();
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getRequestId() {
        return requestId;
    }

    public void setRequestId(int requestId) {
        this.requestId = requestId;
    }

    public ArrayList<SalonServicesOffered> getServicesOfferedList() {
        return servicesOfferedList;
    }

    public void setServicesOfferedList(ArrayList<SalonServicesOffered> servicesOfferedList) {
        this.servicesOfferedList = servicesOfferedList;
    }

    public ArrayList<SalonWorkRequest> getSalonWorkRequestList() {
        return salonWorkRequestList;
    }

    public void setSalonWorkRequestList(ArrayList<SalonWorkRequest> salonWorkRequestList) {
        this.salonWorkRequestList = salonWorkRequestList;
    }

    public String getSalonName() {
        return salonName;
    }

    public void setSalonName(String salonName) {
        this.salonName = salonName;
    }

    public String getSalonAddress() {
        return salonAddress;
    }

    public void setSalonAddress(String salonAddress) {
        this.salonAddress = salonAddress;
    }

    public String getSalonContact() {
        return salonContact;
    }

    public void setSalonContact(String salonContact) {
        this.salonContact = salonContact;
    }

    public String getSalonEmail() {
        return salonEmail;
    }

    public void setSalonEmail(String salonEmail) {
        this.salonEmail = salonEmail;
    }
    
    public void addSalonServices(SalonServicesOffered service){
        servicesOfferedList.add(service);
    }
    
    public void removeSalonServices(SalonServicesOffered dish){
        servicesOfferedList.remove(dish);
    }
    
    public void createNewServiceRequest(String salonName, String custName, String beautician, ArrayList<SalonServicesOffered> serviceRequest, String serviceAddress, String instructions) {
        SalonWorkRequest workReq = new SalonWorkRequest();
        workReq.setRequestId(String.valueOf(requestId));
        workReq.setCustomerName(custName);
        workReq.setSalonName(salonName);
        workReq.setBeauticianName(beautician);
        workReq.setSalonServicerequest(serviceRequest);
        workReq.setServiceAddress(serviceAddress);
        workReq.setMessage(instructions);
        workReq.setStatus("New Salon Service Request");
        salonWorkRequestList.add(workReq);
        requestId++;
    }
    @Override
    public String toString() {
        return salonName;
    }
}
