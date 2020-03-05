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
public class swap2integers {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b, temp;
        System.out.println("giá trị trước khi trao đổi:");
        System.out.print("a = ");
        a = sc.nextInt();
        System.out.print("b = ");
        b = sc.nextInt();

        temp = a;
        a = b;
        b = temp;
        System.out.println("giá trị sau khi trao đổi: ");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}
