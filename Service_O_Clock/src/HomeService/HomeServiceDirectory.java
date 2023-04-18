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
public class HomeServiceDirectory {
    
    private ArrayList<HomeService> homeServiceList;
    private HomeService homeService;
    private Service service;
    

    public HomeServiceDirectory(){
        this.homeServiceList = new ArrayList<>();
    }

    public ArrayList<HomeService> getHomeServiceList() {
        return homeServiceList;
    }

    public HomeService createHomeServiceOrgInfo(String orgName){
        homeService = new HomeService(orgName);
        homeServiceList.add(homeService);
        return homeService;
    }
    
    public void deleteHomeServiceOrg(String username){
        for(int i=0;i<homeServiceList.size();i++){
            if(homeServiceList.get(i).getUserName().equals(username)){
                homeServiceList.remove(i);
            }
        }
    }
    
    public void updateHomeServiceOrgInfo(HomeService org, String name, String number, String address, String email){
        org.setHomeServiceName(name);
        org.setHomeServiceAddress(address);
        org.setHomeServicePhNum(number);
        org.setHomeServiceEmail(email);
    }
    
    public Service addServiceTypes(HomeService company, String name, String desc, String type){
        service = new Service(name, desc, type);
        company.addHomeServices(service);
        return service;
    }
    
    public void DeleteServices(HomeService company, Service service){
        company.removeHomeServices(service); 
    }
    
}
