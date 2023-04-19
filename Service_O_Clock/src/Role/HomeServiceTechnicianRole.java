/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Role;

import Business.Ecosystem;
import UI.HomeServiceTechnicianPanels.HomeServiceTechnicianWorkAreaJPanel;
import UserAccounts.UserAccounts;
import javax.swing.JPanel;

/**
 *
 * @author hi
 */
public class HomeServiceTechnicianRole extends Role{
    
    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccounts userAccounts, Ecosystem ecosystem) {
        return new HomeServiceTechnicianWorkAreaJPanel(userProcessContainer, userAccounts, ecosystem);
    }
    
}
