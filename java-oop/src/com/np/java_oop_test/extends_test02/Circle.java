package com.np.java_oop_test.extends_test02;

/**
 * @Description: 圆
 * @Author NingPeng
 * @Email: ningpeng97@163.com
 * @Date: 2022/12/30
 * @ClassName:Circle
 * @Version: v1.0
 */
public class Circle {
    private double radius;

    public Circle() {
        radius = 1.0;
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    /**
    * @Description: 求圆形面积
    *
    * @Author np
    * @Date 2022/12/30
    * @Param []
    * $return double
    **/
    public double findArea() {
        return Math.PI * radius * radius;
    }
}
