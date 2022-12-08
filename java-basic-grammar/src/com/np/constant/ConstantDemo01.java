package com.np.constant;

/**
 * @Author NingPeng
 * @ClassName:ConstantDemo01
 * @Email: ningpeng97@163.com
 * @Description: 常量
 * @Date: 2022/12/8
 * @Version: v1.0
 */
public class ConstantDemo01 {

    public static final double PI = 3.14;
    //声明成员常量
    final int y = 10;

    public static void main(String[] args) {
        //声明局部常量
        final double x = 3.3;
        //x = 20; 试图修改的话会编译错误

        System.out.println("PI = " +PI);
    }
}
