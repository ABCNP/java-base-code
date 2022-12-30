package com.np.java_polymorphism.demo01;

/**
 * @Description:
 * @Author NingPeng
 * @Email: ningpeng97@163.com
 * @Date: 2022/12/31
 * @ClassName:Cat
 * @Version: v1.0
 */
public class Cat extends Animal{

    public void eat(){
        System.out.println("猫吃鱼");
    }

    public void shout(){
        System.out.println("喵！喵！喵！");
    }
}
