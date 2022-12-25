package com.np.operator.logical_operator;

/**
 * @Description: ||和|的区别
 * @Author NingPeng
 * @Email: ningpeng97@163.com
 * @Date: 2022/12/26
 * @ClassName:LogicalOperatorDemo04
 * @Version: v1.0
 */
public class LogicalOperatorDemo04 {
    public static void main(String[] args) {
        int age = 50;
        if (age > 20 || age < 30) {
            System.out.println("ok100");
        }

        if (age > 20 | age < 30) {
            System.out.println("ok200");
        }

        int a = 4;
        int b = 9;
        //if (a < 1 | ++b > 4) {
        if (a > 1 || ++b > 4) {
            System.out.println("ok300");
        }

        System.out.println("a = " + a + ",b = " + b);
    }
}
