package com.np.java_extends.demo01;

/**
 * @Description: 人类
 * @Author NingPeng
 * @Email: ningpeng97@163.com
 * @Date: 2022/12/29
 * @ClassName:Person
 * @Version: v1.0
 */
public class Person extends Creature{
    String name;
    int age;

    public Person() {

    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void eat() {
        System.out.println("吃饭...");
    }

    public void sleep() {
        System.out.println("睡觉...");
    }
}
