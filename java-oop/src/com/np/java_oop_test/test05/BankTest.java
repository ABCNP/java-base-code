package com.np.java_oop_test.test05;

/**
 * @Description:
 * @Author NingPeng
 * @Email: ningpeng97@163.com
 * @Date: 2022/12/26
 * @ClassName:BankTest
 * @Version: v1.0
 */
public class BankTest {
    public static void main(String[] args) {
        Bank bank = new Bank();

        bank.addCustomer("Jane", "Smith");

        //连续操作
        bank.getCustomer(0).setAccount(new Account(2000));

        bank.getCustomer(0).getAccount().withdraw(500);

        double balance = bank.getCustomer(0).getAccount().getBalance();
        System.out.println("客户：" + bank.getCustomer(0).getFirstName() + "的账户余额为：" + balance);

        System.out.println("***********************");
        bank.addCustomer("万里", "杨");

        System.out.println("银行客户的个数为：" + bank.getNumOfCustomers());
    }
}
