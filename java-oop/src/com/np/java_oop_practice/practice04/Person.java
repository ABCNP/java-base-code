package com.np.java_oop_practice.practice04;

/**
 * @Description:
 * @Author NingPeng
 * @Email: ningpeng97@163.com
 * @Date: 2022/12/27
 * @ClassName:Person
 * @Version: v1.0
 */
public class Person {
    String name;
    int age;

    public Person() {
        System.out.println("空参构造器...");
    }

    public Person(String n) {
        name = n;
    }

    public Person(String n, int a) {
        name = n;
        age = a;
    }

    public void eat() {
        System.out.println("人吃饭...");
    }

    public void study() {
        System.out.println("人可以学习...");
    }

}
