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
public class testcar {
    public static void main(String[] args) {
        car c1 = new car(20, 10.5, 105.3, "40km/h");
        System.out.println(c1.toString());
        
        car c2 = new car(102, 69.15, 5.3, "34km/h");
        System.out.println(c2.toString());
        
        car c3 = new car(29, 15.55, 15.3, "23km/h");
        System.out.println(c3.toString());
        
        car c4 = new car(69, 3.53, 11.5, "56km/h");
        System.out.println(c4.toString());
    }
}
