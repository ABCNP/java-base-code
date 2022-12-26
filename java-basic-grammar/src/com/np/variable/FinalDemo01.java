package com.np.variable;

/**
 * @Description: Final关键字
 * final 修饰一个变量，有很多种说法，比如不能改变等等
 * 准确的描述是 当一个变量被final修饰的时候，该变量只有一次赋值的机会
 * final 除了修饰变量，还可以修饰类，修饰方法
 * @Author NingPeng
 * @Email: ningpeng97@163.com
 * @Date: 2022/12/27
 * @ClassName:FinalDemo01
 * @Version: v1.0
 */
public class FinalDemo01 {
    public void method1() {
        final int i = 5;

        //i = 10; //i在第4行已经被赋值过了，所以这里会出现编译错误

    }

    public void method2() {
        final int i;

        i = 10; //i在第4行，只是被声明，但是没有被赋值，所以在这里可以进行第一次赋值

        //i = 11; //i在第6行已经被赋值过了，所以这里会出现编译错误

    }
}
