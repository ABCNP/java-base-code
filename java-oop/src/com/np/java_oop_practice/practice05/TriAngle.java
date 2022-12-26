package com.np.java_oop_practice.practice05;

/**
 * @Description:
 * @Author NingPeng
 * @Email: ningpeng97@163.com
 * @Date: 2022/12/27
 * @ClassName:TriAngle
 * @Version: v1.0
 */
public class TriAngle {
    private double base;
    private double height;

    public TriAngle() {

    }

    public TriAngle(double b, double h) {
        base = b;
        height = h;
    }

    public void setBase(double b) {
        base = b;
    }


    public double getBase() {
        return base;
    }

    public void setHeight(double h) {
        height = h;
    }

    public double getHeight() {
        return height;
    }


}
