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
public class shape {
    private String color;
    private boolean filled;

    public shape() {
        color = "red";
        filled = true;
    }

    public shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    
    public boolean isFilled(){
        return true;
    }

    @Override
    public String toString() {
        return "shape[" + "color=" + color + ", filled=" + filled + ']';
    }
    
    
    
}
