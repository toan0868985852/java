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
public class testmovablepoint {
    public static void main(String[] args) {
        movablepoint m1 = new movablepoint(10, 12, 3, 9);
        System.out.println(m1);
        System.out.println("x: " + m1.getX());
        System.out.println("y: " + m1.getY());
        System.out.println("xspeed: " + m1.getxSpeed());
        System.out.println("yspeed: " + m1.getySpeed());
        
        movablepoint m2 = new movablepoint();
        m2.setX(20);
        m2.setY(12.3f);
        m2.setxSpeed(8.1f);
        m2.setySpeed(5.2f);
        System.out.println(m2);
        System.out.println(m2.getSpeed()[0]);
        System.out.println(m2.getSpeed()[1]);
        System.out.println(m2.move().move());
    }
}
