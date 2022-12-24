package com.np.keywords;

/**
 * @Description: 说明：输出101～200内的质数
 * 质数又称素数。一个大于1的自然数，除了1和它自身外，不能整除其他自然数的数叫做质数；
 * @Author NingPeng
 * @Email: ningpeng97@163.com
 * @Date: 2022/12/24
 * @ClassName:ContinueTest02
 * @Version: v1.0
 */
public class ContinueTest02 {
    public static void main(String[] args) {
        //只算奇数就可以,偶数肯定不是质数
        for (int i = 101; i < 200; i += 2) {
            //标记位置
            boolean flag = true;
            //只要进入了flag置为false,表示不是质数,跳出内层循环即可
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    flag = false;
                    break;
                }
            }
            //筛选,如果不是质数,flag是false跳过外层这次循环,进入下次循环
            if (!flag) {
                continue;
            }

            //如果是质数则能走到这,输出
            System.out.println(" " + i);
        }
    }
}
