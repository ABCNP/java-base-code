package com.np.variable;

/**
 * @Description: 局部变量
 * 声明在方法内的变量，叫做局部变量
 * 其作用域在声明开始的位置，到其所处于的块结束位置
 * @Author NingPeng
 * @Email: ningpeng97@163.com
 * @Date: 2022/12/27
 * @ClassName:VariableDemo05
 * @Version: v1.0
 */
public class VariableDemo05 {
    public void method1() {
        int i = 5;  //其作用范围是从声明的第4行，到其所处于的块结束12行位置
        System.out.println(i);
        {            //子块
            System.out.println(i); //可以访问i
            int j = 6;
            System.out.println(j); //可以访问j
        }
        //System.out.println(j); //不能访问j,因为其作用域到第10行就结束了
    }
}
