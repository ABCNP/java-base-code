package com.np.java_oop_practice.practice03;

/**
 * @Description:
 * @Author NingPeng
 * @Email: ningpeng97@163.com
 * @Date: 2022/12/27
 * @ClassName:PersonTest
 * @Version: v1.0
 */
public class PersonTest {
    public static void main(String[] args) {
        Person p = new Person();

        System.out.println("名字是: " + p.getName());
        System.out.println("年龄为: " + p.getAge());

        Person p2 = new Person("李四",19);

        System.out.println("名字是: " + p2.getName());
        System.out.println("年龄为: " + p2.getAge());

    }
}
