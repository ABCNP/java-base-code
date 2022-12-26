package com.np.java_class;

/**
 * @Description: 引用的概念
 * 引用的概念，如果一个变量的类型是 类类型，而非基本类型，那么该变量又叫做引用
 * @Author NingPeng
 * @Email: ningpeng97@163.com
 * @Date: 2022/12/26
 * @ClassName:Hero
 * @Version: v1.0
 */
public class Hero {
    String name;
    float hp;//血量
    float armor;//护甲
    int moveSpeed;//移速

    public static void main(String[] args) {
        //创建一个对象
        new Hero();
        //使用一个引用来指向这个对象
        Hero h = new Hero();
    }
}
