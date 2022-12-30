package com.np.java_polymorphism.demo02;

import java.util.Random;

/**
 * @Description: 面试题：多态是编译时行为还是运行时行为？
 * 动态绑定,是运行时行为
 * 如果编译时能看出是什么,就不是多态
 * @Author NingPeng
 * @Email: ningpeng97@163.com
 * @Date: 2022/12/31
 * @ClassName:Demo02
 * @Version: v1.0
 */
public class Demo02 {
    public static void main(String[] args) {

        int key = new Random().nextInt(3);
        System.out.println(key);

        Animal animal = getInstance(key);
        animal.eat();

    }

    public static Animal getInstance(int key) {

        switch (key) {
            case 0:
                return new Cat();
            case 1:
                return new Dog();
            default:
                return new Sheep();
        }
    }

}
