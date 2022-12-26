package com.np.variable;

/**
 * @Description: 作为参数
 * 如果一个变量，是声明在一个方法上的，就叫做参数
 * 参数的作用域即为该方法内的所有代码
 * 其他方法不能访问该参数
 * 类里面也不能访问该参数
 * @Author NingPeng
 * @Email: ningpeng97@163.com
 * @Date: 2022/12/27
 * @ClassName:VariableDemo04
 * @Version: v1.0
 */
public class VariableDemo04 {
    public void method1(int i) { //参数i的作用域即方法method1
        System.out.println(i);
    }

    public void method2() {

        //System.out.println(i); //method2 不能访问参数i
    }

    //int j = i;  //类里面也不能访问参数i
}
