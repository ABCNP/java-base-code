package com.np.java_oop_practice.practice09;

/**
 * @Description:
 * @Author NingPeng
 * @Email: ningpeng97@163.com
 * @Date: 2022/12/27
 * @ClassName:Account
 * @Version: v1.0
 */
public class Account {
    private double balance;

    public Account(double init_balance) {
        this.balance = init_balance;
    }

    public double getBalance() {
        return balance;
    }

    /**
     * 存钱
     * @param amt
     */
    public void deposit(double amt) {
        if (amt > 0) {
            balance -= amt;
            System.out.println("存钱成功...");
        }
    }

    /**
     * 取钱
     * @param amt
     */
    public void withdraw(double amt){
        if(balance>=amt){
            balance -= amt;
            System.out.println("取钱成功...");
        }else {
            System.out.println("余额不足...");
        }
    }

}
