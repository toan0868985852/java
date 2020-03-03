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
public class testCustomer {
    public static void main(String[] args) {
        customer c1 = new customer(3247, "tran van hoang", 200000);
        System.out.println(c1);
        
        customer c2 = new customer(2324, "code lean", 154000);
        c2.setDiscount(342000);
        System.out.println("ID: " + c2.getID());
        System.out.println("name: " + c2.getName());
        System.out.println("discount: " + c2.getDiscount());
    }
}
