package com.np.test;

/**
 * @Version: v1.0
 * @Author NingPeng
 * @Email: ningpeng97@163.com
 * @Date: 2022/12/21
 * @ClassName:Test
 * @Description: 输出所有水仙花数
 */
public class Test09 {
    public static void main(String[] args) {
        for (int i = 100; i < 1000; i++) {
            int j1 = 0;
            int j2 = 0;
            int j3 = 0;
            j1 = i / 100;// 百位
            j2 = (i - 100 * j1) / 10;// 十位
            j3 = i - 100 * j1 - 10 * j2;// 个位

            if (i == j1 * j1 * j1 + j2 * j2 * j2 + j3 * j3 * j3) {
                System.out.println("此数值为满足条件的水仙花数:" + i);
            }
        }
    }
}
/*
    所谓水仙花数是指一个3位数，其各个位上数字立方和等于其本身
 */