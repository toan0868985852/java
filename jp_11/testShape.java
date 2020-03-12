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
public class testShape {

    public static void main(String[] args) {
        shape s1 = new circle(3.2, "blue", true);
        System.out.println(s1);
        System.out.println(s1.getArea());
        System.out.println(s1.getPerimeter());
        System.out.println(s1.getColor());
        System.out.println(s1.isFilled());
        System.out.println("-----------------");

        circle c1 = (circle) s1;
        System.out.println(c1.getArea());
        System.out.println(c1.getPerimeter());
        System.out.println(c1.getColor());
        System.out.println(c1.getRadius());
        System.out.println(c1.isFilled());

        System.out.println("===================");
        shape s2 = new rectangle(12, 13, "black", false);
        System.out.println(s2);
        System.out.println(s2.getArea());
        System.out.println(s2.getPerimeter());
        System.out.println(s2.getColor());
        
        System.out.println("========================");
        rectangle r1 = (rectangle) s2;
        System.out.println(r1);
        System.out.println(r1.getLenght());
        System.out.println(r1.getWidth());
        System.out.println(r1.getArea());
        System.out.println(r1.getColor());
        
        System.out.println("=======================");
        shape s3 = new square(8, "blue", true);
        System.out.println(s3);
        System.out.println(s3.getArea());
        System.out.println(s3.getPerimeter());
        System.out.println(s3.getColor());
        
        System.out.println("====================");
        square s4 = (square) s3;
        System.out.println(s4);
        System.out.println(s4.getSide());
        System.out.println(s4.getLenght());
        System.out.println(s4.getArea());
        System.out.println(s4.getColor());

    }
}
