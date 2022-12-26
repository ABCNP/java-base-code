package com.np.java_oop_practice.practice08;

/**
 * @Description:
 * @Author NingPeng
 * @Email: ningpeng97@163.com
 * @Date: 2022/12/27
 * @ClassName:Account
 * @Version: v1.0
 */
public class Account {
    private int id;
    private double balance;
    private double annualInterestRate;

    public Account() {

    }

    public Account(int id, double balance, double annualInterestRate) {
        this.id = id;
        this.balance = balance;
        this.annualInterestRate = annualInterestRate;
    }


    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setBalace(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    /**
     * 取钱
     *
     * @param amount
     */
    public void withdraw(double amount) {
        if (balance < amount) {
            System.out.println("余额不足,取款失败...");
            return;
        }
        balance -= amount;

        System.out.println("成功取出: " + amount);
    }

    /**
     * 存钱
     *
     * @param amount
     */
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("成功存入: " + amount);
        }
    }
}
