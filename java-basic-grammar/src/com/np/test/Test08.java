package com.np.test;

/**
 * @Version: v1.0
 * @Author NingPeng
 * @Email: ningpeng97@163.com
 * @Date: 2022/12/21
 * @ClassName:Test08
 * @Description: 两个变量值的交换的三种方式
 */
public class Test08 {
    public static void main(String[] args) {
        int a = 123;
        int b = 321;
        int temp = a;
        a = b;
        b = temp;
        System.out.println("a = " + a + "; b = " + b);

        System.out.println("*************************");

        int m = 123;
        int n = 321;
        m = m + n;
        n = m - n;
        m = m - n;
        System.out.println("m = " + m + "; n = " + n);

        System.out.println("*************************");

        int x = 123;
        int y = 321;
        x = x ^ y;
        y = x ^ y;
        x = x ^ y;
        System.out.println("x = " + x + "; y = " + y);

        System.out.println("*************************");

    }
}
