package com.np.java_oop_practice.practice03;

/**
 * @Description:
 * @Author NingPeng
 * @Email: ningpeng97@163.com
 * @Date: 2022/12/27
 * @ClassName:Person
 * @Version: v1.0
 */
public class Person {
    private int age;
    private String name;

    public Person() {
        name = "张三";
        age = 18;
    }

    public Person(String n, int a) {
        name = n;
        age = a;
    }

    public void setAge(int a) {
        if (a < 0 || a >= 130) {
            System.out.println("数据非法");
            return;
        }

        age = a;
    }

    public int getAge() {
        return age;
    }

    public void setName(String n) {
        name = n;
    }

    public String getName() {
        return name;
    }

}
