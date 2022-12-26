package com.np.java_oop_test.test03;

/**
 * @Description: 构造器练习
 * @Author NingPeng
 * @Email: ningpeng97@163.com
 * @Date: 2022/12/26
 * @ClassName:Test
 * @Version: v1.0
 */
public class Test {
    public static void main(String[] args) {
        Boy boy = new Boy("罗密欧", 21);
        boy.shout();

        Girl girl = new Girl("朱丽叶", 18);
        girl.marry(boy);

        Girl girl1 = new Girl("祝英台", 19);
        int compare = girl.compare(girl1);
        if (compare > 0) {
            System.out.println(girl.getName() + "大");
        } else if (compare < 0) {
            System.out.println(girl1.getName() + "大");
        } else {
            System.out.println("一样大");
        }
    }
}
