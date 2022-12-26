package com.np.java_oop_test.test02;

/**
 * @Description:
 * @Author NingPeng
 * @Email: ningpeng97@163.com
 * @Date: 2022/12/26
 * @ClassName:TriAngle
 * @Version: v1.0
 */
public class TriAngle {//angle:角    angel:天使
    private double base;//底边长
    private double height;//高

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
