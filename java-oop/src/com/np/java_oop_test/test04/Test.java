package com.np.java_oop_test.test04;

/**
 * @Description: 写一个测试程序。
 * （1）	创建一个Customer ，名字叫 Jane Smith,
 * 他有一个账号为1000，余额为2000元，年利率为 1.23％ 的账户。
 * （2）	对Jane Smith操作。
 * 存入 100 元，再取出960元。再取出2000元。
 * 打印出Jane Smith 的基本信息
 * <p>
 * 成功存入 ：100.0
 * 成功取出：960.0
 * 余额不足，取款失败
 * Customer [Smith, Jane] has a account: id is 1000,
 * annualInterestRate is 1.23％, balance is 1140.0
 * @Author NingPeng
 * @Email: ningpeng97@163.com
 * @Date: 2022/12/26
 * @ClassName:Test
 * @Version: v1.0
 */
public class Test {
    public static void main(String[] args) {
        Customer cust = new Customer("Jane", "Smith");

        Account acct = new Account(1000, 2000, 0.0123);

        cust.setAccount(acct);

        cust.getAccount().deposit(100);
        cust.getAccount().withdraw(960);
        cust.getAccount().withdraw(2000);

        System.out.println("Customer[" + cust.getLastName() + "," + cust.getFirstName() +
                "] has a account: id is " + cust.getAccount().getId() + ",annualInterestRate is " +
                cust.getAccount().getAnnualInterestRate() * 100 + "% ,balance is " + cust.getAccount().getBalance());
    }
}
