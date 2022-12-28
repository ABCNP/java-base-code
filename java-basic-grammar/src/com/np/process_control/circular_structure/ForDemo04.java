package com.np.process_control.circular_structure;

/**
 * @Description: for和while区别
 * 表达式位置不同
 * @Author NingPeng
 * @Email: ningpeng97@163.com
 * @Date: 2022/12/28
 * @ClassName:ForDemo04
 * @Version: v1.0
 */
public class ForDemo04 {
    public static void main(String[] args) {
        int i = 0;
        while (i < 5) {
            System.out.println("while输出: " + i);
            i++;
        }

        for (int j = 0; j < 5; j++) {
            System.out.println("for输出: " + j);
        }
    }
}
