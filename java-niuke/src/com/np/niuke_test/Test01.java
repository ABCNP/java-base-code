package com.np.niuke_test;

/**
 * @Author NingPeng
 * @ClassName:Test01
 * @Email: ningpeng97@163.com
 * @Description: 三元运算符自动类型提升
 * @Date: 2022/12/16
 * @Version: v1.0
 */
public class Test01 {
    public static void main(String[] args) {
        Object o1 = true ? new Integer(1) : new Double(2.0);
        Object o2;
        if (true) {
            o2 = new Integer(1);
        } else {
            o2 = new Double(2.0);
        }
        System.out.print(o1);
        System.out.print(" ");
        System.out.print(o2);
    }
}
/*
    o1和o2分别输出什么?
 */