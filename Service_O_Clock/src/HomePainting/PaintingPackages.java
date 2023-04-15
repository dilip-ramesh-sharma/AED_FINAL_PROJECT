/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package HomePainting;

/**
 *
 * @author hi
 */
public class PaintingPackages {
    private String paintPackageType;
    private String color;
    private String paintDesc;
    
    public PaintingPackages(String paintPackageType, String color, String paintDesc) {
        this.paintPackageType = paintPackageType;
        this.color = color;
        this.paintDesc = paintDesc;
    }

    public String getPaintPackageType() {
        return paintPackageType;
    }

    public void setPaintPackageType(String paintPackageType) {
        this.paintPackageType = paintPackageType;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getPaintDesc() {
        return paintDesc;
    }

    public void setPaintDesc(String paintDesc) {
        this.paintDesc = paintDesc;
    }
    
    @Override
    public String toString() {
        return paintPackageType;
    }
}
