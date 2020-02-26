/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sol_01;

import java.util.logging.Logger;

/**
 *
 * @author Huy Toan
 */
public class employee {
    private int id;
    private String firstName;
    private String lastName;
    private int salary;

    public employee(int id, String firstName, String lastName, int salary) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
    
    public String getName(){
        return firstName + " " + lastName;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
    
    public int getAnnualsalary(){
        return salary * 12;
    }
    
    public int raiseSalary(){
        return salary;
    }

    @Override
    public String toString() {
        return "employee{" + "id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", salary=" + salary + '}';
    }
   
}
