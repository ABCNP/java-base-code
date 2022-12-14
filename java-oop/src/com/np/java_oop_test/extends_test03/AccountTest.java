package com.np.java_oop_test.extends_test03;

/**
 * @Description:
 * 写一个用户程序测试Account类。在用户程序中，
 * 创建一个账号为1122、余额为20000、年利率4.5%的Account对象。
 * 使用withdraw方法提款30000元，并打印余额。
 * 再使用withdraw方法提款2500元，
 * 使用deposit方法存款3000元，然后打印余额和月利率。
 * @Author NingPeng
 * @Email: ningpeng97@163.com
 * @Date: 2022/12/30
 * @ClassName:AccountTest
 * @Version: v1.0
 */
public class AccountTest {
    public static void main(String[] args) {
        Account account = new Account(1122, 20000, 0.045);

        account.withdraw(30000);
        System.out.println("您的账户余额为：" + account.getBalance());
        account.withdraw(2500);
        System.out.println("您的账户余额为：" + account.getBalance());
        account.deposit(3000);
        System.out.println("您的账户余额为：" + account.getBalance());

        System.out.println("月利率为：" + (account.getMonthlyInterest() * 100) +"%");

    }
}
