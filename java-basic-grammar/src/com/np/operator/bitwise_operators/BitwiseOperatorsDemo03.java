package com.np.operator.bitwise_operators;

/**
 * @Description: 将整数转为二进制数的方法
 * @Author NingPeng
 * @Email: ningpeng97@163.com
 * @Date: 2022/12/28
 * @ClassName:BitwiseOperatorsDemo03
 * @Version: v1.0
 */
public class BitwiseOperatorsDemo03 {
    public static void main(String[] args) {
        int i = 5;
        int j = 6;
        String b = Integer.toBinaryString(i);
        System.out.println(i + " 的二进制表达是: " + b);
        String c = Integer.toBinaryString(j);
        System.out.println(j + " 的二进制表达是: " + c);

        System.out.println(i | j);
    }
}
