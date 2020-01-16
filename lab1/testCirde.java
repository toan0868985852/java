/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1;

/**
 *
 * @author Huy Toan
 */
public class testCirde {
    public static void main(String[] args) {
        Circle1 c1 = new Circle1();
        String color1 = c1.getColor();
        System.out.println("color:" + color1);
        double radius = c1.getRadius();
        System.out.println("radius:" + radius);
        
        Circle1 c2 = new Circle1("red");
        System.out.println(c2.toString());
        
        Circle1 c3 = new Circle1(1.2);
        System.out.println(c3.toString());
        
        Circle1 c4 = new Circle1(19.4, "green");
        System.out.println(c4.toString());
    }
   
}
