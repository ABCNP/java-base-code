package com.np.operator.arithmetic_operator;

/**
 * @Description: 自增 自减操作符置前以及置后的区别
 * i++; 先取值，再运算
 * ++i; 先运算，再取值
 * @Author NingPeng
 * @Email: ningpeng97@163.com
 * @Date: 2022/12/28
 * @ClassName:ArithmeticOperatorDemo04
 * @Version: v1.0
 */
public class ArithmeticOperatorDemo04 {
    public static void main(String[] args) {
        int i = 5;
        System.out.println(i++);
        System.out.println(i);

        int j = 5;
        System.out.println(++j);
        System.out.println(j);
    }
}
