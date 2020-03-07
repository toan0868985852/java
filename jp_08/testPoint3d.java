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
public class testPoint3d {

    public static void main(String[] args) {
        point3d p1 = new point3d(10, 3, 5);
        System.out.println(p1);
        p1.setX(2);
        p1.setY(6);
        p1.setZ(9);
        System.out.println("x: " + p1.getX());
        System.out.println("y: " + p1.getY());
        System.out.println("z: " + p1.getZ());
        
        System.out.println("============");

        point3d p2 = new point3d();
        p2.setXYZ(20, 4.5f, 2.4f);
        System.out.println(p2);
        System.out.println("z = " + p2.getXYZ()[0]);
        System.out.println("y = " + p2.getXYZ()[1]);
        System.out.println("x = " + p2.getXYZ()[2]);
        
    }
}
