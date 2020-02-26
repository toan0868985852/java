/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sol_01;

import java.util.Calendar;
/**
 *
 * @author Huy Toan
 */
public class testDate {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();
        int year = c.get(Calendar.YEAR);
        int month = c.get(Calendar.MONTH);
        int day = c.get(Calendar.DAY_OF_MONTH);
        
        System.out.println("Year: " + year);
        System.out.println("Month: " + (month + 1));
        System.out.println("Day: " + day); 
        
        
        Date d1 = new Date(23,10,2001);
        System.out.println(d1.toString());
        
        Date d2 = new Date(10, 2, 2020);
        System.out.println("Day: " + d2.getDay());
        System.out.println("Month: " + d2.getMonth());
        System.out.println("Year: " + d2.getYear());
        System.out.println(d2.toString());
        
    }
}
