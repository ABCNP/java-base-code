package com.np.process_control.circular_structure;

/**
 * @Author NingPeng
 * @ClassName:ContinueDemo01
 * @Email: ningpeng97@163.com
 * @Description: 不带标签continue语句
 * @Date: 2022/12/14
 * @Version: v1.0
 */
public class ContinueDemo01 {
    public static void main(String[] args) {
        //初始化int数组
        int[] intArray = {7, 8, 9, 10};

        for (int item : intArray) {

            if (item == 9) {
                continue;
            }
            // 打印数组元素
            System.out.println(item);
        }
    }
}
/*
    continue结束本次循环,跳过循环体中尚未执行的语句,接着进行终止条件的判断,以决定是否继续循环
 */