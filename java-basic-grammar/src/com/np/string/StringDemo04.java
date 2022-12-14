package com.np.string;

/**
 * @Author NingPeng
 * @ClassName:StringDemo04
 * @Email: ningpeng97@163.com
 * @Description: 不可变字符串
 * @Date: 2022/12/14
 * @Version: v1.0
 */
public class StringDemo04 {
    public static void main(String[] args) {
        // 创建空字符串对象
        String s1 = new String();
        //通过常量创建字符串Hello World对象
        String s2 = "Hello World";
        //通过new创建字符串Hello World对象
        String s3 = new String("Hello World");

        char chars[] = {'a', 'b', 'c', 'd', 'e'};
        // 通过字符数组创建字符串对象
        String s4 = new String(chars);
        // 通过子字符数组创建字符串对象
        String s5 = new String(chars, 1, 3);
        System.out.println("s4 = " + s4);
        System.out.println("s5 = " + s5);
        System.out.println("s5字符串长度 = " + s5.length());
    }
}
/*
    计算机语言一般提供两种字符串,一种是可变字符串,另一种是不可变字符串
    区别在于当字符串进行拼接等操作时,不可变字符串会创建新的字符串对象,而可变字符串不会创建新的对象
    java中的String就是不可变字符串

    String属于java.lang包下的类
    这个包下很多基础类,是不需要自己导包的,因为它是由解释器自动引入,手动引入也没事

    new关键字创建对象先开辟空间,但是对象还没有初始化,对象初始化是通过构造方法完成的
*/