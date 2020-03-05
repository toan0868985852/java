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
public class Add2Integer {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b, sum;
        System.out.print("nhập vào a: ");
        a = sc.nextInt();
        System.out.print("nhập vào b: ");
        b = sc.nextInt();

        sum = a + b;
        System.out.println("tổng của a và b là: " + sum);
    }
}
