package com.np.helloprogram;

/**
 * @Author NingPeng
 * @ClassName:HelloWorld3
 * @Email: ningpeng97@163.com
 * @Description: 对HelloWorld的解释
 * @Date: 2022/12/8
 * @Version: v1.0
 */
public class HelloWorld3 {
    //类名与文件名相同
    public static void main(String[] args) {
        //String[] args : 参数是应用程序运行时通过控制台向应用程序传递的字符串
        System.out.println("Hello World.");//输出到控制台
        //System.out : 标准输出流对象,默认输出到控制台


        System.out.println("Hello World.");
        System.out.print("Hello World.");
        //占位符%s表示参数是字符串
        System.out.printf("Hi,%s", "tony");

        int i = 123;
        //占位符%d表示参数是整数
        System.out.printf("%d", i);

        double d = 123.456;
        //占位符%f表示格式化浮点数
        System.out.printf("%f%n",d);//输出换行符
        System.out.printf("%5.2f",d);//5表示输出总长度,2表示保留的小数位

    }
}
/*
    PrintStream printf(String format, Object ... args):使用指定输出格式,打印任何长度的数据,但不换行
 */