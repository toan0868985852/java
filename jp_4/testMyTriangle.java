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
public class testMyTriangle {

    public static void main(String[] args) {
        MyPoin m1 = new MyPoin(10, 8);
        MyPoin m2 = new MyPoin(13, 3);
        MyPoin m3 = new MyPoin(7, 9);
        System.out.println(m1);
        System.out.println(m2);
        System.out.println(m3);

        myTriangle t1 = new myTriangle(m1, m2, m3);
        System.out.println(t1);
        myTriangle t2 = new myTriangle(2, 4, 3, 2, 6, 10);
        System.out.println(t2);
        System.out.println("Primeter: " + t2.getPrimeter());  
    }
}
