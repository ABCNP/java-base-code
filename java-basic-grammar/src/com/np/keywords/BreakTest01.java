package com.np.keywords;

/**
 * @Description: break语句用于终止某个语句块的执行。用在循环语句体中，可以强行推出循环
 * @Author NingPeng
 * @Email: ningpeng97@163.com
 * @Date: 2022/12/24
 * @ClassName:BreakTest01
 * @Version: v1.0
 */
public class BreakTest01 {
    public static void main(String[] args) {
        int stop = 5;
        for (int i = 0; i < 10; i++) {
            if (i == 5) {
                break;
            }
            System.out.println("i = " + i);
        }
    }
}
