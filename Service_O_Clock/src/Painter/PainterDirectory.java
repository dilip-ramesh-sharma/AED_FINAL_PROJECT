/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Painter;

import Painter.Painter;
import java.util.ArrayList;

/**
 *
 * @author tanujkodali
 */
public class PainterDirectory {
     private ArrayList<Painter> painterList;
    private Painter painter;
    
    public PainterDirectory() {
       painterList = new ArrayList<Painter>();
    }

    public ArrayList<Painter> getPainterList() {
        return painterList;
    }

    public void setPainterList(ArrayList<Painter> painterList) {
        this.painterList = painterList;
    }

    public Painter getPainter() {
        return painter;
    }

    public void setPainter(Painter painter) {
        this.painter = painter;
    }
    
    public Painter createPainter(String name, String username){
        painter = new Painter(name, username);
        painterList.add(painter);
        return painter;
    }
    
    public void deletePainter(String username){
         for(int i=0; i < painterList.size(); i++){
            if(painterList.get(i).getPainterName().equals(username)){
                painterList.remove(i);
            }
        }
    }
}
