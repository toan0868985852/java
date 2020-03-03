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
public class myTriangle {

    private MyPoin v1;
    private MyPoin v2;
    private MyPoin v3;

    public myTriangle(int x1, int y1, int x2, int y2, int x3, int y3) {
        v1 = new MyPoin(x1, y1);
        v2 = new MyPoin(x2, y2);
        v3 = new MyPoin(x3, y3);
    }

    public myTriangle(MyPoin v1, MyPoin v2, MyPoin v3) {
        this.v1 = v1;
        this.v2 = v2;
        this.v3 = v3;
    }

    @Override
    public String toString() {
        return "myTriangle{" + "v1=" + v1 + ", v2=" + v2 + ", v3=" + v3 + '}';
    }

    public double getPrimeter() {
        return v1.distance() + v2.distance() + v3.distance();
    }
}
