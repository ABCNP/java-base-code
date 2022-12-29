package com.np.java_oop_test.extends_test03;

/**
 * @Description:
 * @Author NingPeng
 * @Email: ningpeng97@163.com
 * @Date: 2022/12/30
 * @ClassName:CheckAccountTest
 * @Version: v1.0
 */
public class CheckAccountTest {
    public static void main(String[] args) {
        CheckAccount checkAccount = new CheckAccount(1122, 20000, 0.045, 5000);

        checkAccount.withdraw(5000);
        System.out.println("您的账户余额为：" + checkAccount.getBalance());
        System.out.println("您的可透支额度为：" + checkAccount.getOverdraft());
        checkAccount.withdraw(18000);
        System.out.println("您的账户余额为：" + checkAccount.getBalance());
        System.out.println("您的可透支额度为：" + checkAccount.getOverdraft());
        checkAccount.withdraw(3000);
        System.out.println("您的账户余额为：" + checkAccount.getBalance());
        System.out.println("您的可透支额度为：" + checkAccount.getOverdraft());
    }
}
