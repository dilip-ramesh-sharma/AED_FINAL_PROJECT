/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PestControlOrganization;


import WorkQueue.PestControlWorkRequest;
import java.util.ArrayList;

/**
 *
 * @author tanujkodali
 */
public class PestControl {
    private String username;
    int pestControlId = 1;
    private ArrayList<PestControlServices> pestControlServiceList;
    private ArrayList<PestControlWorkRequest> pestControlRequestList;
    private String pestControlOrgName;
    private String pestControlOrgAddress;
    private String pestControlOrgPhNum;
    private String pestControlOrgEmail;
    
    public PestControl(String username) {
        this.username = username;
        pestControlServiceList = new ArrayList<PestControlServices>();
        pestControlRequestList = new ArrayList<PestControlWorkRequest>();
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getPestControlId() {
        return pestControlId;
    }

    public void setPestControlId(int pestControlId) {
        this.pestControlId = pestControlId;
    }

    public ArrayList<PestControlServices> getPestControlServiceList() {
        return pestControlServiceList;
    }

    public void setPestControlServiceList(ArrayList<PestControlServices> pestControlServiceList) {
        this.pestControlServiceList = pestControlServiceList;
    }

    public ArrayList<PestControlWorkRequest> getPestControlRequestList() {
        return pestControlRequestList;
    }

    public void setPestControlRequestList(ArrayList<PestControlWorkRequest> pestControlRequestList) {
        this.pestControlRequestList = pestControlRequestList;
    }

    public String getPestControlOrgName() {
        return pestControlOrgName;
    }

    public void setPestControlOrgName(String pestControlOrgName) {
        this.pestControlOrgName = pestControlOrgName;
    }

    public String getPestControlOrgAddress() {
        return pestControlOrgAddress;
    }

    public void setPestControlOrgAddress(String pestControlOrgAddress) {
        this.pestControlOrgAddress = pestControlOrgAddress;
    }

    public String getPestControlOrgPhNum() {
        return pestControlOrgPhNum;
    }

    public void setPestControlOrgPhNum(String pestControlOrgPhNum) {
        this.pestControlOrgPhNum = pestControlOrgPhNum;
    }

    public String getPestControlOrgEmail() {
        return pestControlOrgEmail;
    }

    public void setPestControlOrgEmail(String pestControlOrgEmail) {
        this.pestControlOrgEmail = pestControlOrgEmail;
    }
    
    

    public void addPestControlServices(PestControlServices service){
        pestControlServiceList.add(service);
    }
    
    public void removePestControlServices(PestControlServices service){
        pestControlServiceList.remove(service);
    }
    
    public void newPestControlRequest(String PestOrgName, String custName, String pestContTechnicianName, ArrayList<PestControlServices> pestControlService, String serviceAddress, String issue) {
        PestControlWorkRequest pestReq = new PestControlWorkRequest();
        pestReq.setPestControlRequestId(String.valueOf(pestControlId));
        pestReq.setCustName(custName);
        pestReq.setPestControlCOmpanyName(PestOrgName);
        pestReq.setPestContTechnicianName(pestContTechnicianName);
        pestReq.setPestControlService(pestControlService);
        pestReq.setServiceAddress(serviceAddress);
        pestReq.setIssue(issue);
        pestReq.setStatus("New Request");
        pestControlRequestList.add(pestReq);
        pestControlId++;
    }
    @Override
    public String toString() {
        return pestControlOrgName;
    }
    
}
