package com.np.keywords;

/**
 * @Description: 嵌套循环中, 结束当前的内层循环
 * @Author NingPeng
 * @Email: ningpeng97@163.com
 * @Date: 2022/12/28
 * @ClassName:BreakTest04
 * @Version: v1.0
 */
public class BreakTest04 {
    public static void main(String[] args) {
        //打印单数
        for (int i = 0; i < 10; i++) {

            for (int j = 0; j < 10; j++) {
                System.out.println(i + ":" + j);
                if (5 == j)
                    break; //如果是双数，结束当前循环
            }

        }
    }
}
