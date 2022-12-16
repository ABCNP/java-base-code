package com.np.array.array_test;

/**
 * @Version: v1.0
 * @Author NingPeng
 * @Email: ningpeng97@163.com
 * @Date: 2022/12/16
 * @ClassName:Test0301
 * @Description: 简单数组拓展
 */
public class Test0301 {
    public static void main(String[] args) {
        int[] array1, array2;

        array1 = new int[]{2, 3, 5, 7, 11, 13, 17, 19};

        //显示array1的内容
        for (int i = 0; i < array1.length; i++) {
            System.out.print(array1[i] + "\t");
        }

        //数组的复制:
        array2 = new int[array1.length];
        for (int i = 0; i < array2.length; i++) {
            array2[i] = array1[i];
        }

        //修改array2中的偶索引元素，使其等于索引值(如array[0]=0,array[2]=2)
        for (int i = 0; i < array2.length; i++) {
            if (i % 2 == 0) {
                array2[i] = i;
            }
        }
        System.out.println();
        //打印出array1
        for (int i = 0; i < array1.length; i++) {
            System.out.print(array1[i] + "\t");
        }
    }
}
/*
 * 使用简单数组
 * 拓展：修改题目，实现array2对array1数组的复制
 */