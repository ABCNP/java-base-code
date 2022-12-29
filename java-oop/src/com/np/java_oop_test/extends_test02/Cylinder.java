package com.np.java_oop_test.extends_test02;

/**
 * @Description: 圆柱
 * @Author NingPeng
 * @Email: ningpeng97@163.com
 * @Date: 2022/12/30
 * @ClassName:Cylinder
 * @Version: v1.0
 */
public class Cylinder extends Circle {
    private double length;

    public Cylinder() {
        length = 1.0;
    }

    public Cylinder(double length) {
        this.length = length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getLength() {
        return length;
    }

    /**
     * @Description: 返回圆柱的体积
     * @Author np
     * @Date 2022/12/30
     * @Param []
     * $return double
     **/
    public double findVolume() {
        return super.findArea() * getLength();
    }

    /**
     * @Description: 返回圆柱表面积
     * @Author np
     * @Date 2022/12/30
     * @Param []
     * $return double
     **/
    @Override
    public double findArea() {
        return Math.PI * getRadius() * getRadius() * 2 + Math.PI * getRadius() * 2 * getLength();
    }
}
