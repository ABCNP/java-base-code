package com.np.java_oop_practice.practice02;

/**
 * @Description:
 * @Author NingPeng
 * @Email: ningpeng97@163.com
 * @Date: 2022/12/26
 * @ClassName:Test
 * @Version: v1.0
 */
public class Test {
    public static void main(String[] args) {
        Order order = new Order();

        order.orderDefault = 1;
        order.orderPublic = 2;

        order.methodDefault();
        order.methodPublic();
    }
}
