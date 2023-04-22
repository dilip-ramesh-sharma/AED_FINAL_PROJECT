/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package StoreServices;

import java.util.ArrayList;

/**
 *
 * @author hi
 */
public class StoreDirectory {
    private ArrayList<Store> storeList;
    private Store store;
    private Products products;
    
    public StoreDirectory(){
        this.storeList = new ArrayList<Store>();
    }

    public ArrayList<Store> getStoreList() {
        return storeList;
    }

    public void setStoreList(ArrayList<Store> storeList) {
        this.storeList = storeList;
    }

    public Store getStore() {
        return store;
    }

    public void setStore(Store store) {
        this.store = store;
    }

    public Products getProducts() {
        return products;
    }

    public void setProducts(Products products) {
        this.products = products;
    }
    
    
    
    public Store createStore(String storeName){
        store = new Store(storeName);
        storeList.add(store);
        return store;
    }
    
    public void deleteStore(String username){
        for(int i=0;i<storeList.size();i++){
            if(storeList.get(i).getUsername().equals(username)){
                storeList.remove(i);
            }
        }
    }
    
    public void updateStore(Store store, String name, String number, String address, String email){
        store.setStoreName(name);
        store.setStoreAddress(address);
        store.setStoreContact(number);
        store.setStoreEmail(email);
    }
    
    public Products createProducts(Store store, String name, String desc, String category, int price){
        products = new Products(name, desc, category, price);
        store.addProducts(products);
        return products;
    }
    
    public void deleteProduct(Store store, Products product){
        store.removeProducts(product); 
    }
}
