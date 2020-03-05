/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jp_06;

import java.util.Scanner;

/**
 *
 * @author Huy Toan
 */
public class reverseInt {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //nhập vào một số 
        int number = 0;
        System.out.print("nhạp vào một số: ");
        number = sc.nextInt();
        int reversedNumber = 0;
        int temp = 0;
        for (; number > 0;) {
            temp = number % 10;
            reversedNumber = reversedNumber * 10 + temp;
            number = number / 10;
        }
        System.out.println("Số ngược lại của " + number + " là: " + reversedNumber);

    }
}
