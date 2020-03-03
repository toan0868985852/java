/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jp_4;

/**
 *
 * @author Huy Toan
 */
public class MyPoin {
    private int x;
    private int y;
    
    public MyPoin(){
        this.x = 0;
        this.y = 0;
    }

    public MyPoin(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
    
    public int[] getXY(){
        int[] resuLts = new int[2];
        resuLts[0] = this.x;
        resuLts[1] = this.y;
        return resuLts;
    }
    
    public void setXY(int x, int y){
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "(" + this.x + "," + this.y + ")";
    }
    
    public double distance(int x, int y){
        int xD = this.x - x;
        int yD = this.y - y;
        return (xD * xD + yD * yD);
    }
    
    public double distance(MyPoin another){
        int xB = this.x - another.x;
        int yB = this.y - another.y;
        return Math.sqrt(xB * xB + yB * yB);
    }
    
    public double distance(){
        return Math.sqrt(x * x + y * y);
    }
    
}
