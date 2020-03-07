/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jp_08;

/**
 *
 * @author Huy Toan
 */
public class cylinder extends circle{
    public double height;
    
    public cylinder(){
        super();
        height = 1.0;
    }

    public cylinder(double radius) {
        super(radius);
    }

    public cylinder(double height, double radius) {
        super(radius);
        this.height = height;
    }

    public cylinder(double height, double radius, String color) {
        super(radius, color);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    
    public double getVolume(){
        return super.getArea() * height;
    }

    @Override
    public String toString() {
        return super.toString() + "height: " + height;
    }
    
    
}
