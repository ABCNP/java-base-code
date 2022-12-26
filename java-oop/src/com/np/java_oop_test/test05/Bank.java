package com.np.java_oop_test.test05;

/**
 * @Description:
 * @Author NingPeng
 * @Email: ningpeng97@163.com
 * @Date: 2022/12/26
 * @ClassName:Bank
 * @Version: v1.0
 */
public class Bank {
    private Customer[] customers;// 存放多个客户的数组
    private int numberOfCustomers;// 记录客户的个数

    public Bank() {
        customers = new Customer[10];
    }

    // 添加客户
    public void addCustomer(String f, String l) {
        Customer cust = new Customer(f, l);
        // customers[numberOfCustomers] = cust;
        // numberOfCustomers++;
        // 或
        customers[numberOfCustomers++] = cust;
    }

    // 获取客户的个数
    public int getNumOfCustomers() {
        return numberOfCustomers;
    }

    // 获取指定位置上的客户
    public Customer getCustomer(int index) {
        // return customers[index];//可能报异常
        if (index >= 0 && index < numberOfCustomers) {
            return customers[index];
        }

        return null;
    }
}
