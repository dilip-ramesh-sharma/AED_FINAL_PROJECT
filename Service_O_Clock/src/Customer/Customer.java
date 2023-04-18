/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Customer;

import WorkQueue.StoreServiceWorkRequest;
import WorkQueue.HomePaintingWorkRequest;
import WorkQueue.HomeServicesWorkRequest;
import WorkQueue.PestControlWorkRequest;
import WorkQueue.SalonWorkRequest;
import java.util.ArrayList;

/**
 *
 * @author hi
 */

public class Customer {
   private String customerName;
    private String username;
    private ArrayList<HomeServicesWorkRequest> homeServiceWorkRequestList;
    private ArrayList<SalonWorkRequest> salonWorkRequestList;
    private ArrayList<StoreServiceWorkRequest> feedbackWorkRequestList;
    private ArrayList<HomePaintingWorkRequest> homePaintingWorkRequestList;
    private ArrayList<PestControlWorkRequest> pestControlWorkRequestList;
    private String custAddress;
    private String custContact;
    int homeServiceId = 1;
    int salonServiceId = 1;
    int feedbackiId = 1;
    int paintignId = 1;
    int pestServiceId = 1;

    public Customer(String username) {
        this.username = username;
        
        homeServiceWorkRequestList = new ArrayList<HomeServicesWorkRequest>();
        salonWorkRequestList = new ArrayList<SalonWorkRequest>();
        feedbackWorkRequestList = new ArrayList<StoreServiceWorkRequest>();
        homePaintingWorkRequestList = new ArrayList<HomePaintingWorkRequest>();
        pestControlWorkRequestList = new ArrayList<PestControlWorkRequest>();
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public ArrayList<HomeServicesWorkRequest> getHomeServiceWorkRequestList() {
        return homeServiceWorkRequestList;
    }

    public void setHomeServiceWorkRequestList(ArrayList<HomeServicesWorkRequest> homeServiceWorkRequestList) {
        this.homeServiceWorkRequestList = homeServiceWorkRequestList;
    }

    public ArrayList<SalonWorkRequest> getSalonWorkRequestList() {
        return salonWorkRequestList;
    }

    public void setSalonWorkRequestList(ArrayList<SalonWorkRequest> salonWorkRequestList) {
        this.salonWorkRequestList = salonWorkRequestList;
    }

    public ArrayList<StoreServiceWorkRequest> getFeedbackWorkRequestList() {
        return feedbackWorkRequestList;
    }

    public void setFeedbackWorkRequestList(ArrayList<StoreServiceWorkRequest> feedbackWorkRequestList) {
        this.feedbackWorkRequestList = feedbackWorkRequestList;
    }

    public ArrayList<HomePaintingWorkRequest> getHomePaintingWorkRequestList() {
        return homePaintingWorkRequestList;
    }

    public void setHomePaintingWorkRequestList(ArrayList<HomePaintingWorkRequest> homePaintingWorkRequestList) {
        this.homePaintingWorkRequestList = homePaintingWorkRequestList;
    }

    public ArrayList<PestControlWorkRequest> getPestControlWorkRequestList() {
        return pestControlWorkRequestList;
    }

    public void setPestControlWorkRequestList(ArrayList<PestControlWorkRequest> pestControlWorkRequestList) {
        this.pestControlWorkRequestList = pestControlWorkRequestList;
    }

    public String getCustAddress() {
        return custAddress;
    }

    public void setCustAddress(String custAddress) {
        this.custAddress = custAddress;
    }

    public String getCustContact() {
        return custContact;
    }

    public void setCustContact(String custContact) {
        this.custContact = custContact;
    }

    public int getHomeServiceId() {
        return homeServiceId;
    }

    public void setHomeServiceId(int homeServiceId) {
        this.homeServiceId = homeServiceId;
    }

    public int getSalonServiceId() {
        return salonServiceId;
    }

    public void setSalonServiceId(int salonServiceId) {
        this.salonServiceId = salonServiceId;
    }

    public int getFeedbackiId() {
        return feedbackiId;
    }

    public void setFeedbackiId(int feedbackiId) {
        this.feedbackiId = feedbackiId;
    }

    public int getPaintignId() {
        return paintignId;
    }

    public void setPaintignId(int paintignId) {
        this.paintignId = paintignId;
    }

    public int getPestServiceId() {
        return pestServiceId;
    }

    public void setPestServiceId(int pestServiceId) {
        this.pestServiceId = pestServiceId;
    }

    
    
    
}
