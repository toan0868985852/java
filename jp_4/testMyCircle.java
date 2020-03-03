/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jp_4;

/**
 *
 * @author Huy Toan
 */
public class testMyCircle {
    public static void main(String[] args) {
        MyPoin p1 = new MyPoin(10, 20);
        System.out.println(p1);
        
        myCircle m = new myCircle(3, 4, 8);
        System.out.println(m);
        myCircle m1 = new myCircle(p1, 11);
        System.out.println(m1);
        
        
        System.out.println(m1.getCenter().getX());
        System.out.println(m1.getCenter().getY());
        
        System.out.println(m1.getCircumference());
        System.out.println(m1.getArea());
        System.out.println(m.distance(m1));
     
    }
}
