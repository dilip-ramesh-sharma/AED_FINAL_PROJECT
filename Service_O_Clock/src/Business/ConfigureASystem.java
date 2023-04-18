/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business;

import Employee.Employee;
import Role.SysAdmin;
import UserAccounts.UserAccounts;

/**
 *
 * @author hi
 */
public class ConfigureASystem {
    public static Ecosystem configure(){
        
        Ecosystem system = Ecosystem.getInstance();
        
        //Create a network
        //create an enterprise
        //initialize some organizations
        //have some employees 
        //create user account
        
        
        Employee employee = system.getEmployeeDirectory().createEmployee("RRH");
        
        UserAccounts ua = system.getUserAccountDirectory().createUser("Admin", "sysadmin", "sysadmin", employee, new SysAdmin());
        
        return system;
    }
}
