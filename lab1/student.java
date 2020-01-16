/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1;

/**
 *
 * @author Huy Toan
 */
public class student {
    private String name;
    private double gpa;
    
    public student(String name, double gpa){
        this.name = name;
        this.gpa  = gpa;
    }
    
    public String getName(){
        return name;
    }
    public double  getGpa(){
        return gpa;
    }

    @Override
    public String toString() {
        return "student{" + "name=" + name + ", gpa=" + gpa + '}';
    }

}
