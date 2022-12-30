package com.np.java_polymorphism.instanceof_demo;

/**
 * @Description:
 * @Author NingPeng
 * @Email: ningpeng97@163.com
 * @Date: 2022/12/31
 * @ClassName:Man
 * @Version: v1.0
 */
public class Man extends Person{
    boolean isSmoking;

    int id = 1002;

    public void earnMoney(){
        System.out.println("男人负责挣钱养家");
    }

    public void eat(){
        System.out.println("男人多吃肉，长肌肉");
    }

    public void walk(){
        System.out.println("男人霸气的走路");
    }
}
