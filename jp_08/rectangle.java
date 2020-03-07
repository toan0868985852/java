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
public class rectangle extends shape{
    private double width;
    private double length;

    public rectangle() {
        super();
        width = 1.0;
        length = 1.0;
    }

    public rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public rectangle(double width, double length, String color, boolean filled) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }
    
    public double getArea(){
        return width * length;
    }
    
    public double getPerimeter(){
        return width + length;
    }

    @Override
    public String toString() {
        return "rectangle["+ super.toString()+ "," + "width=" + width + ", length=" + length + ']';
    }
    
    
}
