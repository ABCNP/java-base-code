package com.np.operator.logical_operator;

/**
 * @Description: 长路或 和 短路或
 * 两边的运算单元都是布尔值
 * 都为假时，才为假
 * 任意为真，就为真
 * @Author NingPeng
 * @Email: ningpeng97@163.com
 * @Date: 2022/12/28
 * @ClassName:LogicalOperatorDemo06
 * @Version: v1.0
 */
public class LogicalOperatorDemo06 {
    public static void main(String[] args) {
        int i = 2;
        System.out.println(i == 1 | i++ == 2);
        System.out.println(i);

        int j = 2;
        System.out.println(j == 2 || j++ == 2);
        System.out.println(j);
    }
}
