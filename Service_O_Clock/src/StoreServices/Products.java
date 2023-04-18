/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package StoreServices;

/**
 *
 * @author hi
 */
public class Products {
    private String productName;
    private String productCategory;
    private String productDescription;
    private int productAmount;
    private int prodAmountCollected = 0;
    private int amountPerCategory = 0;
    private Boolean amountOpen = true;
    private String productStatus = "Open";
    private int totalStoreAmount = 0;
    
    public Products(String productName, String productDescription, String productCategory, int productAmount) {
        this.productName = productName;
        this.productCategory = productCategory;
        this.productDescription = productDescription;
        this.productAmount = productAmount;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductCategory() {
        return productCategory;
    }

    public void setProductCategory(String productCategory) {
        this.productCategory = productCategory;
    }

    public String getProductDescription() {
        return productDescription;
    }

    public void setProductDescription(String productDescription) {
        this.productDescription = productDescription;
    }

    public int getProductAmount() {
        return productAmount;
    }

    public void setProductAmount(int productAmount) {
        this.productAmount = productAmount;
    }

    public int getProdAmountCollected() {
        return prodAmountCollected;
    }

    public void setProdAmountCollected(int prodAmountCollected) {
        this.prodAmountCollected = prodAmountCollected;
    }

    public int getAmountPerCategory() {
        return amountPerCategory;
    }

    public void setAmountPerCategory(int amountPerCategory) {
        this.amountPerCategory = amountPerCategory;
    }

    public Boolean getAmountOpen() {
        return amountOpen;
    }

    public void setAmountOpen(Boolean amountOpen) {
        this.amountOpen = amountOpen;
    }

    public String getProductStatus() {
        return productStatus;
    }

    public void setProductStatus(String productStatus) {
        this.productStatus = productStatus;
    }

    public int getTotalStoreAmount() {
        return totalStoreAmount;
    }

    public void setTotalStoreAmount(int totalStoreAmount) {
        this.totalStoreAmount = totalStoreAmount;
    }

   
    
    public void setProductStatus(int amountCollected) {
        this.amountPerCategory = amountPerCategory + amountCollected;
        if(amountPerCategory>=productAmount){
            setAmountOpen(false);
            setProductStatus("Purchased");
        }
    }

    @Override
    public String toString() {
        return productName;
    }
}
