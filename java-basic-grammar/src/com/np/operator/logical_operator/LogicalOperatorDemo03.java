package com.np.operator.logical_operator;

/**
 * @Description: &&和&区别
 * @Author NingPeng
 * @Email: ningpeng97@163.com
 * @Date: 2022/12/26
 * @ClassName:LogicalOperatorDemo03
 * @Version: v1.0
 */
public class LogicalOperatorDemo03 {
    public static void main(String[] args) {
        int age = 50;
        if (age > 20 && age < 90) {
            System.out.println("ok100");
        }

        if (age > 20 & age < 90) {
            System.out.println("ok200");
        }

        //对于&&短路与而言，如果第一个条件为false ,后面的条件不再判断
        int a = 4;
        int b = 9;
        //if (a < 1 & ++b < 50) {
        if (a < 1 && ++b < 50) {
            System.out.println("ok300");
        }

        System.out.println("a = " + a + ",b = " + b);

    }
}
