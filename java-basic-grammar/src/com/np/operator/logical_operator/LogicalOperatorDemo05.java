package com.np.operator.logical_operator;

/**
 * @Description: 长路与 和 短路与
 * @Author NingPeng
 * @Email: ningpeng97@163.com
 * @Date: 2022/12/28
 * @ClassName:LogicalOperatorDemo05
 * @Version: v1.0
 */
public class LogicalOperatorDemo05 {
    public static void main(String[] args) {
        int i = 2;
        System.out.println(i == 1 & i++ == 2);
        System.out.println(i);

        int j = 2;
        System.out.println(j == 1 && j++ == 2);
        System.out.println(j);//短路效果,后面不执行
    }
}
