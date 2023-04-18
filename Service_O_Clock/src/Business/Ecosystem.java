/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business;

import Beautician.BeauticianWorkerDirectory;


import Business.PestControlTechnician.PestControlTechnicianDirectory;
import Customer.CustomerDirectory;
import HomePainting.HomePaintingDirectory;
import HomeService.HomeServiceDirectory;
import HomeServiceTechnician.TechnicianDirectory;
import Painter.PainterDirectory;
import PestControlOrganization.PestControlDirectory;
import Role.Role;
import Role.SysAdmin;
import SalonServices.SalonDirectory;
import StoreServices.StoreDirectory;
import java.util.ArrayList;

/**
 *
 * @author hi
 */
public class Ecosystem extends Organisation{
    private static Ecosystem ecosystem;
    private SalonDirectory salonDirectory;
    private CustomerDirectory customerDirectory;
    private HomeServiceDirectory homeServiceDirectory;
    private PestControlDirectory pestControlDirectory;
    private PainterDirectory painterDirectory;
    private HomePaintingDirectory homePaintingDirectory;
    private PestControlTechnicianDirectory pestControlTechnicianDirectory;
    private BeauticianWorkerDirectory beauticianDirectory;
    private TechnicianDirectory homeServiceTechnicianDirectory;
    private StoreDirectory storeDirectory;

    public Ecosystem(SalonDirectory salonDirectory, CustomerDirectory customerDirectory, HomeServiceDirectory homeServiceDirectory, PestControlDirectory pestControlDirectory,PainterDirectory painterDirectory, HomePaintingDirectory homePaintingDirectory, PestControlTechnicianDirectory pestControlTechnicianDirectory,BeauticianWorkerDirectory beauticianDirectory, TechnicianDirectory homeServiceTechnicianDirectory, StoreDirectory storeDirectory) {
        this.salonDirectory = salonDirectory;
        this.customerDirectory = customerDirectory;
        this.homeServiceDirectory = homeServiceDirectory;
        this.pestControlDirectory = pestControlDirectory;
        this.painterDirectory = painterDirectory;
        this.homePaintingDirectory = homePaintingDirectory;
        this.pestControlTechnicianDirectory = pestControlTechnicianDirectory;
        this.beauticianDirectory = beauticianDirectory;
        this.homeServiceTechnicianDirectory = homeServiceTechnicianDirectory;
        this.storeDirectory = storeDirectory;
    }
    
    public Ecosystem(){
        super(null);
    }
    
    public static Ecosystem getInstance(){
        if(ecosystem==null){
            ecosystem = new Ecosystem();
        }
        return ecosystem;
    }


    public SalonDirectory getSalonDirectory() {
        if(salonDirectory == null)
        {
            salonDirectory = new SalonDirectory();
        }
        return salonDirectory;
    }

    public void setSalonDirectory(SalonDirectory salonDirectory) {
        this.salonDirectory = salonDirectory;
    }

    public CustomerDirectory getCustomerDirectory() {
        if(customerDirectory == null)
        {
            customerDirectory = new CustomerDirectory();
        }
        return customerDirectory;
    }

    public void setCustomerDirectory(CustomerDirectory customerDirectory) {
        this.customerDirectory = customerDirectory;
    }

    public HomeServiceDirectory getHomeServiceDirectory() {
        if(homeServiceDirectory == null)
        {
            homeServiceDirectory = new HomeServiceDirectory();
        }
        return homeServiceDirectory;
    }

    public void setHomeServiceDirectory(HomeServiceDirectory homeServiceDirectory) {
        this.homeServiceDirectory = homeServiceDirectory;
    }

    public PestControlDirectory getPestControlDirectory() {
        if(pestControlDirectory == null)
        {
            pestControlDirectory = new PestControlDirectory();
        }
        return pestControlDirectory;
    }

    public void setPestControlDirectory(PestControlDirectory pestControlDirectory) {
        this.pestControlDirectory = pestControlDirectory;
    }

    public PainterDirectory getPainterDirectory() {
        if(painterDirectory == null)
        {
            painterDirectory = new PainterDirectory();
        }
        return painterDirectory;
    }

    public void setPainterDirectory(PainterDirectory painterDirectory) {
        this.painterDirectory = painterDirectory;
    }

    public HomePaintingDirectory getHomePaintingDirectory() {
        if(homePaintingDirectory == null)
        {
            homePaintingDirectory = new HomePaintingDirectory();
        }
        return homePaintingDirectory;
    }

    public void setHomePaintingDirectory(HomePaintingDirectory homePaintingDirectory) {
        this.homePaintingDirectory = homePaintingDirectory;
    }

    public PestControlTechnicianDirectory getPestControlTechnicianDirectory() {
        if(pestControlTechnicianDirectory == null)
        {
            pestControlTechnicianDirectory = new PestControlTechnicianDirectory();
        }
        return pestControlTechnicianDirectory;
    }

    public void setPestControlTechnicianDirectory(PestControlTechnicianDirectory pestControlTechnicianDirectory) {
        this.pestControlTechnicianDirectory = pestControlTechnicianDirectory;
    }

    public BeauticianWorkerDirectory getBeauticianDirectory() {
        if(beauticianDirectory == null)
        {
            beauticianDirectory = new BeauticianWorkerDirectory();
        }
        return beauticianDirectory;
    }

    public void setBeauticianDirectory(BeauticianWorkerDirectory beauticianDirectory) {
        this.beauticianDirectory = beauticianDirectory;
    }

    public TechnicianDirectory getHomeServiceTechnicianDirectory() {
        if(homeServiceTechnicianDirectory == null)
        {
            homeServiceTechnicianDirectory = new TechnicianDirectory();
        }
        return homeServiceTechnicianDirectory;
    }

    public void setHomeServiceTechnicianDirectory(TechnicianDirectory homeServiceTechnicianDirectory) {
        this.homeServiceTechnicianDirectory = homeServiceTechnicianDirectory;
    }

    public StoreDirectory getStoreDirectory() {
        if(storeDirectory == null)
        {
            storeDirectory = new StoreDirectory();
        }
        return storeDirectory;
    }

    public void setStoreDirectory(StoreDirectory storeDirectory) {
        this.storeDirectory = storeDirectory;
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles=new ArrayList<Role>();
        roles.add(new SysAdmin());
        return roles;
    }

    public boolean checkUniqueUser(String username){
       return false;
    }
}
