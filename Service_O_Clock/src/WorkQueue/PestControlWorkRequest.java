/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package WorkQueue;

import PestControlOrganization.PestControlServices;
import java.util.ArrayList;

/**
 *
 * @author hi
 */
public class PestControlWorkRequest {
    
    private String pestControlRequestId;
    private String pestControlCOmpanyName;
    private String custName;
    private String pestContTechnicianName;
    private String serviceAddress;
    private ArrayList<PestControlServices> pestControlService;
    private String status;
    private String issue;

    public PestControlWorkRequest(){
        this.pestControlService = new ArrayList<PestControlServices>();
    }

    public String getPestControlRequestId() {
        return pestControlRequestId;
    }

    public void setPestControlRequestId(String pestControlRequestId) {
        this.pestControlRequestId = pestControlRequestId;
    }

    public String getPestControlCOmpanyName() {
        return pestControlCOmpanyName;
    }

    public void setPestControlCOmpanyName(String pestControlCOmpanyName) {
        this.pestControlCOmpanyName = pestControlCOmpanyName;
    }

    public String getCustName() {
        return custName;
    }

    public void setCustName(String custName) {
        this.custName = custName;
    }

    public String getPestContTechnicianName() {
        return pestContTechnicianName;
    }

    public void setPestContTechnicianName(String pestContTechnicianName) {
        this.pestContTechnicianName = pestContTechnicianName;
    }

    public String getServiceAddress() {
        return serviceAddress;
    }

    public void setServiceAddress(String serviceAddress) {
        this.serviceAddress = serviceAddress;
    }

    public ArrayList<PestControlServices> getPestControlService() {
        return pestControlService;
    }

    public void setPestControlService(ArrayList<PestControlServices> pestControlService) {
        this.pestControlService = pestControlService;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getIssue() {
        return issue;
    }

    public void setIssue(String issue) {
        this.issue = issue;
    }
    
    
    @Override
    public String toString() {
        return pestControlRequestId;
    }
}
