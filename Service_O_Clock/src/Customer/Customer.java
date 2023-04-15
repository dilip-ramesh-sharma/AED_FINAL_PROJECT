/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Customer;

import WorkQueue.FeedbackWorkRequest;
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
    private ArrayList<FeedbackWorkRequest> feedbackWorkRequestList;
    private ArrayList<HomePaintingWorkRequest> homePaintingWorkRequestList;
    private ArrayList<PestControlWorkRequest> pestControlWorkRequestList;
    private String memAddress;
    private String memPhNum;
    int id = 1;
    int leafid = 1;
    int donationid = 1;
    int orderid = 1;
    int emgid = 1;

    public Customer(String username) {
        this.username = username;
        
        homeServiceWorkRequestList = new ArrayList<HomeServicesWorkRequest>();
        salonWorkRequestList = new ArrayList<SalonWorkRequest>();
        feedbackWorkRequestList = new ArrayList<FeedbackWorkRequest>();
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

    public ArrayList<FeedbackWorkRequest> getFeedbackWorkRequestList() {
        return feedbackWorkRequestList;
    }

    public void setFeedbackWorkRequestList(ArrayList<FeedbackWorkRequest> feedbackWorkRequestList) {
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

    public String getMemAddress() {
        return memAddress;
    }

    public void setMemAddress(String memAddress) {
        this.memAddress = memAddress;
    }

    public String getMemPhNum() {
        return memPhNum;
    }

    public void setMemPhNum(String memPhNum) {
        this.memPhNum = memPhNum;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getLeafid() {
        return leafid;
    }

    public void setLeafid(int leafid) {
        this.leafid = leafid;
    }

    public int getDonationid() {
        return donationid;
    }

    public void setDonationid(int donationid) {
        this.donationid = donationid;
    }

    public int getOrderid() {
        return orderid;
    }

    public void setOrderid(int orderid) {
        this.orderid = orderid;
    }

    public int getEmgid() {
        return emgid;
    }

    public void setEmgid(int emgid) {
        this.emgid = emgid;
    }
    
    
    
}
