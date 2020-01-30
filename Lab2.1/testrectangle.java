/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2;
//
//import java.util.Scanner;



/**
 *
 * @author Huy Toan
 */
public class testrectangle {
   
   
    public static void main(String[] args) {
        
        
//        testrectangle testrectangle = new testrectangle();
       
//        testrectangle testrectangleA;
       
   
        Rectangle Rectangle = new Rectangle();
        
       
       
       Rectangle.printInfo();
       
       Rectangle.setHeight(4);
       Rectangle.setWidth(6);
       
       Rectangle.printInfo();
    
        
//        studentB.setId(3);
//        studentB.setName("nguyen van B");
//        studentB.printInfo();   
        
//        Scanner sc = new Scanner(System.in);
        int chieu_rong = Rectangle.chieu_rong;
        int chieu_dai  = Rectangle.chieu_dai;
        
//        System.out.println("nhập vào số hàng: ");
//        chieu_rong = sc.nextInt();
//        System.out.println("nhập vào số cột:");
//        chieu_dai = sc.nextInt();
        
        for (int i = 0; i < chieu_rong; i++) {
            for (int j = 0; j < chieu_dai; j++) {
                System.out.printf(" # ");        
            }
            System.out.println("");
        }
    }

}
