package com.np.java_oop_test.test02;

/**
 * @Description: 编写两个类，TriAngle和TriAngleTest，其中TriAngle类中声明私有的底边长base和高height，同时声明公共方法访问私有变量。
 * 此外，提供类必要的构造器。另一个类中使用这些公共方法，计算三角形的面积。
 * @Author NingPeng
 * @Email: ningpeng97@163.com
 * @Date: 2022/12/26
 * @ClassName:TriAngleTest
 * @Version: v1.0
 */
public class TriAngleTest {
    public static void main(String[] args) {
        TriAngle t1 = new TriAngle();
        t1.setBase(2.0);
        t1.setHeight(2.4);
//		t1.base = 2.5;//The field TriAngle.base is not visible
//		t1.height = 4.3;
        System.out.println("base : " + t1.getBase() + ",height : " + t1.getHeight());

        TriAngle t2 = new TriAngle(5.1, 5.6);
        System.out.println("base : " + t2.getBase() + ",height : " + t2.getHeight());
    }
}
