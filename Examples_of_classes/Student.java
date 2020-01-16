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
public class Student {
    private String name;
    private double gpa;
    
    public Student(String name, double gpa){
        this.name = "toan";
        this.gpa  = 8.5;
    }
    
    public String getName(){
        return name;
    }
    public double  getGpa(){
        return gpa;
    }
}
