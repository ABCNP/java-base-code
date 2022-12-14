package com.np.process_control.branching_structure;

import java.util.Scanner;

/**
 * @Author NingPeng
 * @ClassName:IfElseDemo04
 * @Email: ningpeng97@163.com
 * @Description: if结构
 * @Date: 2022/12/14
 * @Version: v1.0
 */
public class IfDemo01 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in); // 创建Scanner对象
        System.out.println("请输入一个整数：");
        int score = in.nextInt(); // 读取文本并转换为int类型
        if (score >= 85) {
            System.out.println("您真优秀！");
        }
        if (score < 60)
            System.out.println("您需要加倍努力！");

        if ((score >= 60) && (score < 85)) {
            System.out.println("您的成绩还可以，仍需继续努力！");
        }
    }
}
