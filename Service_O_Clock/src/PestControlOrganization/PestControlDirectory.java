/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PestControlOrganization;

import PestControlOrganization.PestControl;
import java.util.ArrayList;

/**
 *
 * @author tanujkodali
 */
public class PestControlDirectory {
    private ArrayList<PestControl> pestControlOrgList;
    private PestControl pestControlOrg;
    private PestControlServices pestservice;
    

    public PestControlDirectory(){
        this.pestControlOrgList = new ArrayList<PestControl>();
    }

    public ArrayList<PestControl> getPestControlOrgList() {
        return pestControlOrgList;
    }

    public void setPestControlOrgList(ArrayList<PestControl> PestControlOrgList) {
        this.pestControlOrgList = PestControlOrgList;
    }

    public PestControl getPestControlOrg() {
        return pestControlOrg;
    }

    public void setPestControlOrg(PestControl PestControlOrg) {
        this.pestControlOrg = PestControlOrg;
    }

    public PestControlServices getPestservice() {
        return pestservice;
    }

    public void setPestservice(PestControlServices pestservice) {
        this.pestservice = pestservice;
    }
    
    public PestControl createPestControlOrg (String pestControlOrgName){
        pestControlOrg= new PestControl(pestControlOrgName);
        pestControlOrgList.add(pestControlOrg);
        return pestControlOrg;
    }
    
    public void deletePestControlOrg(String username){
        for(int i=0;i<pestControlOrgList.size();i++){
            if(pestControlOrgList.get(i).getUsername().equals(username)){
                pestControlOrgList.remove(i);
            }
        }
    }
    
    public void updatePestControlOrg(PestControl pest, String name, String number, String address, String email){
        pest.setPestControlOrgName(name);
        pest.setPestControlOrgAddress(address);
        pest.setPestControlOrgPhNum(number);
        pest.setPestControlOrgEmail(email);
    }
    
    public PestControlServices addServiceTypes(PestControl pest, String name, String desc, String type){
        pestservice = new PestControlServices(name, desc, type);
        pest.addPestControlServices(pestservice);
        return pestservice;
    }
    
    public void deleteServices(PestControl pest, PestControlServices service){
        pest.removePestControlServices(service); 
    }

}
