package com.np.operator.logical_operator;

/**
 * @Author NingPeng
 * @ClassName:LogicalOperatorDemo01
 * @Email: ningpeng97@163.com
 * @Description: 逻辑运算符
 * @Date: 2022/12/8
 * @Version: v1.0
 */
public class LogicalOperatorDemo01 {
    public static void main(String[] args) {
        // 声明两个变量
        int a = 10;
        int b = 9;

        boolean c = (a < b) & a++ == --b;
        System.out.printf("(a < b) & a++ == --b = %b%n", c);
        System.out.printf("a = %d%n", a);
        System.out.printf("b = %d%n", b);
        // 重新初始化变量
        a = 10;
        b = 9;

        c = (a < b) | a++ == --b;
        System.out.printf("(a < b) | a++ == --b = %b%n", c);
        System.out.printf("a = %d%n", a);
        System.out.printf("b = %d%n", b);
    }
}
/*
    !,&,|,&&,||
 */