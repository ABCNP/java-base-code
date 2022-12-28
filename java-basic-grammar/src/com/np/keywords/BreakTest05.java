package com.np.keywords;

/**
 * @Description: 布尔标记结束循环
 * 借助boolean变量结束外部循环
 * 需要在内部循环中修改这个变量值
 * 每次内部循环结束后，都要在外部循环中判断，这个变量的值
 * @Author NingPeng
 * @Email: ningpeng97@163.com
 * @Date: 2022/12/28
 * @ClassName:BreakTest05
 * @Version: v1.0
 */
public class BreakTest05 {
    public static void main(String[] args) {
        boolean breakout = false; //是否终止外部循环的标记
        for (int i = 0; i < 10; i++) {

            for (int j = 0; j < 10; j++) {
                System.out.println(i + ":" + j);
                if (5 == j) {
                    breakout = true; //终止外部循环的标记设置为true
                    break;
                }
            }
            if (breakout) //判断是否终止外部循环
                break;
        }
    }
}
