/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Examples_of_classes;

/**
 *
 * @author Huy Toan
 */
public class Soccerplayer {
    private int number;
    private String name;
    private int x, y;
    
    public Soccerplayer(int number, String name, int x, int y){
       this.number = 20;
       this.name  = "toan";
       this.x = x;
       this.y = y;
    }
    
    public int run(){
        return number;
    }
    public String jump(){
        return name;
    }
     public int Kicball(){
        return x;
     }
}
