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
public class testproduct {
      public static void main(String[] args) {
         Product Product = new Product(1, "nam", 100, 3, "còn hàng" );
        System.out.println(Product.toString());
        System.out.println("gia:" + Product.getGia());
        System.out.println("qty:" +Product.getQty());
        System.out.println("gia:" + Product.setGia());
    }
      
}
