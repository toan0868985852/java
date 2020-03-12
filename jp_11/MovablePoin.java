/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jp_11;

/**
 *
 * @author Huy Toan
 */
public class MovablePoin implements Movable {

    int x;
    int y;
    int xSpeed;
    int ySpeed;
    int x1;
    int x2;
    int y1;
    int y2;

    public MovablePoin(int x, int y, int xSpeed, int ySpeed) {
        this.x = x;
        this.y = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    @Override
    public String toString() {
        return "MovablePoin[" + "x=" + x + ", y=" + y + ", xSpeed=" + xSpeed + ", ySpeed=" + ySpeed + ']';
    }

    @Override
    public void moveUp(){
        y -= ySpeed;
    }
    
     @Override
    public void moveDown(){
        y += ySpeed;
    }
    
     @Override
    public void moveLeft(){
        x -= xSpeed;
    }
    
     @Override
    public void moveRight(){
        x += xSpeed;
    }
}
