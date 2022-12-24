package com.np.keywords;

/**
 * @Description: 3的倍数,break掉程序
 * @Author NingPeng
 * @Email: ningpeng97@163.com
 * @Date: 2022/12/24
 * @ClassName:BreakTest02
 * @Version: v1.0
 */
public class BreakTest02 {
    public static void main(String[] args) {
        int num = 0, i = 1;
        while (i <= 100) {
            if (i % 3 == 0) {
                System.out.println(i + " ");
                num++;
            }
            if (num == 5) {
                break;
            }
            i++;
        }
    }
}
