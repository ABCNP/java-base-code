package com.np.process_control.branching_structure;

import java.util.Scanner;

/**
 * @Author NingPeng
 * @ClassName:IfElseIfDemo013
 * @Email: ningpeng97@163.com
 * @Description: if-else-if结构
 * @Date: 2022/12/14
 * @Version: v1.0
 */
public class IfElseIfDemo01 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in); // 创建Scanner对象
        System.out.println("请输入一个整数：");
        int score = in.nextInt(); // 读取文本并转换为int类型
        char grade;
        if (score >= 90) {
            grade = 'A';
        } else if (score >= 80) {
            grade = 'B';
        } else if (score >= 70) {
            grade = 'C';
        } else if (score >= 60) {
            grade = 'D';
        } else {
            grade = 'F';
        }
        System.out.println("Grade = " + grade);
    }
}
