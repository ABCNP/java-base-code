package com.np.operator.operator_test;

/**
 * @Author NingPeng
 * @ClassName:Test01
 * @Email: ningpeng97@163.com
 * @Description: $Description
 * @Date: 2022/12/14
 * @Version: v1.0
 */
public class Test01 {
    public static void main(String[] args) {
        int a = 23;
        int b = 12;
        System.out.println(a + "+" + b + "=" + (a+b));
        int sum = a + b;
        System.out.println(a + "+" + b + "=" + sum);

        int sub = a - b;
        //System.out.println(a + "-" + b + "=" + a-b);//错误，原因是a + "-" + b + "=" + a的结果是字符串，字符串不能进行减法
        System.out.println(a + "-" + b + "=" + (a-b));
        System.out.println(a + "-" + b + "=" + sub);

        int mul = a * b;
        System.out.println(a + "*" + b + "=" + a*b);
        System.out.println(a + "*" + b + "=" + mul);

        //整数相除，只保留整数部分
        int div = a / b;
        System.out.println(a + "/" + b + "=" + a/b);
        System.out.println(a + "/" + b + "=" + div);

        double d = (double)a/b;//先把a的类型进行转换，转换成double类型，然后再和b相除
        System.out.println(a + "/" + b + "=" + d);

        int yu = a % b;
        System.out.println(a + "%" + b + "=" + yu);

        System.out.println("------------------特殊的取模----------------------");
        System.out.println(5%2);//1
        System.out.println(-5%-2);//-1
        System.out.println(-5%2);//-1
        System.out.println(5%-2);//1
        System.out.println("------------------负号----------------------");

        int num1 = 12;
        int num2 = -num1;
        System.out.println("num2=" + num2);

        System.out.println("------------------自增----------------------");
        int i = 0;
        System.out.println("自增之前i=" + i);
        i++;
        System.out.println("自增第一次之后i=" + i);
        ++i;
        System.out.println("自增第二次之后i=" + i);
        int j = ++i;//把i自增1，然后结果赋值给j，或者说，先算++i，然后再赋值
        System.out.println("自增第三次之后i=" + i);
        System.out.println("j="+j);
        int k = i++;//先算赋值，把i的值赋值给k，i原来是3，把3赋值给k，然后i在自增1，i变成4
        System.out.println("自增第四次之后i=" + i);
        System.out.println("k="+k);

        //面试题：陷阱题
        i = i++;//先赋值，把i原来的值重新赋值给i，不变，然后i自增，但是这个自增后的值没有在放回变量i的位置
        System.out.println("自增第五次之后i=" + i);
    }
}
/*
    算术运算符的综合使用
 */