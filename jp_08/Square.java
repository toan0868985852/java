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
public class Square extends rectangle {
    
    public Square() {
    }
    
    public Square(double side) {
        super(side, side);
    }
    
    public Square(double side, String color, boolean filled) {
        super(side, side, color, filled);
    }
    
    public double getSide() {
        return this.getSide();
    }
    
    public void setSide(double side) {
        this.setSide(side);
    }
    
    public void setWidth(double side) {
        super.setWidth(side);
    }
    
    public void setLenght(double side) {
        super.setLength(side);
    }

    @Override
    public String toString() {
        return "Square["+ super.toString()+']';
    }
    
    
}
