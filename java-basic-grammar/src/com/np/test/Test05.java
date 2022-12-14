package com.np.test;

/**
 * @Author NingPeng
 * @ClassName:Test05
 * @Email: ningpeng97@163.com
 * @Description: 以下代码输出结果
 * @Date: 2022/12/14
 * @Version: v1.0
 */
public class Test05 {
    public static void main(String[] args) {
        char x = 'x';
        int i = 10;
        System.out.println(true? x : i);
        System.out.println(true? 'x' : 10);

        int a = 8, b = 3;
        System.out.println(a>>>b);
        System.out.println(a>>>b | 2);
    }
}
