package com.np.process_control.branching_structure;

import java.util.Scanner;

/**
 * @Author NingPeng
 * @ClassName:SwitchCaseDemo02
 * @Email: ningpeng97@163.com
 * @Description: switch语句
 * @Date: 2022/12/14
 * @Version: v1.0
 */
public class SwitchCaseDemo02 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in); // 创建Scanner对象
        System.out.println("请输入一个整数：");
        int score = in.nextInt(); // 读取文本并转换为int类型
        char grade;
        switch (score / 10) {
            case 9:
                grade = '优';
                break;
            case 8:
                grade = '良';
                break;
            case 7:             // 7是贯通的
            case 6:
                grade = '中';
                break;
            default:
                grade = '差';
        }
        System.out.println("Grade = " + grade);
    }
}
