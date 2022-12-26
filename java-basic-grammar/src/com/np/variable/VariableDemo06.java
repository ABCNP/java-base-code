package com.np.variable;

/**
 * @Description: 作用域
 * 属性的作用域在方法中，参数的作用域也在方法中，如果属性和参数命名相同了的话？ 那么到底取哪个值？
 * @Author NingPeng
 * @Email: ningpeng97@163.com
 * @Date: 2022/12/27
 * @ClassName:VariableDemo06
 * @Version: v1.0
 */
public class VariableDemo06 {
    int i = 1; //属性名是i
    public void method1(int i){ //参数也是i
        System.out.println(i);
    }

    public static void main(String[] args) {
        new VariableDemo06().method1(5);
        //结果打印出来是 1还是5?
    }
}
