/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package HomeServiceTechnician;

/**
 *
 * @author 91730
 */
public class Technician {
    
    private String technicianName;
    private String technicianUsrnme;
//    private ArrayList<WorkRequest> requestList;
//    private ArrayList<LeafWorkRequest> leafRequestList;
    private String technicianAddress;
    private String technicianPhoneNumber;
    private Boolean availability = true;
//    private ArrayList<WorkRequest> beauticianWorkRequestList;
    
//    public FieldWorker(String name, String userName){
//        this.fieldWorkerName = name;
//        this.fieldWorkerUsername = userName;
//        requestList = new ArrayList<WorkRequest>();
//        leafRequestList = new ArrayList<LeafWorkRequest>();
//    }

    public Technician(String technicianName, String technicianUsrnme) {
        this.technicianName = technicianName;
        this.technicianUsrnme = technicianUsrnme;
//        requestList = new ArrayList<WorkRequest>();
//        leafRequestList = new ArrayList<LeafWorkRequest>();
    }

    public String getTechnicianName() {
        return technicianName;
    }

    public void setTechnicianName(String technicianName) {
        this.technicianName = technicianName;
    }

    public String getTechnicianUsrnme() {
        return technicianUsrnme;
    }

    public void setTechnicianUsrnme(String technicianUsrnme) {
        this.technicianUsrnme = technicianUsrnme;
    }

    public String getTechnicianAddress() {
        return technicianAddress;
    }

    public void setTechnicianAddress(String technicianAddress) {
        this.technicianAddress = technicianAddress;
    }

    public String getTechnicianPhoneNumber() {
        return technicianPhoneNumber;
    }

    public void setTechnicianPhoneNumber(String technicianPhoneNumber) {
        this.technicianPhoneNumber = technicianPhoneNumber;
    }

    public Boolean getAvailability() {
        return availability;
    }

    public void setAvailability(Boolean availability) {
        this.availability = availability;
    }
    
    //   public void addTechnicianRequest(String technicianOrgName, String memName, String technicianWorkerName, ArrayList<Service> request, String cost, String technicianAddress) {
//       WorkRequest requirement = new WorkRequest();
//     
//       requirement.setTechnicianName(technicianName);
//       requirement.setTechnicianOrgName(technicianOrgName);
//       requirement.setMemName(memName);
//       requirement.setRequest(request);
//       requirement.setType(cost);
//       requirement.setServiceAddress(fieldWorkerAddress);
//       requirement.setStatus("New Request");
//       beauticianWorkRequestList.add(requirement);
//    }
    
    
    @Override
    public String toString() {
        return technicianName;
    }
    
}
