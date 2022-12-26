package com.np.java_oop_practice.practice07;

/**
 * @Description:
 * @Author NingPeng
 * @Email: ningpeng97@163.com
 * @Date: 2022/12/27
 * @ClassName:Boy
 * @Version: v1.0
 */
public class Boy {
    private String name;
    private int age;

    public Boy() {

    }

    public Boy(String name) {
        this.name = name;
    }

    public Boy(int age) {
        this.age = age;
    }

    public Boy(String name, int age) {
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

    public void marry(Girl girl) {
        System.out.println("我想娶: "+girl.getName());
    }

    public void shout() {
        if (this.age >= 22) {
            System.out.println("可以合法登记结婚领证...");
        } else {
            System.out.println("可以先谈恋爱...");
        }
    }


}
