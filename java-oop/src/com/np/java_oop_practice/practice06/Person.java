package com.np.java_oop_practice.practice06;

/**
 * @Description:
 * @Author NingPeng
 * @Email: ningpeng97@163.com
 * @Date: 2022/12/27
 * @ClassName:Person
 * @Version: v1.0
 */
public class Person {
    private String name;
    private int age;

    public Person() {
        String info = "初始化数据...100行代码";

        System.out.println(info);
    }

    public Person(String name) {
        this();//调用空参构造,无需再写那100行代码
        this.name = name;
    }

    public Person(int age) {
        this();
        this.age = age;
    }

    public Person(String name, int age) {
        this();
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

    public void eat() {
        System.out.println("人吃饭...");
        this.study();
    }

    public void study() {
        System.out.println("人学习...");
    }

}
