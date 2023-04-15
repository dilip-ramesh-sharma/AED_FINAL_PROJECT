/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package WorkQueue;

import HomePainting.PaintingPackages;
import java.util.ArrayList;

/**
 *
 * @author hi
 */
public class HomePaintingWorkRequest {
    
    private String paintingRequestId;
    private String paintingCompanyName;
    private String custName;
    private String painterName;
    private String serviceAddress;
    private ArrayList<PaintingPackages> paintingRequest;
    private String personName;
    private String instructions;
    private String status;
    

    public String getPaintingRequestId() {
        return paintingRequestId;
    }

    public void setPaintingRequestId(String paintingRequestId) {
        this.paintingRequestId = paintingRequestId;
    }

    public String getPaintingCompanyName() {
        return paintingCompanyName;
    }

    public void setPaintingCompanyName(String paintingCompanyName) {
        this.paintingCompanyName = paintingCompanyName;
    }

    public String getCustName() {
        return custName;
    }

    public void setCustName(String custName) {
        this.custName = custName;
    }

    public String getPainterName() {
        return painterName;
    }

    public void setPainterName(String painterName) {
        this.painterName = painterName;
    }

    public String getServiceAddress() {
        return serviceAddress;
    }

    public void setServiceAddress(String serviceAddress) {
        this.serviceAddress = serviceAddress;
    }

    public ArrayList<PaintingPackages> getPaintingRequest() {
        return paintingRequest;
    }

    public void setPaintingRequest(ArrayList<PaintingPackages> paintingRequest) {
        this.paintingRequest = paintingRequest;
    }

    public String getPersonName() {
        return personName;
    }

    public void setPersonName(String personName) {
        this.personName = personName;
    }

    public String getInstructions() {
        return instructions;
    }

    public void setInstructions(String instructions) {
        this.instructions = instructions;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    
    @Override
    public String toString() {
        return paintingRequestId;
    }


}
