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
    ArrayList<Customer> customerDirectory;
    Customer customer;
    
    public CustomerDirectory(){
        this.customerDirectory = new ArrayList<Customer>();
    }

    public ArrayList<Customer> getCustomerDirectory() {
        return customerDirectory;
    }

    public void setCustomerDirectory(ArrayList<Customer> customerDirectory) {
        this.customerDirectory = customerDirectory;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
    
    public Customer createCustomer(String username){
        customer = new Customer(username);
        customerDirectory.add(customer);
        return customer;
    }
    
    public void deleteCustomer(String username){
        for(int i=0;i<customerDirectory.size();i++){
            if(customerDirectory.get(i).getUsername().equals(username)){
                customerDirectory.remove(i);
            }
        }
    }
}
