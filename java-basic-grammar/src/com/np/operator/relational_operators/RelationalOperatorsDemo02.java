package com.np.operator.relational_operators;

/**
 * @Author NingPeng
 * @ClassName:RelationalOperatorsDemo02
 * @Email: ningpeng97@163.com
 * @Description: 关系运算符/比较运算符
 * @Date: 2022/12/9
 * @Version: v1.0
 */
public class RelationalOperatorsDemo02 {
    public static void main(String[] args) {
        int i = 10;
        int j = 20;

        System.out.println(i == j);//false
        System.out.println(i = j);//20

        boolean b1 = true;
        boolean b2 = false;
        System.out.println(b2 == b1);//false
        System.out.println(b2 = b1);//true
    }
}
/*
运算符之三：比较运算符
==  !=  >  <  >= <=  instanceof

结论：
1.比较运算符的结果是boolean类型
2.区分 ==  和  =
*/