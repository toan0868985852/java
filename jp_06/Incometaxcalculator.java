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
public class Incometaxcalculator {

    public static void main(String[] args) {
        final int sentinel = -1;
        Scanner sc = new Scanner(System.in);
        int taxableincome = 0;
        double taxpayablein = 1;
        while (taxableincome != sentinel) {
            System.out.print("nhập số tiền: ");
            taxableincome = sc.nextInt();
            if (taxableincome <= 20000) {
                taxpayablein = taxpayablein * 0;
            } else if (taxableincome <= 40000) {
                taxpayablein = (20000 * 0) + ((taxableincome - 20000) * 0.1);
            } else if (taxableincome <= 60000) {
                taxpayablein = (20000 * 0) + (20000 * 0.1) + ((taxableincome - 40000) * 0.2);
            } else if (taxableincome <= 80000) {
                taxpayablein = (20000 * 0) + (20000 * 0.1) + (20000 * 0.2) + ((taxableincome - 60000) * 0.3);
            } else if (taxableincome <= 100000) {
                taxpayablein = (20000 * 0) + (20000 * 0.1) + (20000 * 0.2) + (20000 * 0.3) + ((taxableincome - 80000) * 0.4);
            }

            System.out.printf("the in come tax payable is: $%.2f%n", taxpayablein);

        }

    }
}
