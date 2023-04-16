/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Painter;

import java.util.ArrayList;

/**
 *
 * @author tanujkodali
 */
public class Painter {
       private String PainterName;
    private String PainterUsername;
   // private ArrayList<SoupWorkRequest> soupRequestList;
    private String PainterAddress;
    private String PainterPhNum;
    private Boolean availability = true;
    
    public Painter(String name, String userName){
        this.PainterName = name;
        this.PainterUsername = userName;
        //soupRequestList = new ArrayList<SoupWorkRequest>();
    }

    public String getPainterName() {
        return PainterName;
    }

    public void setPainterName(String PainterName) {
        this.PainterName = PainterName;
    }

    public String getPainterUsername() {
        return PainterUsername;
    }

    public void setPainterUsername(String PainterUsername) {
        this.PainterUsername = PainterUsername;
    }

    public String getPainterAddress() {
        return PainterAddress;
    }

    public void setPainterAddress(String PainterAddress) {
        this.PainterAddress = PainterAddress;
    }

    public String getPainterPhNum() {
        return PainterPhNum;
    }

    public void setPainterPhNum(String PainterPhNum) {
        this.PainterPhNum = PainterPhNum;
    }

    public Boolean getAvailability() {
        return availability;
    }

    public void setAvailability(Boolean availability) {
        this.availability = availability;
    }
    
}
