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
public class teststudent {
      public static void main(String[] args) {
        student c1 = new student("toan", 8.5);
        String name = c1.getName();
          System.out.println("name:" + c1.getName());
        System.out.println(c1.toString());
        
         student c2 = new student("long", 5.5);
        System.out.println(c2.toString());
        
         student c3 = new student("tuan", 9.0);
        System.out.println(c3.toString());
        
    }
}
