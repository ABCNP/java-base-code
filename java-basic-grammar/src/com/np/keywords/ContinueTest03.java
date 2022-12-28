package com.np.keywords;

/**
 * @Description: 跳过这次, 继续下一次循环
 * @Author NingPeng
 * @Email: ningpeng97@163.com
 * @Date: 2022/12/28
 * @ClassName:ContinueTest03
 * @Version: v1.0
 */
public class ContinueTest03 {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            if (0 == i % 2)
                continue;
            System.out.println(i);//打印单数
        }
    }
}
