package com.np.keywords;

/**
 * @Description: 打标签结束循环
 * @Author NingPeng
 * @Email: ningpeng97@163.com
 * @Date: 2022/12/28
 * @ClassName:BreakTest06
 * @Version: v1.0
 */
public class BreakTest06 {
    public static void main(String[] args) {
        outloop:
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.println(i + ":" + j);
                if (5 == j)
                    break outloop;
            }
        }
    }
}
