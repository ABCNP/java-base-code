package com.np.keywords;

/**
 * @Description: continue语句用在循环语句体中，用于终止某次循环过程，
 * 跳过循环体中continue语句下面未执行的循环，开始下一次循环
 *
 * @Author NingPeng
 * @Email: ningpeng97@163.com
 * @Date: 2022/12/24
 * @ClassName:ContinueTest01
 * @Version: v1.0
 */
public class ContinueTest01 {
    public static void main(String[] args) {
        int skip = 5;
        for (int i = 0; i < 10; i++) {
            if (i == skip) {
                continue;
            }
            System.out.println("i = " + i);
        }
    }
}
