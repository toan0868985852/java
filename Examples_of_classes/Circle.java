/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Examples_of_classes;

/**
 *
 * @author Huy Toan
 */
public class Circle {
    private double radius;
    private String color;
    
    public Circle(double radius, String color){
        radius = 3.2;
        color  = "black";
    }
    
    public double getRadius(){
        return radius;
    }
    public String getColor(){
        return color;
    }
    public double  getArea(){
        return radius * radius * Math.PI;
    }
}
