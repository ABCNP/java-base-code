package com.np.java_polymorphism.demo01;

/**
 * @Description:
 * @Author NingPeng
 * @Email: ningpeng97@163.com
 * @Date: 2022/12/31
 * @ClassName:Dog
 * @Version: v1.0
 */
public class Dog extends Animal {
    public void eat(){
        System.out.println("狗吃骨头");
    }

    public void shout(){
        System.out.println("汪！汪！汪！");
    }

    public void watchDoor(){
        System.out.println("看门");
    }
}
