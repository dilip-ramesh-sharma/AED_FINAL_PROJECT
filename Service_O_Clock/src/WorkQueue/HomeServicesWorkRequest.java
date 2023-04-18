/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package WorkQueue;

import HomeService.HomeService;
import HomeService.Service;
import UserAccounts.UserAccounts;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author hi
 */
public class HomeServicesWorkRequest {
    /*
    private String leafRequestId;
    private String snowOrgName;
    private String memName;
    private String fieldWorkerName;
    private String serviceAddress;
    private ArrayList<LeafService> leafRequest;
    private String type;
    private String status;
    private String message;
    private UserAccounts sender;
    private UserAccounts receiver;
    private Date requestDate;
    private Date resolveDate;
    private String leafOrgName;*/
    
    private String homeServiceRequestId;
    private String homeServiceCompanyName;
    private String custName;
    private String homeServTechnicianName;
    private String serviceAddress;
    private ArrayList<Service> homeServiceRequest;
    private String type;
    private String status;
    private String message;
    private UserAccounts sender;
    private UserAccounts receiver;
    private Date requestDate;
    private Date resolveDate;
    
    public HomeServicesWorkRequest(){
        requestDate = new Date();
        this.homeServiceRequest = new ArrayList<Service>();
    }

    public String getHomeServiceRequestId() {
        return homeServiceRequestId;
    }

    public void setHomeServiceRequestId(String homeServiceRequestId) {
        this.homeServiceRequestId = homeServiceRequestId;
    }

    public String getHomeServiceCompanyName() {
        return homeServiceCompanyName;
    }

    public void setHomeServiceCompanyName(String homeServiceCompanyName) {
        this.homeServiceCompanyName = homeServiceCompanyName;
    }

    public String getCustName() {
        return custName;
    }

    public void setCustName(String custName) {
        this.custName = custName;
    }

    public String getHomeServTechnicianName() {
        return homeServTechnicianName;
    }

    public void setHomeServTechnicianName(String homeServTechnicianName) {
        this.homeServTechnicianName = homeServTechnicianName;
    }

    public String getServiceAddress() {
        return serviceAddress;
    }

    public void setServiceAddress(String serviceAddress) {
        this.serviceAddress = serviceAddress;
    }

    public ArrayList<Service> getHomeServiceRequest() {
        return homeServiceRequest;
    }

    public void setHomeServiceRequest(ArrayList<Service> homeServiceRequest) {
        this.homeServiceRequest = homeServiceRequest;
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

    public UserAccounts getSender() {
        return sender;
    }

    public void setSender(UserAccounts sender) {
        this.sender = sender;
    }

    public UserAccounts getReceiver() {
        return receiver;
    }

    public void setReceiver(UserAccounts receiver) {
        this.receiver = receiver;
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
        return homeServiceRequestId;
    }
}


