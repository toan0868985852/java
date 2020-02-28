/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sol_1;

/**
 *
 * @author Huy Toan
 */
public class testRectangle {

    public static void main(String[] args) {

        rectangle leng = new rectangle();
        float length = leng.getLength();
        System.out.println("length = " + length);

        rectangle with = new rectangle();
        float width = with.getWidth();
        System.out.println("width = " + width);

        rectangle r1 = new rectangle(10, 8);
        System.out.println("Area = " + r1.getArea());

        rectangle r2 = new rectangle(10, 6);
        System.out.println("Perimeter = " + r2.getPerimeter());

        rectangle r3 = new rectangle(32.12f, 10.32f);
        System.out.println(r3.toString());

        rectangle r4 = new rectangle(2.12f, 1.3f);
        System.out.println(r4.toString());

        rectangle r5 = new rectangle(33.12f, 12.32f);
        System.out.println(r5.toString());
    }

}
