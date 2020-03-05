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
public class sumProducMinmax3 {
    public static void main(String[] args) {
        int sum = 0, product = 1;
        Scanner sc = new Scanner(System.in);
        int[] arr = {4, 7, 2};
        int min = arr[0];
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            product *= arr[i];
            if (arr[i] < min) {
                min = arr[i];
            }
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("sum is: " + sum);
        System.out.println("product is: " + product);
        System.out.println("min is: " + min);
        System.out.println("max is: " + max);
    }
}
