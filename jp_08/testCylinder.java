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
public class testCylinder {

    public static void main(String[] args) {
        cylinder c1 = new cylinder();
        System.out.println(c1);
        c1.setColor("balck");
        c1.setHeight(10);
        c1.setRadius(2.1);
        System.out.println("color: " + c1.getColor());
        System.out.println("radius: " + c1.getRadius());
        System.out.println("height: " + c1.getHeight());
        System.out.println("volume: " + c1.getVolume());

        System.out.println("--------------------------");

        cylinder c2 = new cylinder(8.4, 4, "yellow");
        System.out.println("color: " + c2.getColor());
        System.out.println("radius: " + c2.getRadius());
        System.out.println("height: " + c2.getHeight());
        System.out.println("volume: " + c2.getVolume());
        System.out.println(c2);
    }
}
