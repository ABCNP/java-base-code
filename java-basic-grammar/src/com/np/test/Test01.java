package com.np.test;

/**
 * @Author NingPeng
 * @ClassName:Demo01Format01
 * @Email: ningpeng97@163.com
 * @Description: 变量定义与赋值
 * @Date: 2022/12/8
 * @Version: v1.0
 */
public class Test01 {
    public static void main(String[] args) {
        int number1;
        number1 = 10;
        System.out.println(number1);

        int number2;
        number2 = 20;
        System.out.println(number2);

        int number3;
        number3 = number1 + number2;
        System.out.println("number3 = " + number3);

        int number4 = 50;
        int number5 = number4 - number3;
        System.out.println("number5 = " + number5);
    }
}
