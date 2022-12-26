package com.np.java_oop_practice.practice09;

/**
 * @Description:
 * @Author NingPeng
 * @Email: ningpeng97@163.com
 * @Date: 2022/12/27
 * @ClassName:Bank
 * @Version: v1.0
 */
public class Bank {
    private Customer[] customers;
    private int numberOfCustomers;

    public Bank() {
        customers = new Customer[10];
    }

    /**
     * 添加用户
     *
     * @param firstName
     * @param lastName
     */
    public void addCustomer(String firstName, String lastName) {
        Customer customer = new Customer(firstName, lastName);

        customers[numberOfCustomers++] = customer;
    }

    /**
     * 获取客户个数
     * @return
     */
    public int getNumberOfCustomers() {
        return numberOfCustomers;
    }

    /**
     * 获取指定位置上的客户
     *
     * @param index
     * @return
     */
    public Customer getCustoemr(int index) {
        if (index >= 0 && index < numberOfCustomers) {
            return customers[index];
        }
        return null;
    }

}
