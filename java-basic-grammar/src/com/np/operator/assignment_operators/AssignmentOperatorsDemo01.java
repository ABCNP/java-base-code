package com.np.operator.assignment_operators;

/**
 * @Author NingPeng
 * @ClassName:AssignmentOperatorsDemo01
 * @Email: ningpeng97@163.com
 * @Description: 赋值运算符
 * @Date: 2022/12/8
 * @Version: v1.0
 */
public class AssignmentOperatorsDemo01 {
    public static void main(String[] args) {
        int a = 1;
        int b = 2;

        a += b;    // 相当于 a = a + b
        System.out.println(a);
        byte a2 = 0;
        byte b2 = 0b1100;
        a2 &= b2;
        System.out.println(a2);
    }
}
