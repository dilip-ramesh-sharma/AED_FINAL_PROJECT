/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Role;

/**
 *
 * @author hi
 */
public abstract class Role {
    public enum RoleType{
        SalonServicesOrg("SalonServicesOrg"),
        HomeServicesOrg("HomeServicesOrg"),
        Marketing("Marketing"),
        HomePaintingOrg("HomePaintingOrg"),
        PestControlOrg("PestControlOrg"),
        Customer("Customer"),
        Beautician("Beautician"),
        PestControlTechnician("PestControlTechnician"),
        Painter("Painter"),
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
}
