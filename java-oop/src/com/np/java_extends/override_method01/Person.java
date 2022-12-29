package com.np.java_extends.override_method01;

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

    public Person() {

    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    void eat() {
        System.out.println("吃饭...");
    }

    public void walk(int distance) {
        System.out.println("走路,走的距离是：" + distance + "公里");
        eat();
    }

    public void show(){
        System.out.println("我是一个人...");
    }

    public Object info(){
        return null;
    }

    public double info1(){
        return 1.0;
    }
}
