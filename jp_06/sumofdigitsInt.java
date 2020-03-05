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
public class sumofdigitsInt {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, s, sum = 0;
        System.out.print("nhập vào một số: ");
        n = sc.nextInt();
        for (; n != 0;) {
            s = n % 10;
            sum += s;
            n /= 10;
        }
        System.out.println("sum = " + sum);

    }

}
