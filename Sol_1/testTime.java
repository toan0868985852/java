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
public class testTime {

    public static void main(String[] args) {
        time t1 = new time(2, 3, 21);
        
        t1.setHour(2);
        t1.setMinute(5);
        t1.setSecond(10);
        
        System.out.println(t1);

        System.out.println("Hour: " + t1.getHour());
        System.out.println("Minute: " + t1.getMinute());
        System.out.println("Second: " + t1.getSecond());
        
        t1.settime(20, 59, 60);
        System.out.println(t1.nextSecond());
       
        

        
    }
}
