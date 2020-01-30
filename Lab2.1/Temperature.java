/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2;

import java.io.PrintStream;

/**
 *
 * @author Huy Toan
 */
public class Temperature {
    double Temperature;
    private double CTemp;
    private double FTemp;
    private double   KTemp;
    
    public Temperature(){
        this.Temperature = 25;
    }

    public Temperature(double Temperature) {
        this.Temperature = Temperature;
    }
    
    public void setCTemp(double value){
         this.CTemp = value;
    }
    public double getCTemp(){
        return this.CTemp;
    }
    
    public double getFTemp(){
        return this.FTemp;
    }
    
    public double getKTemp(){
        return this.KTemp;
    } 
    
    public void printInfo(){
       
        System.out.println("nhiệt độ:");
        System.out.printf(" %f Độ\n", this.Temperature);
        System.out.println("Độ F:");
        System.out.printf(" %f Độ\n", this.Temperature * 1.8 + 32);
        System.out.println("Độ k");
        System.out.printf(" %f Độ\n", this.Temperature + 273.15);
    }
    
}
