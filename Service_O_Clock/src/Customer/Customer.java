/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Customer;

import HomePainting.PaintingPackages;
import HomeService.Service;
import PestControlOrganization.PestControlServices;
import SalonServices.SalonServicesOffered;
import StoreServices.Products;
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
    private ArrayList<StoreServiceWorkRequest> storeWorkRequestList;
    private ArrayList<HomePaintingWorkRequest> homePaintingWorkRequestList;
    private ArrayList<PestControlWorkRequest> pestControlWorkRequestList;
    private String custAddress;
    private String custContact;
    int homeServiceId = 1;
    int salonServiceId = 1;
    int storeId = 1;
    int paintingId = 1;
    int pestServiceId = 1;

    public Customer(String username) {
        this.username = username;
        
        homeServiceWorkRequestList = new ArrayList<HomeServicesWorkRequest>();
        salonWorkRequestList = new ArrayList<SalonWorkRequest>();
        storeWorkRequestList = new ArrayList<StoreServiceWorkRequest>();
        homePaintingWorkRequestList = new ArrayList<HomePaintingWorkRequest>();
        pestControlWorkRequestList = new ArrayList<PestControlWorkRequest>();
    }
    
    public Customer(){
        
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

    public ArrayList<StoreServiceWorkRequest> getStoreWorkRequestList() {
        return storeWorkRequestList;
    }

    public void setStoreWorkRequestList(ArrayList<StoreServiceWorkRequest> storeWorkRequestList) {
        this.storeWorkRequestList = storeWorkRequestList;
    }

    public int getStoreId() {
        return storeId;
    }

    public void setStoreId(int storeId) {
        this.storeId = storeId;
    }

    public int getPaintingId() {
        return paintingId;
    }

    public void setPaintingId(int paintingId) {
        this.paintingId = paintingId;
    }

    

    public int getPestServiceId() {
        return pestServiceId;
    }

    public void setPestServiceId(int pestServiceId) {
        this.pestServiceId = pestServiceId;
    }

    /*
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
    int storeId = 1;
    int paintignId = 1;
    int pestServiceId = 1;
    */
    public void createSalonServiceRequest(String salonName, String custName, String beautician, ArrayList<SalonServicesOffered> serv, String serviceAddress, String comments) {
        SalonWorkRequest req = new SalonWorkRequest();
        req.setRequestId(String.valueOf(salonServiceId));
        req.setCustomerName(custName);
        req.setSalonName(salonName);
        req.setBeauticianName(beautician);
        req.setSalonServicerequest(serv);
        req.setServiceAddress(serviceAddress);
        req.setMessage(comments);
        req.setStatus("New Salon Service Request");
        salonWorkRequestList.add(req);
        salonServiceId++;
    }
    
    public void createHomeServiceRequest(String salonName, String custName, String beautician, ArrayList<Service> serv, String serviceAddress, String comments) {
        HomeServicesWorkRequest req = new HomeServicesWorkRequest();
        req.setHomeServiceRequestId(String.valueOf(homeServiceId));
        req.setCustName(custName);
        req.setHomeServiceCompanyName(salonName);
        req.setHomeServTechnicianName(beautician);
        req.setHomeServiceRequest(serv);
        req.setServiceAddress(serviceAddress);
        req.setMessage(comments);
        req.setStatus("New Home Service Request");
        homeServiceWorkRequestList.add(req);
        homeServiceId++;
    }
    
    public void createStoreServiceRequest(String storeName, String custName, ArrayList<Products> products, String buyerContact, int amountPaid) {
        StoreServiceWorkRequest shop = new StoreServiceWorkRequest();
        shop.setStoreId(String.valueOf(storeId));
        shop.setCustName(custName);
        shop.setStoreName(storeName);
        shop.setProducts(products);
        shop.setCustContact(buyerContact);
        shop.setTotalPurchase(amountPaid);
        storeWorkRequestList.add(shop);
        storeId++;
    }
    
    public void createPaintingServiceRequest(String paintCompName, String custName, String painter, ArrayList<PaintingPackages> paintPackage, String serviceAddress, String comments) {
        HomePaintingWorkRequest req = new HomePaintingWorkRequest();
        req.setPaintingRequestId(String.valueOf(paintingId));
        req.setCustName(custName);
        req.setPaintingCompanyName(paintCompName);
        req.setPainterName(painter);
        req.setPaintingRequest(paintPackage);
        req.setServiceAddress(serviceAddress);
        req.setInstructions(comments);
        req.setStatus("New Painting Service Request");
        homePaintingWorkRequestList.add(req);
        paintingId++;
    }
    
    public void createPestControlRequest(String pestControlOrgName, String custName, String pestControlTech, ArrayList<PestControlServices> service, String serviceAddress, String issue) {
        PestControlWorkRequest req = new PestControlWorkRequest();
        req.setPestControlRequestId(String.valueOf(pestServiceId));
        req.setCustName(custName);
        req.setPestControlCOmpanyName(pestControlOrgName);
        req.setPestContTechnicianName(pestControlTech);
        req.setPestControlService(service);
        req.setServiceAddress(serviceAddress);
        req.setIssue(issue);
        req.setStatus("New Pest Control Service Request");
        pestControlWorkRequestList.add(req);
        pestServiceId++;
    }
    
    
    @Override
    public String toString() {
        return customerName;
    }
    
    
}
