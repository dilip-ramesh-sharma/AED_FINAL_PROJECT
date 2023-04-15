/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SalonServices;

import java.util.ArrayList;

/**
 *
 * @author hi
 */
public class SalonDirectory {
    private ArrayList<Salon> salonsList;
    private Salon salon;
    private SalonServicesOffered servicesOffered;
    
    public SalonDirectory(){
        this.salonsList = new ArrayList<Salon>();
    }

    public ArrayList<Salon> getSalonsList() {
        return salonsList;
    }

    public void setSalonsList(ArrayList<Salon> salonsList) {
        this.salonsList = salonsList;
    }

    public Salon getSalon() {
        return salon;
    }

    public void setSalon(Salon salon) {
        this.salon = salon;
    }

    public SalonServicesOffered getServicesOffered() {
        return servicesOffered;
    }

    public void setServicesOffered(SalonServicesOffered servicesOffered) {
        this.servicesOffered = servicesOffered;
    }
    
    public Salon createSalon(String salonName){
        salon= new Salon(salonName);
        salonsList.add(salon);
        return salon;
    }
    
    public void deleteSnowClearingOrg(String username){
        for(int i=0;i<salonsList.size();i++){
            if(salonsList.get(i).getUsername().equals(username)){
                salonsList.remove(i);
            }
        }
    }
    
    public void updateSnowClearingOrgInfo(Salon salon, String name, String number, String address, String email){
        salon.setSalonName(name);
        salon.setSalonEmail(address);
        salon.setSalonContact(number);
        salon.setSalonEmail(email);
    }
    
    public SalonServicesOffered addServiceTypes(Salon salon, String name, String desc, String type){
        servicesOffered = new SalonServicesOffered(name, desc, type);
        salon.addSalonServices(servicesOffered);
        return servicesOffered;
    }
    
    public void deleteServices(Salon salon, SalonServicesOffered serviceoff){
        salon.removeSalonServices(serviceoff); 
    }
}


