/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Customer;

import java.util.ArrayList;

/**
 *
 * @author hi
 */
public class CustomerDirectory {
    ArrayList<Customer> customerList;
    Customer customer;
    
    public CustomerDirectory(){
        this.customerList = new ArrayList<Customer>();
    }

    public ArrayList<Customer> getCustomerList() {
        return customerList;
    }

    public void setCustomerList(ArrayList<Customer> customerList) {
        this.customerList = customerList;
    }

    

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
    
    public Customer createCustomer(String username){
        Customer customer = new Customer(username);
        if(customerList!=null){
          customerList.add(customer);  
        }
        
        return customer;
    }
    
    public void deleteCustomer(String username){
        for(int i=0;i<customerList.size();i++){
            if(customerList.get(i).getUsername().equals(username)){
                customerList.remove(i);
            }
        }
    }
}
