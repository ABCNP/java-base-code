package com.np.process_control.circular_structure;

import java.util.Scanner;

/**
 * @Author NingPeng
 * @ClassName:DoWhileDemo02
 * @Email: ningpeng97@163.com
 * @Description: do-while结构
 * @Date: 2022/12/14
 * @Version: v1.0
 */
public class DoWhileDemo02 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("请输入一个0~100之间的整数：");
        long num = in.nextLong();
        // 初始化循环变量
        long i = 1;
        do {
            System.out.printf("%d × %d = %d%n", i, i, (i * i));
        } while (++i < num);
    }
}
