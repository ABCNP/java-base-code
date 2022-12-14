package com.np.test;

/**
 * @Author NingPeng
 * @ClassName:Test07
 * @Email: ningpeng97@163.com
 * @Description: $Description
 * @Date: 2022/12/14
 * @Version: v1.0
 */
public class Test07 {
    public static void main(String[] args) {
        int week = 2;
        week += 100;
        week = week % 7;
        System.out.println("100天后星期" + week);
    }
}
/*
    今天是周二，100天以后是周几？
 */