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
public class testSpape {

    public static void main(String[] args) {
        circle2 c1 = new circle2(4.2, "red", true);
        System.out.println(c1);
        c1.setColor("black");
        c1.setRadius(7.8);
        System.out.println("color: " + c1.getColor());
        System.out.println("radius: " + c1.getRadius());
        System.out.println("Area: " + c1.getArea());
        System.out.println("perimeter: " + c1.getPerimeter());
        System.out.println("===================");
        rectangle r1 = new rectangle(12.2, 15, "green", true);
        System.out.println(r1);
        r1.setWidth(10);
        r1.setLength(13.8);
        r1.setColor("black");
        System.out.println("color: " + r1.getColor());
        System.out.println("width: " + r1.getWidth());
        System.out.println("lenght: " + r1.getLength());
        System.out.println("area: " + r1.getArea());
        System.out.println("perimeter: " + r1.getPerimeter());
        System.out.println(r1);
        System.out.println("====================");
        Square s1 = new Square(12.9, "pink", false);
        System.out.println(s1);
        s1.setLenght(9.12);
        s1.setWidth(8);
        System.out.println("color: " + s1.getColor());
        System.out.println("lenght: " + s1.getLength());
        System.out.println("width: " + s1.getWidth());
        System.out.println(s1);

    }

}
