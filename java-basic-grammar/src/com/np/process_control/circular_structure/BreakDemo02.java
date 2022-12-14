package com.np.process_control.circular_structure;

/**
 * @Author NingPeng
 * @ClassName:BreakDemo02
 * @Email: ningpeng97@163.com
 * @Description: break跳转语句,带标签
 * @Date: 2022/12/14
 * @Version: v1.0
 */
public class BreakDemo02 {
    public static void main(String[] args) {
        label1:
        for (int x = 0; x < 3; x++) {
            label2:
            for (int y = 3; y > 0; y--) {
                if (y == x) {
                    //跳转到label1指向的循环
                    break label1;
                }
                System.out.printf("(x,y) = (%d,%d)", x, y);
                // 打印一个换行符，实现换行
                System.out.println();
            }
        }
        System.out.println("比赛结束!");
    }
}
/*
    带标签作用就是使程序跳出指定的循环体,标签命名也应符合命名规范

 */