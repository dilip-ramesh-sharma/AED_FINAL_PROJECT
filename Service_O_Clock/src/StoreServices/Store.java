/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package StoreServices;

import WorkQueue.StoreServiceWorkRequest;
import java.util.ArrayList;

/**
 *
 * @author hi
 */
public class Store {
    private String username;
    int storeId = 1;
    private ArrayList<Products> productList;
    private ArrayList<StoreServiceWorkRequest> storeServiceRequestList;
    private String storeName;
    private String storeAddress;
    private String storeContact;
    private String storeEmail;
    
    public Store(String username) {
        this.username = username;
        productList = new ArrayList<Products>();
        storeServiceRequestList = new ArrayList<StoreServiceWorkRequest>();
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getStoreId() {
        return storeId;
    }

    public void setStoreId(int storeId) {
        this.storeId = storeId;
    }

    public ArrayList<Products> getProductList() {
        return productList;
    }

    public void setProductList(ArrayList<Products> productList) {
        this.productList = productList;
    }

    public ArrayList<StoreServiceWorkRequest> getStoreServiceRequestList() {
        return storeServiceRequestList;
    }

    public void setStoreServiceRequestList(ArrayList<StoreServiceWorkRequest> storeServiceRequestList) {
        this.storeServiceRequestList = storeServiceRequestList;
    }

    public String getStoreName() {
        return storeName;
    }

    public void setStoreName(String storeName) {
        this.storeName = storeName;
    }

    public String getStoreAddress() {
        return storeAddress;
    }

    public void setStoreAddress(String storeAddress) {
        this.storeAddress = storeAddress;
    }

    public String getStoreContact() {
        return storeContact;
    }

    public void setStoreContact(String storeContact) {
        this.storeContact = storeContact;
    }

    public String getStoreEmail() {
        return storeEmail;
    }

    public void setStoreEmail(String storeEmail) {
        this.storeEmail = storeEmail;
    }
    
     public void addProducts(Products products){
        productList.add(products);
    }
    
    public void removeProducts(Products products){
        productList.remove(products);
    }
    
    public void buyNewProduct(String storeName, String custName, ArrayList<Products> product, String custContact, int total) {
        StoreServiceWorkRequest buy = new StoreServiceWorkRequest();
        buy.setStoreId(String.valueOf(storeId));
        buy.setCustName(custName);
        buy.setStoreName(storeName);
        buy.setProducts(product);
        buy.setCustContact(custContact);
        buy.setTotalPurchase(total);
        storeServiceRequestList.add(buy);
        storeId++;
    }
    
    @Override
    public String toString() {
        return storeName;
    }
}
