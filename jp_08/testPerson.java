/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jp_08;

/**
 *
 * @author Huy Toan
 */
public class testPerson {
    public static void main(String[] args) {
        student s1 = new student("java", 20, 100000, "tran van a", "my dinh");
        System.out.println(s1);
        s1.setAddress("tu liem");
        s1.setFee(1300000);
        s1.setYear(18);
        System.out.println("name: " + s1.getName());
        System.out.println("address: " + s1.getAddress());
        System.out.println("program: " + s1.getProgram());
        System.out.println("year: " + s1.getYear());
        System.out.println("fee: " + s1.getFee());
        System.out.println("======================");
        student s2 = new student("php", 22, 900000, "nguyen van thanh", "hoa binh");
        System.out.println("name: " + s2.getName());
        System.out.println("address: " + s2.getAddress());
        System.out.println("program: " + s2.getProgram());
        System.out.println("year: " + s2.getYear());
        System.out.println("fee: " + s2.getFee());
        System.out.println("======================");
        staff f1 = new staff("back khoa", 20.12, "nguyen huy hung", "bac ninh");
        f1.setAddress("thanh hoa");
        f1.setPay(129.2);
        f1.setSchool("FPT");
        System.out.println(f1);
        System.out.println("name: " + f1.getName());
        System.out.println("address: " + f1.getAddress());
        System.out.println("school: " + f1.getSchool());
        System.out.println("pay: " + f1.getPay());
        
    }
}
