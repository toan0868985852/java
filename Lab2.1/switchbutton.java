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
public class switchbutton {
    
    private boolean status;
    private Electriclamp Lamp;
    
    public switchbutton(){
        status = false;
    }
    
    public void connectTolamp(Electriclamp Lamp){
        this.Lamp = Lamp;
    }
    
    public void switchOff(){
        status = false;
    }
    
    public void switchOn(){
        if(Lamp != null){
            status = true;
        }
        else{
            switchOff();
        }
    }
    }
    

