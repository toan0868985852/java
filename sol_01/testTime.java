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
public class testTime {

    public static void main(String[] args) {
        Calendar t = Calendar.getInstance();

        int hour = t.get(Calendar.HOUR_OF_DAY);
        int minute = t.get(Calendar.MINUTE);
        int second = t.get(Calendar.SECOND);

        System.out.println("Hour: " + hour);
        System.out.println("Minute: " + minute);
        System.out.println("Second: " + second);
        System.out.println(" " + hour + ":" + minute + ":" + second + " ");

        System.out.println("-----------------");

        time t2 = new time(20, 50, 2);
        System.out.println("Hour: " + t2.getHour());
        System.out.println("Minute: " + t2.getMinute());
        System.out.println("Second: " + t2.getSecond());
        System.out.println(t2.toString());
    }
}
