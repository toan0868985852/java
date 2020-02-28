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
public class testDate1 {

    public static void main(String[] args) {
        Date1 d1 = new Date1(23, 10, 2001);
        System.out.println(d1.toString());
        Date1 d2 = new Date1();
        d2.setDate(12, 2, 2020);
        System.out.println("Day: " + d2.getDay());
        System.out.println("Month: " + d2.getMonth());
        System.out.println("Year: " + d2.getYear());
        System.out.println(d2.toString());
        
    }
}
