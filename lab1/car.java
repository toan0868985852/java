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
public class car {
    private int plateNumber;
    private double  x;
    private double y;
    private String speed;

    public car(int plateNumber, double x, double y, String speed) {
        this.plateNumber = plateNumber;
        this.x = x;
        this.y = y;
        this.speed = speed;
    }

    car() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public void move(){     
    }
    public void park(){       
    }
    public void accelerate(){
    }

    @Override
    public String toString() {
        return "car{" + "plateNumber=" + plateNumber + ", x=" + x + ", y=" + y + ", speed=" + speed + '}';
    }
    
}
