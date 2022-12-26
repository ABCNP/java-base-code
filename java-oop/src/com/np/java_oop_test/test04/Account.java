package com.np.java_oop_test.test04;

/**
 * @Description: 账户类
 * @Author NingPeng
 * @Email: ningpeng97@163.com
 * @Date: 2022/12/26
 * @ClassName:Account
 * @Version: v1.0
 */
public class Account {
    private int id;//账号
    private double balance;//余额
    private double annualInterestRate;//年利率

    public Account(int id, double balance, double annualInterestRate) {
        this.id = id;
        this.balance = balance;
        this.annualInterestRate = annualInterestRate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    //在提款方法withdraw中，需要判断用户余额是否能够满足提款数额的要求，如果不能，应给出提示。
    public void withdraw(double amount) {//取钱
        if (balance < amount) {
            System.out.println("余额不足，取款失败");
            return;
        }
        balance -= amount;
        System.out.println("成功取出：" + amount);
    }

    public void deposit(double amount) {//存钱
        if (amount > 0) {
            balance += amount;
            System.out.println("成功存入：" + amount);
        }
    }
}
