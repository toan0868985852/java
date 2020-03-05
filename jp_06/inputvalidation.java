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
public class inputvalidation {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number;
        boolean valid;
        valid = false;

        do {
            System.out.print("nhập vào một số từ (0 - 10) hoặc (90 - 100): ");
            number = sc.nextInt();
            if (number >= 0 && number <= 10 || number >= 90 && number <= 100) {
                valid = true;
            } else {
                System.out.println("không hợp lệ mời nhập lại...");
            }
        } while (!valid);

    }
}
