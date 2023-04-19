/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Role;

import Business.Ecosystem;
import UserAccounts.UserAccounts;
import javax.swing.JPanel;

/**
 *
 * @author hi
 */
public abstract class Role {
    
    public enum RoleType{
        SalonServicesAdminRole("SalonServicesAdminRole"),
        HomeServicesAdminRole("HomeServicesAdminRole"),
        StoreAdminRole("StoreAdminRole"),
        HomePaintingAdminRole("HomePaintingAdminRole"),
        PestControlAdminRole("PestControlAdminRole"),
        CustomerRole("CustomerRole"),
        BeauticianRole("BeauticianRole"),
        PestControlTechnicianRole("PestControlTechnicianRole"),
        PainterRole("PainterRole"),
        SysAdmin("Sysadmin");
        
        private String roleValue;
        
        private RoleType(String roleValue){
            this.roleValue = roleValue;
        }

        public String getRoleValue() {
            return roleValue;
        }

        public void setRoleValue(String roleValue) {
            this.roleValue = roleValue;
        }
        

        @Override
        public String toString() {
            return roleValue;
        }
    }
    
    public abstract JPanel createWorkArea(JPanel userProcessContainer, UserAccounts userAccounts,  Ecosystem ecosystem);

    @Override
    public String toString() {
        return this.getClass().getName();
    }
}
