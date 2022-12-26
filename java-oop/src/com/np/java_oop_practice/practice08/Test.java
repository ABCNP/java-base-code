package com.np.java_oop_practice.practice08;

/**
 * @Description:
 * @Author NingPeng
 * @Email: ningpeng97@163.com
 * @Date: 2022/12/27
 * @ClassName:Test
 * @Version: v1.0
 */
public class Test {
    public static void main(String[] args) {
        Customer customer = new Customer("Jane", "Smith");

        Account account = new Account(1000, 2000, 0.0123);

        customer.setAccount(account);

        customer.getAccount().deposit(100);
        customer.getAccount().withdraw(960);
        customer.getAccount().withdraw(2000);

        System.out.println("Customer[" + customer.getLastName() + "," + customer.getFirstName() +
                "] has a account: id is " + customer.getAccount().getId() + ",annualInterestRate is " +
                customer.getAccount().getAnnualInterestRate() * 100 + "% ,balance is " + customer.getAccount().getBalance());
    }
}
