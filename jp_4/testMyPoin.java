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
public class testMyPoin {
    public static void main(String[] args) {
        
    
      MyPoin p1 = new MyPoin();
        System.out.println(p1); 
        p1.setX(10);
        p1.setY(12);
        System.out.println("X: " + p1.getX());
        System.out.println("Y: " + p1.getY());
        
        p1.setXY(4, 5);  
        System.out.println(p1.getXY()[0]);
        System.out.println(p1.getXY()[1]);
        System.out.println(p1);
        
        MyPoin p2 = new MyPoin(2, 4);
        System.out.println(p2);
        System.out.println(p1.distance(p2));
        System.out.println(p2.distance(p1));
        System.out.println(p1.distance(5, 6));
        System.out.println(p1.distance());
        
        MyPoin p3 = new MyPoin();
        MyPoin[] poins = new MyPoin[11];
        for (int i = 1; i < poins.length; i++) {
            poins[i] = new MyPoin(i,i);       
            System.out.printf( "Distance: %.2f%n" + poins[i],p3.distance(poins[i]));
        }
        
    }
}
