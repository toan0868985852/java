/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Examples_of_classes;

/**
 *
 * @author Huy Toan
 */
public class TestStudent {
    public static void main(String[] args) {
        Student Student = new Student("toan", 8.5);
        System.out.println("name:" + Student.getName());
        System.out.println("điểm trung bình:" + Student.getGpa());
    }
}
