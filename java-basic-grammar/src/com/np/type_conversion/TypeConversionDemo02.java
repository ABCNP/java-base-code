package com.np.type_conversion;

/**
 * @Author NingPeng
 * @ClassName:TypeConversionDemo02
 * @Email: ningpeng97@163.com
 * @Description: 类型转换 -- 向下强制转换
 * @Date: 2022/12/8
 * @Version: v1.0
 */
public class TypeConversionDemo02 {
    public static void main(String[] args) {
        double d1 = 12.9;
        //精度损失举例1
        int i1 = (int)d1;//截断操作
        System.out.println(i1);

        //没有精度损失
        long l1 = 123;
        short s2 = (short)l1;

        //精度损失举例2
        int i2 = 128;
        byte b = (byte)i2;
        System.out.println(b);//-128
    }
}
/*
强制类型转换：自动类型提升运算的逆运算。
1.需要使用强转符：()
2.注意点：强制类型转换，可能导致精度损失。
*/