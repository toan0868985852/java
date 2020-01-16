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
public class TestSoccerplayer {
    public static void main(String[] args) {
  
        Soccerplayer c1 = new Soccerplayer(20, "toan", 10, 20);
        System.out.println(c1.toString());
   
        Soccerplayer c2 = new Soccerplayer(10, "thanh", 11, 8);
        System.out.println(c2.toString());
        
        Soccerplayer c3 = new Soccerplayer(12, "tung", 112, 32);
        System.out.println(c3.toString());
       
    }
}
