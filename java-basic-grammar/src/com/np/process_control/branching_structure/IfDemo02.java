package com.np.process_control.branching_structure;

/**
 * @Description: 单个if判断
 * 单个表达式可省略大括号(不建议省略)
 * 可以有多个表达式
 * @Author NingPeng
 * @Email: ningpeng97@163.com
 * @Date: 2022/12/28
 * @ClassName:IfDemo02
 * @Version: v1.0
 */
public class IfDemo02 {
    public static void main(String[] args) {
        boolean b = true;
        if (b)
            System.out.println("yes");

        if (b){
            System.out.println("yes1");
            System.out.println("yes2");
            System.out.println("yes3");
        }
    }
}
