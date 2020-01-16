/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1;

/**
 *
 * @author Huy Toan
 */
public class Circle1 {
    private double radius;
    private String color = "red";
    
    //contractor khoi tao doi tuong
    public Circle1(){
        radius = 5;
        color = "blue";
    }
    public Circle1(double radius){
        this.radius = radius;
    }
    public Circle1(String color){
        this.color = color;
    }
    
    public Circle1(double radius, String color){
        this.radius = radius;
        this.color = color;
    }
    /**
     * lay ra ban kinh
     */
    public double getRadius(){
        return radius;
    }/**
     * lay mau sac
     * @return 
     */
    public String getColor(){
        return color;
    }
    /**
     * lay ra dien tich
     */
    public double  getArea(){
        return radius * radius * Math.PI;
    }

    @Override
    public String toString() {
        return "Circle1{" + "radius=" + radius + ", color=" + color + '}';
    }
    
}
