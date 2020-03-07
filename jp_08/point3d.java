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
public class point3d extends point2d {

    private float z;

    public point3d() {
        super();
        z = 0.0f;
    }

    public point3d(float z, float x, float y) {
        super(x, y);
        this.z = z;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }

    public void setXYZ(float x, float y, float z) {
        super.setX(x);
        super.setY(y);
        this.z = z;
    }

    public float[] getXYZ() {
        float[] point = new float[3];
        point[0] = this.z;
        point[1] = this.getY();
        point[2] = this.getX();
        return point;
    }

    @Override
    public String toString() {
        return "(" + super.getX() + ", " + super.getY() + ", " + z + ")";
    }
    

}
