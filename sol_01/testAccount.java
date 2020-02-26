/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sol_01;

/**
 *
 * @author Huy Toan
 */
public class testAccount {

    public static void main(String[] args) {

        Account a1 = new Account("w23twe2", "Trần văn tuấn");
        System.out.println("ID: " + a1.getId());
        System.out.println("Tên: " + a1.getName());
        System.out.println("=========================");

        Account a2 = new Account("ew23y3y23", "Nguyễn Thanh Tùng", 100000);
        System.out.println("ID: " + a2.getId());
        System.out.println("Tên: " + a2.getName());
        System.out.println("Tên: " + a2.getBlance());
        System.out.println("=========================");

        System.out.println(a1.credit(23000));
        System.out.println(a2.debit(10000));
        System.out.println(a1.toString());
        System.out.println(a2.toString());

    }

}
