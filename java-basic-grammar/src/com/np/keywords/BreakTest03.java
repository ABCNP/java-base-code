package com.np.keywords;

/**
 * @Description: 终结循环
 * @Author NingPeng
 * @Email: ningpeng97@163.com
 * @Date: 2022/12/28
 * @ClassName:BreakTest03
 * @Version: v1.0
 */
public class BreakTest03 {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            if (5 == i)
                break;
            System.out.println(i);
        }
    }
}
