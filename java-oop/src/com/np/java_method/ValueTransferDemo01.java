package com.np.java_method;

/**
 * @Description: 方法形参传递机制 对变量赋值的理解
 * 关于变量的赋值：
 * <p>
 * 如果变量是基本数据类型，此时赋值的是变量所保存的数据值。
 * 如果变量是引用数据类型，此时赋值的是变量所保存的数据的地址值。
 * @Author NingPeng
 * @Email: ningpeng97@163.com
 * @Date: 2022/12/26
 * @ClassName:ValueTransferDemo01
 * @Version: v1.0
 */
public class ValueTransferDemo01 {
    public static void main(String[] args) {
        System.out.println("***********基本数据类型：****************");
        int m = 10;
        int n = m;

        System.out.println("m = " + m + ", n = " + n);

        n = 20;

        System.out.println("m = " + m + ", n = " + n);

        System.out.println("***********引用数据类型：****************");

        Order o1 = new Order();
        o1.orderId = 1001;

        Order o2 = o1;//赋值以后，o1和o2的地址值相同，都指向了堆空间中同一个对象实体。

        System.out.println("o1.orderId = " + o1.orderId + ",o2.orderId = " + o2.orderId);

        o2.orderId = 1002;

        System.out.println("o1.orderId = " + o1.orderId + ",o2.orderId = " + o2.orderId);
    }
}

class Order {

    int orderId;

}