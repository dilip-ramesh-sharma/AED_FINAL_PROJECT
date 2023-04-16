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
    

}
