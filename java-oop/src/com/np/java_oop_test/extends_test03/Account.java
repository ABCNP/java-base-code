package com.np.java_oop_test.extends_test03;

/**
 * @Description:
 * @Author NingPeng
 * @Email: ningpeng97@163.com
 * @Date: 2022/12/30
 * @ClassName:Account
 * @Version: v1.0
 */
public class Account {

    private int id;//账号
    private double balance;//余额
    private double annualInterestRate;//年利率

    /**
     * @Description: 全参构造器
     * @Author np
     * @Date 2022/12/30
     * @Param [id:账号, balance:余额, annualInterestRate:年利率]
     * $return
     **/
    public Account(int id, double balance, double annualInterestRate) {
        super();
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

    public double getMonthlyInterest() {
        return annualInterestRate;
    }

    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            return;
        }
        System.out.println("余额不足...");
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }


}
