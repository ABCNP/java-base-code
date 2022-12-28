package com.np.process_control.circular_structure;

/**
 * @Description: 无论是否成立，先执行一次，再进行判断
 * @Author NingPeng
 * @Email: ningpeng97@163.com
 * @Date: 2022/12/28
 * @ClassName:DoWhileDemo03
 * @Version: v1.0
 */
public class DoWhileDemo03 {
    public static void main(String[] args) {
        int i = 0;
        do {
            System.out.println(i);
            i++;
        } while (i<0);
    }
}
