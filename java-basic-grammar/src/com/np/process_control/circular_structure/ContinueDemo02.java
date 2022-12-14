package com.np.process_control.circular_structure;

/**
 * @Author NingPeng
 * @ClassName:ContinueDemo02
 * @Email: ningpeng97@163.com
 * @Description: 带标签continue语句
 * @Date: 2022/12/14
 * @Version: v1.0
 */
public class ContinueDemo02 {
    public static void main(String[] args) {
        label1:
        for (int x = 0; x < 3; x++) {
            label2:
            for (int y = 3; y > 0; y--) {
                if (y == x) {
                    //跳转到label1指向的循环
                    continue label1;
                }
                System.out.printf("(x,y) = (%d,%d)", x, y);
                // 打印一个换行符，实现换行
                System.out.println();
            }
        }
        System.out.println("比赛结束!");
    }
}

