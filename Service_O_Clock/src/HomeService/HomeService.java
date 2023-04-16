/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package HomeService;

import java.util.ArrayList;

/**
 *
 * @author 91730
 */
public class HomeService {
    
    private String userName;
    int id = 1;
    private ArrayList<Service> serviceList;
//    private ArrayList<HomeSeriveWorkRequest> homeServiceRequestList;
    private String homeServiceName;
    private String homeServiceAddress;
    private String homeServicePhNum;
    private String homeServiceEmail;
    
    public HomeService(String name) {
        this.userName = name;
        serviceList = new ArrayList<>();
//        homeServiceRequestList = new ArrayList<>();
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
    
    
    
    public void addServices(Service dish){
        serviceList.add(dish);
    }
    
    public void removeServices(Service dish){
        serviceList.remove(dish);
    }
    
//    public void newRequest(String homeServiceOrgName, String memName, String fieldWorker, ArrayList<Service> request, String serviceAddress, String instructions) {
//        HomeSeriveWorkRequest newWork = new HomeSeriveWorkRequest();
//        newWork.setLeafRequestId(String.valueOf(id));
//        newWork.setMemName(memName);
//        newWork.setLeafOrgName(leafOrgName);
//        newWork.setFieldWorkerName(fieldWorker);
//        newWork.setLeafRequest(request);
//        newWork.setServiceAddress(serviceAddress);
//        newWork.setMessage(instructions);
//        newWork.setStatus("New Request");
//        leafRequestList.add(newWork);
//        id++;
//    }
    
    
    @Override
    public String toString() {
        return homeServiceName;
    }
    
}
