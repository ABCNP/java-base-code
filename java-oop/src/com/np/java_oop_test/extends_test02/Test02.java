package com.np.java_oop_test.extends_test02;

/**
 * @Description:
 * @Author NingPeng
 * @Email: ningpeng97@163.com
 * @Date: 2022/12/30
 * @ClassName:Test02
 * @Version: v1.0
 */
public class Test02 {
    public static void main(String[] args) {
        Cylinder cylinder = new Cylinder();
        cylinder.setRadius(2.1);
        cylinder.setLength(3.4);
        double volume = cylinder.findVolume();
        System.out.println("圆柱体的体积为: " + volume);

        double area = cylinder.findArea();
        System.out.println("圆柱体的表面积为: " + area);

        System.out.println("*******************");
        Cylinder cylinder1 = new Cylinder();
        double volume1 = cylinder1.findVolume();
        System.out.println("圆柱体的体积为: " + volume1);
    }
}
