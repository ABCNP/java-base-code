package com.np.java_polymorphism.instanceof_demo;

/**
 * @Description:
 * @Author NingPeng
 * @Email: ningpeng97@163.com
 * @Date: 2022/12/31
 * @ClassName:Woman
 * @Version: v1.0
 */
public class Woman extends Person {
    boolean isBeauty;

    public void goShopping(){
        System.out.println("女人喜欢购物");
    }

    public void eat(){
        System.out.println("女人少吃，为了减肥");
    }

    public void walk(){
        System.out.println("女人窈窕的走路");
    }
}
