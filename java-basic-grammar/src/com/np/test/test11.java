package com.np.test;

/**
 * @Description: 以下代码输出结果是?
 * @Author NingPeng
 * @Email: ningpeng97@163.com
 * @Date: 2022/12/28
 * @ClassName:test11
 * @Version: v1.0
 */
public class test11 {
    public static void main(String[] args) {
        int i = 1;

        /*boolean a = !(i++ == 3);
        System.out.println("a = " + a);
        //System.out.println(i);
        boolean b = i++ == 2;
        System.out.println("b = " + b);
        //System.out.println(i);
        boolean c = a ^ b;
        System.out.println("c = " + c);
        //System.out.println(i);
        boolean d = i++ == 3;
        System.out.println("d = " + d);
        //System.out.println(i);
        boolean e = c && d;
        System.out.println("e = " + e);
        System.out.println(i);*/

        boolean a = !(i++ == 3) ^ (i++ == 2);
        System.out.println("a = " + a);
        System.out.println(i);

        boolean b = a && (i++ == 3);
        System.out.println("b = " + b);
        System.out.println(i);

        /*boolean x = !(i++ == 3) ^ (i++ == 2) && (i++ == 3);
        //              true           true          false
        System.out.println(x);//false
        System.out.println(i);//3*/

    }
}
