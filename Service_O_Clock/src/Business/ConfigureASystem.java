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
        Employee employee = system.getEmployeeDirectory().createEmployee("RRH");
        UserAccounts ua = system.getUserAccountDirectory().createUser("System Admin", "admin", "admin", employee, new SysAdmin());
        
        return system;
    }
}
