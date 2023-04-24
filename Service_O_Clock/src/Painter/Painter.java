/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Painter;

import WorkQueue.HomePaintingWorkRequest;
import java.util.ArrayList;

/**
 *
 * @author tanujkodali
 */
public class Painter {
    private String painterName;
    private String painterUsername;
    private ArrayList<HomePaintingWorkRequest> homePaintingRequestList;
    private String painterAddress;
    private String painterContact;
    private Boolean availability = true;
    
    public Painter(String name, String userName){
        this.painterName = name;
        this.painterUsername = userName;
        homePaintingRequestList = new ArrayList<HomePaintingWorkRequest>();
    }

    public String getPainterName() {
        return painterName;
    }

    public void setPainterName(String painterName) {
        this.painterName = painterName;
    }

    public String getPainterUsername() {
        return painterUsername;
    }

    public void setPainterUsername(String painterUsername) {
        this.painterUsername = painterUsername;
    }

    public ArrayList<HomePaintingWorkRequest> getHomePaintingRequestList() {
        return homePaintingRequestList;
    }

    public void setHomePaintingRequestList(ArrayList<HomePaintingWorkRequest> homePaintingRequestList) {
        this.homePaintingRequestList = homePaintingRequestList;
    }

    public String getPainterAddress() {
        return painterAddress;
    }

    public void setPainterAddress(String painterAddress) {
        this.painterAddress = painterAddress;
    }

    public String getPainterContact() {
        return painterContact;
    }

    public void setPainterContact(String painterContact) {
        this.painterContact = painterContact;
    }
    
    

    public Boolean getAvailability() {
        return availability;
    }

    public void setAvailability(Boolean availability) {
        this.availability = availability;
    }
    
    @Override
    public String toString() {
        return painterName;
    }
}
