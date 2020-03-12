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
public class testMovableRectangle {

    public static void main(String[] args) {
        Movable m1 = new MovableRectangle(2, 4, 1, 2, 12, 15);
        System.out.println(m1);
        System.out.println("--------------------------------------------------------------------");
        Movable m2 = new MovableRectangle(1, 3, 4, 1, 10, 8);
        System.out.println(m2);
        System.out.println("--------------------------------------------------------------------");
        Movable m3 = new MovableRectangle(4, 2, 5, 1, 20, 10);
        System.out.println(m3);

    }

}
