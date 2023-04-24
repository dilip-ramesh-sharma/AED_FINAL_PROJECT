/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Beautician;

import StoreServices.Products;
import WorkQueue.SalonWorkRequest;
import WorkQueue.StoreServiceWorkRequest;
import java.util.ArrayList;

/**
 *
 * @author 91730
 */
public class BeauticianWorker {
    
    private String beauticianName;
    private String beauticianUsrnme;
    private ArrayList<SalonWorkRequest> beauticianRequestList;
    private ArrayList<StoreServiceWorkRequest> storeServicesRequestList;
    private String beauticianAddress;
    private String beauticianPhoneNumber;
    private Boolean availability = true;
    private int storeId = 1;

    public BeauticianWorker(String beauticianName, String beauticianUsrnme) {
        this.beauticianName = beauticianName;
        this.beauticianUsrnme = beauticianUsrnme;
        beauticianRequestList = new ArrayList<SalonWorkRequest>();
        storeServicesRequestList = new ArrayList<StoreServiceWorkRequest>();
    }

    public ArrayList<SalonWorkRequest> getBeauticianRequestList() {
        return beauticianRequestList;
    }

    public void setBeauticianRequestList(ArrayList<SalonWorkRequest> beauticianRequestList) {
        this.beauticianRequestList = beauticianRequestList;
    }

    public String getBeauticianName() {
        return beauticianName;
    }

    public void setBeauticianName(String beauticianName) {
        this.beauticianName = beauticianName;
    }

    public String getBeauticianUsrnme() {
        return beauticianUsrnme;
    }

    public void setBeauticianUsrnme(String beauticianUsrnme) {
        this.beauticianUsrnme = beauticianUsrnme;
    }

    public String getBeauticianAddress() {
        return beauticianAddress;
    }

    public void setBeauticianAddress(String beauticianAddress) {
        this.beauticianAddress = beauticianAddress;
    }

    public String getBeauticianPhoneNumber() {
        return beauticianPhoneNumber;
    }

    public void setBeauticianPhoneNumber(String beauticianPhoneNumber) {
        this.beauticianPhoneNumber = beauticianPhoneNumber;
    }

    public Boolean getAvailability() {
        return availability;
    }

    public void setAvailability(Boolean availability) {
        this.availability = availability;
    }

    public int getStoreId() {
        return storeId;
    }

    public void setStoreId(int storeId) {
        this.storeId = storeId;
    }

    public ArrayList<StoreServiceWorkRequest> getStoreServicesRequestList() {
        return storeServicesRequestList;
    }

    public void setStoreServicesRequestList(ArrayList<StoreServiceWorkRequest> storeServicesRequestList) {
        this.storeServicesRequestList = storeServicesRequestList;
    }
    
    public void createStoreServiceRequest(String storeName, String address, String custName, ArrayList<Products> products, String buyerContact, int amountPaid) {
        StoreServiceWorkRequest shop = new StoreServiceWorkRequest();
        shop.setStoreId(String.valueOf(storeId));
        shop.setCustName(custName);
        shop.setStoreName(storeName);
        shop.setProducts(products);
        shop.setCustContact(buyerContact);
        shop.setTotalPurchase(amountPaid);
        shop.setStoreAddress(address);
        shop.setStatus("Purchased");
        storeServicesRequestList.add(shop);
        storeId++;
    }
    
    
    @Override
    public String toString() {
        return beauticianName;
    }
    
    
}
