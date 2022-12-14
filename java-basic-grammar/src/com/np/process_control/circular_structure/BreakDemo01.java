package com.np.process_control.circular_structure;

/**
 * @Author NingPeng
 * @ClassName:BreakContinueDemo02
 * @Email: ningpeng97@163.com
 * @Description: break跳转语句,不带标签
 * @Date: 2022/12/14
 * @Version: v1.0
 */
public class BreakDemo01 {
    public static void main(String[] args) {
        //初始化int数组
        int[] intArray = {7, 8, 9, 10};

        for (int item : intArray) {

            if (item == 9) {
                break;
            }
            // 打印数组元素
            System.out.println(item);
        }
    }
}
/*
    java有四种跳转语句,分别是break,continue,throw,return
    break的作用就是强行退出循环体,结束循环
 */