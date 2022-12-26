package com.np.java_class.persondemo02;

/**
 * @Description:
 * @Author NingPeng
 * @Email: ningpeng97@163.com
 * @Date: 2022/12/26
 * @ClassName:Person
 * @Version: v1.0
 */
public class Person {
    private String name;
    private int age;


    public Person(){

//		this.eat();
        String info = "Person初始化时，需要考虑如下的1,2,3,4...(共40行代码)";
        System.out.println(info);
    }

    public Person(String name){
        this();
        this.name = name;

    }

    public Person(int age){
        this();
        this.age = age;

    }

    public Person(String name,int age){
        this(age);
        this.name = name;
        //this.age = age;
        //Person初始化时，需要考虑如下的1,2,3,4...(共40行代码)
    }

    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }
    public void setAge(int age){
        this.age = age;
    }
    public int getAge(){
        return this.age;
    }

    public void eat(){
        System.out.println("人吃饭");
        this.study();
    }
    public void study(){
        System.out.println("人学习");
    }
}
