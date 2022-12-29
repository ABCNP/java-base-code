package com.np.java_extends.override_method01;

/**
 * @Description:
 * @Author NingPeng
 * @Email: ningpeng97@163.com
 * @Date: 2022/12/30
 * @ClassName:Student
 * @Version: v1.0
 */
public class Student extends Person {
    String major;

    public Student() {

    }

    public Student(String major) {
        this.major = major;
    }

    @Override
    public void eat() {
        System.out.println("学生应该多吃有营养的食物...");
    }

    public void show() {
        System.out.println("我是一个学生...");
    }

    public String info() {
        return null;
    }

    public void walk(int distance) {
        System.out.println("重写的方法...");
    }


    public void study() {
        System.out.println("学习。专业是：" + major);
    }
}
