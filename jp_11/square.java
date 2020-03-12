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
public class square extends rectangle {

    public square() {
        super();
    }

    public square(double side) {
        super(side, side);
    }

    public square(double side, String color, boolean filled) {
        super(side, side, color, filled);
    }

    public double getSide() {
        return super.getLenght();
    }

    public void setSide(double side) {
        this.setSide(side);
    }

    public void setWidth(double side) {
        super.setWidth(side);
    }

    public void setLenght(double side) {
        super.setLenght(side);
    }

    @Override
    public String toString() {
        return "square{" + super.toString() + '}';
    }

}
