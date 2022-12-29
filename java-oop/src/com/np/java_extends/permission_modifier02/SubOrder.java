package com.np.java_extends.permission_modifier02;

import com.np.java_extends.permission_modifier01.Order;

/**
 * @Description:
 * @Author NingPeng
 * @Email: ningpeng97@163.com
 * @Date: 2022/12/30
 * @ClassName:SubOrder
 * @Version: v1.0
 */
public class SubOrder extends Order {
    public void method() {
        orderProtected = 1;
        orderPublic = 2;

        methodProtected();
        methodPublic();

        //在不同包的子类中，不能调用Order类中声明为private和缺省权限的属性、方法
//		orderDefault = 3;
//		orderPrivate = 4;
//
//		methodDefault();
//		methodPrivate();
    }
}
