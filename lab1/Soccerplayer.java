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
public class Soccerplayer {
    private final int number;
    private final String name;
    private final double  x;
    private final double y;
    
    public Soccerplayer(int number, String name, double x, double y){
       this.number = number;
       this.name  = name;
       this.x = x;
       this.y = y;
    }
    
    public void run(){
        System.out.println("chạy");
    }
    public void jump(){
        System.out.println("nhảy");
    }
     public void Kicball(){
         System.out.println("đánh bóng");
     }

    @Override
    public String toString() {
        return "Soccerplayer{" + "number=" + number + ", name=" + name + ", x=" + x + ", y=" + y + '}';
    }
     
}
