package com.np.test;

/**
 * @Author NingPeng
 * @ClassName:Test02
 * @Email: ningpeng97@163.com
 * @Description: 取模个十百
 * @Date: 2022/12/8
 * @Version: v1.0
 */
public class Test02 {
    public static void main(String[] args) {
        int num = 187;

        int bai = num / 100;
        int shi = num % 100 / 10;//int shi = num / 10 % 10;
        int ge = num % 10;

        System.out.println("百位为：" + bai);
        System.out.println("十位为：" + shi);
        System.out.println("个位为：" + ge);
    }
}
/*
练习：随意给出一个三位数的整数，打印显示它的个位数，十位数，百位数的值。
格式如下：
数字xxx的情况如下：
个位数：
十位数：
百位数：

例如：
数字153的情况如下：
个位数：3
十位数：5
百位数：1

*/