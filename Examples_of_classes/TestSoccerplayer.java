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
public class TestSoccerplayer {
    public static void main(String[] args) {
        Soccerplayer Soccerplayer = new Soccerplayer(20, "toan",10,20);
        System.out.println("run:" + Soccerplayer.run());
        System.out.println("jump:" + Soccerplayer.jump());
        System.out.println("kicball:" + Soccerplayer.Kicball());
        
    }
}
