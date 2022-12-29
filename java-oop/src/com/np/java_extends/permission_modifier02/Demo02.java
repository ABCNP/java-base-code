package com.np.java_extends.permission_modifier02;

import com.np.java_extends.permission_modifier01.Order;

/**
 * @Description:
 * @Author NingPeng
 * @Email: ningpeng97@163.com
 * @Date: 2022/12/30
 * @ClassName:Demo02
 * @Version: v1.0
 */
public class Demo02 {
    public static void main(String[] args) {
        Order order = new Order();
        order.orderPublic = 1;
        order.methodPublic();
        //不同包下的普通类（非子类）要使用Order类，不可以调用声明为private、缺省、protected权限的属性、方法
//		order.orderPrivate = 2;
//		order.orderDefault = 3;
//		order.orderProtected = 4;
//
//		order.methodPrivate();
//		order.methodDefault();
//		order.methodProtected();

    }

    public void show(Order order){
        order.orderPublic = 1;
        order.methodPublic();

        //不同包下的普通类（非子类）要使用Order类，不可以调用声明为private、缺省、protected权限的属性、方法
//		order.orderPrivate = 2;
//		order.orderDefault = 3;
//		order.orderProtected = 4;
//
//		order.methodPrivate();
//		order.methodDefault();
//		order.methodProtected();
//
    }
}
