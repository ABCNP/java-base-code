package com.np.test;

/**
 * @Author NingPeng
 * @ClassName:Test06
 * @Email: ningpeng97@163.com
 * @Description: 练习
 * @Date: 2022/12/14
 * @Version: v1.0
 */
public class Test06 {
    public static void main(String[] args) {
        int hour = 89;
        int day = hour / 24;
        hour = hour % 24;
        System.out.println("为抵抗洪水，战士连续作战" + day + "天" + hour + "小时");
    }
}
/*
    为抵抗洪水，战士连续作战89小时，编程计算共多少天零多少小时？
 */