package com.np.process_control.circular_structure;

/**
 * @Author NingPeng
 * @ClassName:ForDemo03
 * @Email: ningpeng97@163.com
 * @Description: C语言风格的for循环
 * @Date: 2022/12/14
 * @Version: v1.0
 */
public class ForDemo03 {
    public static void main(String[] args) {
        //初始化int数组
        int[] intArray = {7, 8, 9, 10};
        for (int i = 0; i < intArray.length; i++) {
            // 打印数组元素
            System.out.printf("intArray[%d] = %d%n", i, intArray[i]);
        }
        // 死循环,无限循环
//        for (; ; ) {
//            System.out.println("死循环！！！！");
//        }

        // 初始化部分和迭代部分多个操作
        System.out.println("--------初始化部分和迭代部分多个操作-----------");

        for (int x = 0, y = 10; x < y; x++, y--) {
            System.out.printf("(x,y) = (%d, %d)%n", x, y);
        }
    }
}
/*
    java语言风格的for循环隐藏了循环变量,如要要是用变量还是用C语言风格的for循环
 */