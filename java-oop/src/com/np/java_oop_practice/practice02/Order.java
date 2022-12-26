package com.np.java_oop_practice.practice02;

/**
 * @Description:
 * @Author NingPeng
 * @Email: ningpeng97@163.com
 * @Date: 2022/12/26
 * @ClassName:Order
 * @Version: v1.0
 */
public class Order {
    private int orderPrivate;
    int orderDefault;
    public int orderPublic;

    private void methodPrivate() {
        orderPrivate = 1;
        orderDefault = 2;
        orderPublic = 3;
    }

    void methodDefault() {
        orderPrivate = 1;
        orderDefault = 2;
        orderPublic = 3;
    }


    public void methodPublic() {
        orderPrivate = 1;
        orderDefault = 2;
        orderPublic = 3;
    }
}
