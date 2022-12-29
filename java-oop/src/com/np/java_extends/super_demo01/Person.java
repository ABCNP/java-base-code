package com.np.java_extends.super_demo01;

/**
 * @Description:
 * @Author NingPeng
 * @Email: ningpeng97@163.com
 * @Date: 2022/12/30
 * @ClassName:Person
 * @Version: v1.0
 */
public class Person {
    String name;
    int age;
    int id = 1001;

    public Person() {
        System.out.println("调用了Person的无参构造器");
    }

    public Person(String name) {
        this.name = name;
    }

    public Person(String name, int age) {
        this(name);
        this.age = age;
    }

    public Person(String name, int age, int id) {
        this(name);
        this.age = age;
        this.id = id;
    }

    public void eat() {
        System.out.println("人吃饭...");
    }

    public void walk() {
        System.out.println("人走路...");
    }
}
