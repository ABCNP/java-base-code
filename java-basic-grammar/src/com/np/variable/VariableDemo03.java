package com.np.variable;

/**
 * @Description: 字段，属性，Field
 * 当一个变量被声明在类下面
 * 变量就叫做字段 或者属性、成员变量、Field
 * 比如变量i,就是一个属性。
 * 那么从第2行这个变量声明的位置开始，整个类都可以访问得到
 * 所以其作用域就是从其声明的位置开始的整个类
 * @Author NingPeng
 * @Email: ningpeng97@163.com
 * @Date: 2022/12/27
 * @ClassName:VariableDemo03
 * @Version: v1.0
 */
public class VariableDemo03 {
    int i = 1;
    int j = i;  //其他的属性可以访问i

    public void method1() {
        System.out.println(i); //方法1里可以访问i
    }

    public void method2() {
        System.out.println(i); //方法2里可以访问i
    }
}
