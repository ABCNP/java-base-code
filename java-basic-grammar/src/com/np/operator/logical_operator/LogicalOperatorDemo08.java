package com.np.operator.logical_operator;

/**
 * @Description: 异或
 * 不同，返回真
 * 相同，返回假
 * @Author NingPeng
 * @Email: ningpeng97@163.com
 * @Date: 2022/12/28
 * @ClassName:LogicalOperatorDemo08
 * @Version: v1.0
 */
public class LogicalOperatorDemo08 {
    public static void main(String[] args) {
        boolean a =true;
        boolean b = false;

        System.out.println(a^b);
        System.out.println(a^!b);
    }
}
