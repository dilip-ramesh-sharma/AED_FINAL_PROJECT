/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package HomeService;

import WorkQueue.HomeServicesWorkRequest;
import java.util.ArrayList;

/**
 *
 * @author 91730
 */
public class HomeService {
    
    private String userName;
    int serviceId = 1;
    private ArrayList<Service> serviceList;
    private ArrayList<HomeServicesWorkRequest> homeServiceRequestList;
    private String homeServiceName;
    private String homeServiceAddress;
    private String homeServicePhNum;
    private String homeServiceEmail;
    
    public HomeService(String name) {
        this.userName = name;
        serviceList = new ArrayList<>();
        homeServiceRequestList = new ArrayList<>();
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public int getServiceId() {
        return serviceId;
    }

    public void setServiceId(int serviceId) {
        this.serviceId = serviceId;
    }

    public ArrayList<HomeServicesWorkRequest> getHomeServiceRequestList() {
        return homeServiceRequestList;
    }

    public void setHomeServiceRequestList(ArrayList<HomeServicesWorkRequest> homeServiceRequestList) {
        this.homeServiceRequestList = homeServiceRequestList;
    }



    public ArrayList<Service> getServiceList() {
        return serviceList;
    }

    public void setServiceList(ArrayList<Service> serviceList) {
        this.serviceList = serviceList;
    }

    public String getHomeServiceName() {
        return homeServiceName;
    }

    public void setHomeServiceName(String homeServiceName) {
        this.homeServiceName = homeServiceName;
    }

    public String getHomeServiceAddress() {
        return homeServiceAddress;
    }

    public void setHomeServiceAddress(String homeServiceAddress) {
        this.homeServiceAddress = homeServiceAddress;
    }

    public String getHomeServicePhNum() {
        return homeServicePhNum;
    }

    public void setHomeServicePhNum(String homeServicePhNum) {
        this.homeServicePhNum = homeServicePhNum;
    }

    public String getHomeServiceEmail() {
        return homeServiceEmail;
    }

    public void setHomeServiceEmail(String homeServiceEmail) {
        this.homeServiceEmail = homeServiceEmail;
    }
    
    
    
    public void addHomeServices(Service dish){
        serviceList.add(dish);
    }
    
    public void removeHomeServices(Service dish){
        serviceList.remove(dish);
    }
    
    public void newRequest(String homeServiceCompanyName, String custName, String homeServiceTech, ArrayList<Service> request, String serviceAddress, String instructions) {
        HomeServicesWorkRequest homeWork = new HomeServicesWorkRequest();
        homeWork.setHomeServiceRequestId(String.valueOf(serviceId));
        homeWork.setCustName(custName);
        homeWork.setHomeServiceCompanyName(homeServiceCompanyName);
        homeWork.setHomeServTechnicianName(homeServiceTech);
        homeWork.setHomeServiceRequest(request);
        homeWork.setServiceAddress(serviceAddress);
        homeWork.setMessage(instructions);
        homeWork.setStatus("New Request");
        homeServiceRequestList.add(homeWork);
        serviceId++;
    }
    
    
    @Override
    public String toString() {
        return homeServiceName;
    }
    
}
