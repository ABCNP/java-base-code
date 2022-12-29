package com.np.java_oop_test.extends_test01;

/**
 * @Description: 定义类Test，在类的main方法中实例化Kids的对象someKid，用该对象访问其父类的成员变量及方法。
 * @Author NingPeng
 * @Email: ningpeng97@163.com
 * @Date: 2022/12/30
 * @ClassName:Test01
 * @Version: v1.0
 */
public class Test01 {
    public static void main(String[] args) {
        Kids someKid = new Kids(12);
        someKid.printAge();

        someKid.setSex(1);
        someKid.setSalary(0);

        someKid.employeed();
        someKid.manOrWoman();
    }
}
