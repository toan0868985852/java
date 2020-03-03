/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jp_4;

/**
 *
 * @author Huy Toan
 */
public class testAuthor {
    public static void main(String[] args) {
        author a1 = new author("code lean","code32621381@gmail.com", 'f');
        System.out.println(a1);
        a1.setEmail("lean1234@fpt.edu.vn");
        System.out.println("name: " + a1.getName());
        System.out.println("email: " + a1.getEmail());
        System.out.println("gender: " + a1.getGender());
        
      
    }
}
