/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sol_01;

/**
 *
 * @author Huy Toan
 */
public class testcircle {
    public static void main(String[] args) {

        circle c1 = new circle();
        double radius = c1.getRadius();
        System.out.println("radius:" + radius);
        
        circle c4 = new circle(5.5);
        System.out.println(c4.getArea());

        circle c2 = new circle(2.3);
        System.out.println(c2.toString());

        circle c3 = new circle(20.1);
        System.out.println(c3.toString());
        
    }
}
