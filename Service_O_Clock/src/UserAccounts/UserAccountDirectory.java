/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UserAccounts;

import Role.Role;
import java.util.ArrayList;

/**
 *
 * @author hi
 */
public class UserAccountDirectory {
    private ArrayList<UserAccounts> userAccountDirectory;
    
    public UserAccountDirectory() {
        userAccountDirectory = new ArrayList();
    }

    public ArrayList<UserAccounts> getUserAccountDirectory() {
        return userAccountDirectory;
    }

    public void setUserAccountDirectory(ArrayList<UserAccounts> userAccountDirectory) {
        this.userAccountDirectory = userAccountDirectory;
    }
    
    public UserAccounts authenticateUser(String username, String password){
        for (UserAccounts ua : userAccountDirectory)
            if (ua.getUsername().equals(username) && ua.getPassword().equals(password)){
                return ua;
            }
        return null;
    }
    
    public UserAccounts createUser(String name, String username, String password, /*Employee employee,*/ Role role){
        UserAccounts userAccount = new UserAccounts();
        userAccount.setName(name);
        userAccount.setUsername(username);
        userAccount.setPassword(password);
        //userAccount.setEmployee(employee);
        userAccount.setRole(role);
        userAccountDirectory.add(userAccount);
        return userAccount;
    }
    
    public void deleteUser(UserAccounts user){
        userAccountDirectory.remove(user);
    }
    
    public void updateUserAccount(UserAccounts user, String name, String username, String password){
        user.setName(name);
        user.setUsername(username);
        user.setPassword(password);
    }
    
    public boolean checkIsUnique(String username){
        for (UserAccounts ua : userAccountDirectory){
            if (ua.getUsername().equals(username))
                return false;
        }
        return true;
    }
}
