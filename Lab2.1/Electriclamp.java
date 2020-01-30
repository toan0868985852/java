/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2;

/**
 *
 * @author Huy Toan
 */
public class Electriclamp {
    
    private boolean status;
    
    public Electriclamp(){
        status = false;
    }
    
    public void turnOff(){
        status = false;
    }
    
    public void turnOn(){
        status = true;
    }
}
