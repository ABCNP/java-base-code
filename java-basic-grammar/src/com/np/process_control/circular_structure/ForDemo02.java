package com.np.process_control.circular_structure;

/**
 * @Author NingPeng
 * @ClassName:ForDemo02
 * @Email: ningpeng97@163.com
 * @Description: java语言风格的for循环
 * @Date: 2022/12/14
 * @Version: v1.0
 */
public class ForDemo02 {
    public static void main(String[] args) {
        //----------while循环实现遍历数组 ------
        System.out.println("----------while循环实现遍历数组 ------");

        //初始化int数组
        int[] intArray = {7, 8, 9, 10};

        int i = 0; // 初始化循环变量
        while (i < intArray.length) {
            // 打印数组元素
            System.out.printf("intArray[%d] = %d%n", i, intArray[i]);
            // 累加循环变量
            i++;
        }

        //----------Java语言风格for循环实现遍历数组 ------
        System.out.println("----------Java语言风格for循环实现遍历数组 ------");

        for (int item : intArray) {
            // 打印数组元素
            System.out.println(item);
        }
    }
}
/*
    java语言风格的for,jdk1.5开始,专门用于遍历数组
    隐藏了循环变量
 */