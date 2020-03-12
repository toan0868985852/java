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
public class testMovable {
    public static void main(String[] args) {
        Movable m1 = new MovablePoin(2, 4, 3, 6);
        System.out.println(m1);
        m1.moveLeft();
        System.out.println(m1);
        m1.moveDown();
        System.out.println(m1);
        System.out.println("-----------------------------------------");
        
        Movable m2 = new MovableCircle(3, 1, 4, 6, 10);
        System.out.println(m2);
        m2.moveRight();
        System.out.println(m2);
        m2.moveUp();
        System.out.println(m2);
    }
}
