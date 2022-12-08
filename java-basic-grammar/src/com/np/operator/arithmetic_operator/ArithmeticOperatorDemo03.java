package com.np.operator.arithmetic_operator;

/**
 * @Author NingPeng
 * @ClassName:ArithmeticOperatorDemo03
 * @Email: ningpeng97@163.com
 * @Description: 二元运算符
 * @Date: 2022/12/8
 * @Version: v1.0
 */
public class ArithmeticOperatorDemo03 {
    public static void main(String[] args) {
        //声明一个字符类型变量
        char charNum = 'B';
        // 声明一个整数类型变量
        System.out.printf("%d%n", charNum + 1); // 67
        System.out.printf("%d%n", charNum - 1); // 65
        System.out.printf("%d%n", charNum * 2);// 132
        System.out.printf("%d%n", charNum / 2);// 33
        System.out.printf("%d%n", charNum + 8);// 74
        System.out.printf("%d%n", charNum % 7);// 3

        System.out.println("---浮点型变量----");
        // 声明一个浮点型变量
        double doubleResult = 10.0;

        System.out.printf("%f%n", doubleResult - 1); // 9.000000
        System.out.printf("%f%n", doubleResult * 2); // 20.000000
        System.out.printf("%f%n", doubleResult / 2); // 5.000000
        System.out.printf("%f%n", doubleResult + 8); // 18.000000
        System.out.printf("%f%n", doubleResult % 7); // 3.000000
    }
}
/*
    +,-,*,/,%
*/