package com.np.java_extends.demo01;

/**
 * @Description: 学生类
 * @Author NingPeng
 * @Email: ningpeng97@163.com
 * @Date: 2022/12/29
 * @ClassName:Student
 * @Version: v1.0
 */
public class Student extends Person {
    //String name;
    //int age;
    String major;

    public Student() {

    }

    public Student(String major) {
        this.major = major;
    }

/*    public void eat() {
        System.out.println("吃饭...");
    }*/

   /* public void sleep() {
        System.out.println("睡觉...");
    }*/

    public void study() {
        System.out.println("学习...");
    }

}
