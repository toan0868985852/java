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
public class rectangle extends shape {

    private double width;
    private double lenght;

    public rectangle() {
        super();
        width = 1.0;
        lenght = 1.0;
    }

    public rectangle(double width, double lenght) {
        this.width = width;
        this.lenght = lenght;
    }

    public rectangle(double width, double lenght, String color, boolean filled) {
        super(color, filled);
        this.width = width;
        this.lenght = lenght;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLenght() {
        return lenght;
    }

    public void setLenght(double lenght) {
        this.lenght = lenght;
    }

    @Override
    public double getArea() {
        return width * lenght;
    }

    @Override
    public double getPerimeter() {
        return (width + lenght) * 2;
    }

    @Override
    public String toString() {
        return "rectangle[" + super.toString() + "," + "width=" + width + ", lenght=" + lenght + ']';
    }

}
