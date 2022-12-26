package com.np.permission_modifier2;

import com.np.permission_modifier.Order;

/**
 * @Description: 不同权限修饰符范围
 * @Author NingPeng
 * @Email: ningpeng97@163.com
 * @Date: 2022/12/26
 * @ClassName:OrderTest01
 * @Version: v1.0
 */
public class OrderTest01 {
    public static void main(String[] args) {
        Order order = new Order();

        order.orderPublic = 2;
        // 出了Order类所属的包之后，私有的结构、缺省声明的结构就不可以调用了
//		order.orderDefault = 1;
        // order.orderPrivate = 3;//The field Order.orderPrivate is not visible

        order.methodPublic();
        // 出了Order类所属的包之后，私有的结构、缺省声明的结构就不可以调用了
//		order.methodDefault();
        // order.methodPrivate();//The method methodPrivate() from the type Order is not visible
    }
}
