package com.np.permission_modifier;

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

        order.orderDefault = 1;
        order.orderPublic = 2;
        //出了Order类之后，私有的结构就不可以调用了
//		order.orderPrivate = 3;//The field Order.orderPrivate is not visible


        order.methodDefault();
        order.methodPublic();
        //出了Order类之后，私有的结构就不可以调用了
//		order.methodPrivate();//The method methodPrivate() from the type Order is not visible
    }
}
