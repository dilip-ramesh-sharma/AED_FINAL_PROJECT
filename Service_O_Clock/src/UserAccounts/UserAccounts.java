/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UserAccounts;

import Role.Role;
import WorkQueue.SalonWorkQueue;

/**
 *
 * @author hi
 */
public class UserAccounts {
    private String name;
    private String username;
    private String password;
    //private Employee employee;
    private Role role;
    private SalonWorkQueue salonWorkQueue;
    
    public UserAccounts() {
        salonWorkQueue = new SalonWorkQueue();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public SalonWorkQueue getSalonWorkQueue() {
        return salonWorkQueue;
    }

    public void setSalonWorkQueue(SalonWorkQueue salonWorkQueue) {
        this.salonWorkQueue = salonWorkQueue;
    }
    
    @Override
    public String toString() {
        return username;
    }
}
