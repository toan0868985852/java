/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sol_1;

/**
 *
 * @author Huy Toan
 */
public class circle {

    private double radius;

    public circle() {
        radius = 1;              
    }

    public circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return radius * radius * Math.PI;
    }

    @Override
    public String toString() {
        return "circle{" + "radius=" + radius + '}';
    }
}
