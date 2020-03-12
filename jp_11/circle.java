/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jp_11;

/**
 *
 * @author Huy Toan
 */
public class circle extends shape {

    public double radius;

    public circle() {
        super();
    }

    public circle(double radius) {
        this.radius = radius;
    }

    public circle(double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return radius * radius * Math.PI;
    }

    @Override
    public double getPerimeter() {
        return radius * 2 * Math.PI;
    }

    @Override
    public String toString() {
        return "circle[" + super.toString() + "," + "radius=" + radius + ']';
    }

}
