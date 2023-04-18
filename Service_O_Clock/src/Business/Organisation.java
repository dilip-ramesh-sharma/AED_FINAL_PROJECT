/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business;

import Employee.EmployeeDirectory;
import Role.Role;
import UserAccounts.UserAccountDirectory;
import WorkQueue.HomePaintingWorkQueue;
import WorkQueue.HomeServicesWorkQueue;
import WorkQueue.PestControlWorkQueue;
import WorkQueue.SalonWorkQueue;
import WorkQueue.StoreServiceWorkQueue;
import java.util.ArrayList;

/**
 *
 * @author hi
 */
public abstract class Organisation {
    private String organisationName;
    private SalonWorkQueue salonWorkQueue;
    private HomePaintingWorkQueue homePaintingWorkQueue;
    private HomeServicesWorkQueue homeServicesWorkQueue;
    private StoreServiceWorkQueue storeServiceWorkQueue;
    private PestControlWorkQueue pestControlWorkQueue;
    private EmployeeDirectory employeeDirectory;
    private UserAccountDirectory userAccountDirectory;
    private int orgId;
    private static int count=0;
    
    public Organisation(String organisationName) {
        this.organisationName = organisationName;
        salonWorkQueue = new SalonWorkQueue();
        homePaintingWorkQueue = new HomePaintingWorkQueue();
        homeServicesWorkQueue = new HomeServicesWorkQueue();
        storeServiceWorkQueue = new StoreServiceWorkQueue();
        pestControlWorkQueue = new PestControlWorkQueue();
        employeeDirectory = new EmployeeDirectory();
        userAccountDirectory = new UserAccountDirectory();
        orgId = count;
        ++count;
    }
    
    public Organisation(){
        
    }
    
    public enum Type{
        SalonServices("SalonServices"),
        Beautician("Beauctician"), 
        HomeServices("HomeServices"),
        HomeServiceTechnician("HomeServiceTechnician"),
        HomePaintingServices("HomePaintingServices"),
        Painter("Painter"),
        PestControlServices("PestControlServices"),
        PestControlTechnician("PestControlTechnician"),
        StoreServices("StoreServices"),
        Customer("Customer"),
        SystemAdmin("SystemAdmin");
        
        private String value;
        private Type(String value) {
            this.value = value;
        }
        public String getValue() {
            return value;
        }
    }

     public abstract ArrayList<Role> getSupportedRole();

    public String getOrganisationName() {
        return organisationName;
    }

    public void setOrganisationName(String organisationName) {
        this.organisationName = organisationName;
    }

    public SalonWorkQueue getSalonWorkQueue() {
        return salonWorkQueue;
    }

    public void setSalonWorkQueue(SalonWorkQueue salonWorkQueue) {
        this.salonWorkQueue = salonWorkQueue;
    }

    public HomePaintingWorkQueue getHomePaintingWorkQueue() {
        return homePaintingWorkQueue;
    }

    public void setHomePaintingWorkQueue(HomePaintingWorkQueue homePaintingWorkQueue) {
        this.homePaintingWorkQueue = homePaintingWorkQueue;
    }

    public HomeServicesWorkQueue getHomeServicesWorkQueue() {
        return homeServicesWorkQueue;
    }

    public void setHomeServicesWorkQueue(HomeServicesWorkQueue homeServicesWorkQueue) {
        this.homeServicesWorkQueue = homeServicesWorkQueue;
    }

    public StoreServiceWorkQueue getStoreServiceWorkQueue() {
        return storeServiceWorkQueue;
    }

    public void setStoreServiceWorkQueue(StoreServiceWorkQueue storeServiceWorkQueue) {
        this.storeServiceWorkQueue = storeServiceWorkQueue;
    }

    public PestControlWorkQueue getPestControlWorkQueue() {
        return pestControlWorkQueue;
    }

    public void setPestControlWorkQueue(PestControlWorkQueue pestControlWorkQueue) {
        this.pestControlWorkQueue = pestControlWorkQueue;
    }

    public EmployeeDirectory getEmployeeDirectory() {
        return employeeDirectory;
    }

    public void setEmployeeDirectory(EmployeeDirectory employeeDirectory) {
        this.employeeDirectory = employeeDirectory;
    }

    public UserAccountDirectory getUserAccountDirectory() {
        return userAccountDirectory;
    }

    public void setUserAccountDirectory(UserAccountDirectory userAccountDirectory) {
        this.userAccountDirectory = userAccountDirectory;
    }

    public int getOrgId() {
        return orgId;
    }

    public void setOrgId(int orgId) {
        this.orgId = orgId;
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        Organisation.count = count;
    }
     
    @Override
    public String toString() {
        return organisationName;
    }
}
