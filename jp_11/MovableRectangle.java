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
public class MovableRectangle implements Movable {

    private MovablePoin topLeft;
    private MovablePoin bottomRight;

    public MovableRectangle(int x1, int y1, int x2, int y2, int xSpeed, int ySpeed) {
        topLeft = new MovablePoin(x1, y1, xSpeed, ySpeed);
        bottomRight = new MovablePoin(x2, y2, xSpeed, ySpeed);
    }

    @Override
    public String toString() {
        return "MovableRectangle[" + "topLeft=" + topLeft + ", bottomRight=" + bottomRight + ']';
    }

    @Override
    public void moveUp() {
        topLeft.y1 -= topLeft.ySpeed;
        bottomRight.y2 -= bottomRight.ySpeed;
    }

    @Override
    public void moveDown() {
        topLeft.y1 += topLeft.ySpeed;
        bottomRight.y2 += bottomRight.ySpeed;
    }

    @Override
    public void moveLeft() {
        topLeft.x1 -= topLeft.xSpeed;
        bottomRight.x2 -= bottomRight.xSpeed;
    }

    @Override
    public void moveRight() {
        topLeft.x1 += topLeft.xSpeed;
        bottomRight.x2 += bottomRight.xSpeed;
    }

}
