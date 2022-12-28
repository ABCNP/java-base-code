package com.np.process_control.branching_structure;

/**
 * @Description: if 和ifelse区别
 *ifelse当条件匹配,后续就不会继续判断
 * if条件匹配,后续还会继续判断
 *
 * @Author NingPeng
 * @Email: ningpeng97@163.com
 * @Date: 2022/12/28
 * @ClassName:IfElseDemo06
 * @Version: v1.0
 */
public class IfElseDemo06 {
    public static void main(String[] args) {
        int i = 2;
        if (i == 1)
            System.out.println(1);
        if (i == 2)
            System.out.println(2);
        if (i == 3)
            System.out.println(3);
        if (i == 4)
            System.out.println(4);

        System.out.println("********************");

        if (i == 1)
            System.out.println(1);
        else if (i == 2)
            System.out.println(2);
        else if (i == 3)
            System.out.println(3);
        else if (i == 4)
            System.out.println(4);
    }
}
