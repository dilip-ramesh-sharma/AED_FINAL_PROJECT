/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package HomePainting;

import java.util.ArrayList;

/**
 *
 * @author hi
 */
public class HomePaintingDirectory {
    private ArrayList<HomePainting> homePaintingList;
    private HomePainting painting;
    private PaintingPackages paintingPackages;
    
    public HomePaintingDirectory(){
        this.homePaintingList = new ArrayList<HomePainting>();
    }

    public ArrayList<HomePainting> getHomePaintingList() {
        return homePaintingList;
    }

    public void setHomePaintingList(ArrayList<HomePainting> homePaintingList) {
        this.homePaintingList = homePaintingList;
    }

    public HomePainting getPainting() {
        return painting;
    }

    public void setPainting(HomePainting painting) {
        this.painting = painting;
    }

    public PaintingPackages getPaintingPackages() {
        return paintingPackages;
    }

    public void setPaintingPackages(PaintingPackages paintingPackages) {
        this.paintingPackages = paintingPackages;
    }
    
    public HomePainting createPaintCompany(String paintName){
        painting = new HomePainting(paintName);
        homePaintingList.add(painting);
        return painting;
    }
    
    public void deletePaintCompany(String username){
        for(int i=0;i<homePaintingList.size();i++){
            if(homePaintingList.get(i).getUsername().equals(username)){
                homePaintingList.remove(i);
            }
        }
    }
    
    public void updatePaintCompanyInfo(HomePainting paint, String name, String number, String address){
        paint.setPaintType(name);
        paint.setPaintArea(address);
        paint.setPaintContact(number);
    }
    
    public PaintingPackages addPaintPackage(HomePainting paint, String name, String desc, String color){
        paintingPackages = new PaintingPackages(name, desc, color);
        paint.addPaintPackage(paintingPackages);
        return paintingPackages;
    }
    
    public void deletePaintPackage(HomePainting paint, PaintingPackages packages){
        paint.removePaintPackage(packages); 
    }
    
}
