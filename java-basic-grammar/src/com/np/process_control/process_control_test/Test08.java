package com.np.process_control.process_control_test;

/**
 * @Author NingPeng
 * @ClassName:Test08
 * @Email: ningpeng97@163.com
 * @Description: 运行以下代码, 哪些会出现在结果中,
 * @Date: 2022/12/14
 * @Version: v1.0
 */
public class Test08 {
    public static void main(String[] args) {
        for (int i = 0; i < 3; i++) {
            for (int j = 3; j >= 0; j--) {
                if (i == j)
                    continue;
                System.out.println("i = " + i + " j = " + j);
            }
        }
    }
}
