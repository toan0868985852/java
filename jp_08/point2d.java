/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jp_08;

/**
 *
 * @author Huy Toan
 */
public class point2d {

    public float x;
    public float y;

    public point2d() {
        x = 0.0f;
        y = 0.0f;
    }

    public point2d(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public void setXY(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public float[] getXY() {
        float[] resuLts = new float[2];
        resuLts[0] = this.x;
        resuLts[1] = this.y;
        return resuLts;
    }

    @Override
    public String toString() {
        return "(" + this.x + ", " + this.y + ")";
    }

}
