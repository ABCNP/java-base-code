package com.np.java_oop_practice.practice04;

/**
 * @Description:
 * @Author NingPeng
 * @Email: ningpeng97@163.com
 * @Date: 2022/12/27
 * @ClassName:Test
 * @Version: v1.0
 */
public class Test {
    public static void main(String[] args) {
        Person person = new Person();
        person.eat();

        Person p = new Person("Tom");
        System.out.println(p.name);


        Person p2 = new Person("张三", 18);
        System.out.println("名字是" + p2.name + "的人今年" + p2.age);
        p2.eat();
        p2.study();
    }
}
