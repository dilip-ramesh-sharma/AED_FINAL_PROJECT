/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package WorkQueue;

import SalonServices.SalonServicesOffered;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author hi
 */
public class SalonWorkRequest {
    private String requestId;
    private String salonName;
    private String customerName;
    private String BeauticianName;
    private String serviceAddress;
    private ArrayList<SalonServicesOffered> salonServicerequest;
    private String type;
    private String status;
    private String message;
    private Date requestDate;
    private Date resolveDate;
    
    public SalonWorkRequest(){
        requestDate = new Date();
    }

    public String getRequestId() {
        return requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public String getSalonName() {
        return salonName;
    }

    public void setSalonName(String salonName) {
        this.salonName = salonName;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getBeauticianName() {
        return BeauticianName;
    }

    public void setBeauticianName(String BeauticianName) {
        this.BeauticianName = BeauticianName;
    }

    public String getServiceAddress() {
        return serviceAddress;
    }

    public void setServiceAddress(String serviceAddress) {
        this.serviceAddress = serviceAddress;
    }

    public ArrayList<SalonServicesOffered> getSalonServicerequest() {
        return salonServicerequest;
    }

    public void setSalonServicerequest(ArrayList<SalonServicesOffered> salonServicerequest) {
        this.salonServicerequest = salonServicerequest;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Date getRequestDate() {
        return requestDate;
    }

    public void setRequestDate(Date requestDate) {
        this.requestDate = requestDate;
    }

    public Date getResolveDate() {
        return resolveDate;
    }

    public void setResolveDate(Date resolveDate) {
        this.resolveDate = resolveDate;
    }
    
    @Override
    public String toString() {
        return requestId;
    }
    
    
    
}
