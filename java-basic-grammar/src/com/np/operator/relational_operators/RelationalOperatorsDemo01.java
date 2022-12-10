package com.np.operator.relational_operators;

/**
 * @Author NingPeng
 * @ClassName:RelationalOperatorsDemo01
 * @Email: ningpeng97@163.com
 * @Description: 关系运算符,比较运算符
 * @Date: 2022/12/8
 * @Version: v1.0
 */
public class RelationalOperatorsDemo01 {
    public static void main(String[] args) {
        // 基本数据类型比较
        System.out.println("--------比较基本数据类型------");
        int v1 = 1;
        int v2 = 2;

        //%b表示整数
        System.out.printf("v1 == v2 为 %b%n", v1 == v2);
        System.out.printf("v1 != v2 为 %b%n", v1 != v2);
        System.out.printf("v1 > v2 为 %b%n", v1 > v2);
        System.out.printf("v1 < v2 为 %b%n", v1 < v2);
        System.out.printf("v1 <= v2%b%n", v1 <= v2);


        // 引用数据类型比较
        System.out.println("--------比较引用数据类型------");
        String s1 = new String("Hello");
        String s2 = new String("Hello");
        String s3 = s1;
        System.out.printf("比较s1与s2是否为同一个对象： %b%n", s1 == s2);
        System.out.printf("比较s1与 s2内容是否相同： %b%n", s1.equals(s2));
        System.out.printf("比较s1与s3是否为同一个对象： %b%n", s1 == s3);
    }
}
/*
    ==,!=,>,<,<=,>=
 */