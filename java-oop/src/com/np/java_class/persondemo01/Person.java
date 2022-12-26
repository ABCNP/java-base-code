package com.np.java_class.persondemo01;

/**
 * @Description: 类的构造器
 * @Author NingPeng
 * @Email: ningpeng97@163.com
 * @Date: 2022/12/26
 * @ClassName:Person
 * @Version: v1.0
 */
public class Person {
    //属性
    String name;
    int age;

    //构造器
    public Person(){
        System.out.println("Person().....");
    }

    public Person(String n){
        name = n;

    }
    //
    public Person(String n,int a){
        name = n;
        age = a;
    }

    //方法
    public void eat(){
        System.out.println("人吃饭");
    }

    public void study(){
        System.out.println("人可以学习");
    }
}
