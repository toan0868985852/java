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
public class staff extends person{
    private String school;
    private double pay;

    public staff() {
    }

    public staff(String school, double pay) {
        this.school = school;
        this.pay = pay;
    }

    public staff(String school, double pay, String name, String address) {
        super(name, address);
        this.school = school;
        this.pay = pay;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public double getPay() {
        return pay;
    }

    public void setPay(double pay) {
        this.pay = pay;
    }

    @Override
    public String toString() {
        return "staff[" + super.toString() +", "+ "school=" + school + ", pay=" + pay + ']';
    }

    
}
