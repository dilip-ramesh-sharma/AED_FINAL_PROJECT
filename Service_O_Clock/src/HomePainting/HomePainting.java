/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package HomePainting;

import WorkQueue.HomePaintingWorkRequest;
import java.util.ArrayList;

/**
 *
 * @author hi
 */
public class HomePainting {
    private String username;
    int requestId = 1;
    private ArrayList<PaintingPackages> paintingPackageList;
    private ArrayList<HomePaintingWorkRequest> homePaintingRequestList;
    private String paintName;
    private String paintType;
    private String paintArea;
    private String paintContact;
    
    public HomePainting(String username) {
        this.username = username;
        paintingPackageList = new ArrayList<PaintingPackages>();
        homePaintingRequestList = new ArrayList<HomePaintingWorkRequest>();
    }

    public String getPaintName() {
        return paintName;
    }

    public void setPaintName(String paintName) {
        this.paintName = paintName;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getRequestId() {
        return requestId;
    }

    public void setRequestId(int requestId) {
        this.requestId = requestId;
    }

    public ArrayList<PaintingPackages> getPaintingPackageList() {
        return paintingPackageList;
    }

    public void setPaintingPackageList(ArrayList<PaintingPackages> paintingPackageList) {
        this.paintingPackageList = paintingPackageList;
    }

    public ArrayList<HomePaintingWorkRequest> getHomePaintingRequestList() {
        return homePaintingRequestList;
    }

    public void setHomePaintingRequestList(ArrayList<HomePaintingWorkRequest> homePaintingRequestList) {
        this.homePaintingRequestList = homePaintingRequestList;
    }

    public String getPaintType() {
        return paintType;
    }

    public void setPaintType(String paintType) {
        this.paintType = paintType;
    }

    public String getPaintArea() {
        return paintArea;
    }

    public void setPaintArea(String paintArea) {
        this.paintArea = paintArea;
    }

    public String getPaintContact() {
        return paintContact;
    }

    public void setPaintContact(String paintContact) {
        this.paintContact = paintContact;
    }
    
    public void addPaintPackage(PaintingPackages paintPackage){
        paintingPackageList.add(paintPackage);
    }
    
    public void removePaintPackage(PaintingPackages paintPackage){
        paintingPackageList.remove(paintPackage);
    }
    
    public void newPaintingRequest(String paintPackageName, String custName, String painter, ArrayList<PaintingPackages> paintingRequest, String serviceAddress,String instructions) {
        HomePaintingWorkRequest paintReq = new HomePaintingWorkRequest();
        paintReq.setPaintingRequestId(String.valueOf(requestId));
        paintReq.setCustName(custName);
        paintReq.setPaintingCompanyName(paintPackageName);
        paintReq.setPainterName(painter);
        paintReq.setPaintingRequest(paintingRequest);
        paintReq.setServiceAddress(serviceAddress);
        paintReq.setInstructions(instructions);
        paintReq.setStatus("New Painting Request");
        homePaintingRequestList.add(paintReq);
        requestId++;
    }
    
    @Override
    public String toString() {
        return paintType;
    }
}
