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
public class citclecomputation {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double radius, diameter, circumference, area, surfacearea, volume;
        
        System.out.print("the radius: ");
        radius = sc.nextDouble();
        diameter = radius * 2.0;
        area = Math.PI * radius * radius;
        circumference = 2.0 * Math.PI * radius;
        surfacearea = 4 * Math.PI * radius * radius;
        volume = 4/3 * Math.PI * radius * radius * radius;
        
        System.out.printf("diameter is: %.2f%n",diameter);
        System.out.printf("area is: %.2f%n",area);
        System.out.printf("circumference is: %.2f%n",circumference);
        System.out.printf("surfacearea is: %.2f%n",surfacearea);
        System.out.printf("volume is: %.2f%n",volume);
    }

}
