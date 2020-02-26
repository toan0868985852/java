/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sol_01;

/**
 *
 * @author Huy Toan
 */
public class rectangle {
    private float length;
    private float width;
    
    public rectangle(){
        length = 1.0f;
        width  = 1.0f;
    }

    public rectangle(float length, float width) {
        this.length = length;
        this.width = width;
    }

    public float getLength() {
        return length;
    }

    public void setLength(float length) {
        this.length = length;
    }

    public float getWidth() {
        return width;
    }

    public void setWidth(float width) {
        this.width = width;
    }
    
    public double getArea(){
        return width * length;
    }
    
    public double getPerimeter(){
        return (width + length) * 2;
    }

    @Override
    public String toString() {
        return "rectangle{" + "length=" + length + ", width=" + width + '}';
    }
    
    
}
