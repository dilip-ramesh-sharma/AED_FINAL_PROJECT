/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Role;

import Business.Ecosystem;
import UI.Customer.CustomerWorkAreaJPanel;
import UserAccounts.UserAccounts;
import javax.swing.JPanel;

/**
 *
 * @author hi
 */
public class CustomerRole extends Role{
    
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccounts userAccounts, Ecosystem ecosystem) {
        return new CustomerWorkAreaJPanel(userProcessContainer, userAccounts, ecosystem);
    }
    
}
