/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Examples_of_classes;

/**
 *
 * @author Huy Toan
 */
public class TestCirde {
    public static void main(String[] args) {
        Circle Circle = new Circle(3.2, "black");
        System.out.println("radius:" + Circle.getRadius());
        System.out.println("color:" + Circle.getColor());
        System.out.println("area:" + Circle.getArea());
    }
}
