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
public class myCircle {
    private MyPoin center;
    private int radius;
    
    public myCircle(){
        radius = 1;
    }

    public myCircle(int x, int y, int radius){
        center = new MyPoin(x, y);
        this.radius = radius;
    }

    public myCircle(MyPoin center, int radius) {
        this.center = center;
        this.radius = radius;
    }

    public MyPoin getCenter() {
        return center;
    }

    public void setCenter(MyPoin center) {
        this.center = center;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }
    
    public int getCenterX(){
        return center.getX();
    }
    
    public void setCenterX(int x){
        this.setCenter(center);
    }
    
    public int getCenterY(){
        return center.getY();
    }
    
    public void setCenterY(int y){
        this.setCenter(center);
    }
    
    public int[] getCenterXY(){
        int[] resuLts = new int[2];
        resuLts[0] = this.center.getX();
        resuLts[1] = this.center.getY();
        return resuLts;
    }
    
    public void setCenterXY(int x, int y){
        this.center.setX(x);
        this.center.setY(y);
    }

    @Override
    public String toString() {
        return "myCircle{" + "center=" + center + ", radius=" + radius + '}';
    }    
    
    public double getCircumference(){
        return radius * 2 * Math.PI;
    }
    
    public double getArea(){
        return radius * radius * Math.PI;
    }
    
    public double distance(myCircle another){
        return center.distance(another.center);
    }
    
}
