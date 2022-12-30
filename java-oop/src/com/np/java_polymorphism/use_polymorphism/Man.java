package com.np.java_polymorphism.use_polymorphism;

/**
 * @Description:
 * @Author NingPeng
 * @Email: ningpeng97@163.com
 * @Date: 2022/12/31
 * @ClassName:Man
 * @Version: v1.0
 */
public class Man extends Person {
    boolean isSmoking;

    int id = 1002;

    public void makeMoney() {
        System.out.println("男人负责赚钱养家...");
    }

    @Override
    public void eat() {
        System.out.println("男人多吃肉,长肌肉...");
    }

    @Override
    public void walk() {
        System.out.println("男人走路非常霸气...");
    }


}
