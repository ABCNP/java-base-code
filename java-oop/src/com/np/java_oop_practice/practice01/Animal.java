package com.np.java_oop_practice.practice01;

/**
 * @Description:
 * @Author NingPeng
 * @Email: ningpeng97@163.com
 * @Date: 2022/12/26
 * @ClassName:Animal
 * @Version: v1.0
 */
public class Animal {
    String name;
    private int age;
    private int legs;


    public void setLegs(int l) {
        if (l >= 0 && l % 2 == 0) {
            legs = l;
        } else {
            legs = 0;
        }
    }

    public int getLegs() {
        return legs;
    }

    public void setAge(int a) {
        age = a;
    }

    public int getAge() {
        return age;
    }

    public void eat() {
        System.out.println("动物进食");
    }

    public void show() {
        System.out.println("name = " + name + ",age = " + age + ",legs = " + legs);
        System.out.println("我是一只有" + legs + "条腿,名字叫" + name + "的,刚刚" + age + "岁的老狗.");
    }
}
