/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Role;

import Business.Ecosystem;
import UI.BeauticianPanels.BeauticianWorkAreaJPanel;
import UserAccounts.UserAccounts;
import javax.swing.JPanel;

/**
 *
 * @author hi
 */
public class BeauticianRole extends Role{
    
    @Override
    public JPanel createWorkArea(JPanel workAreaContainer, UserAccounts userAccounts, Ecosystem ecosystem) {
        return new BeauticianWorkAreaJPanel(workAreaContainer, userAccounts, ecosystem);
    }
    
}
