package com.np.array.algorithm;

/**
 * @Version: v1.0
 * @Author NingPeng
 * @Email: ningpeng97@163.com
 * @Date: 2022/12/16
 * @ClassName:BubbleSortTest
 * @Description: 冒牌排序算法
 */
public class BubbleSortTest {
    public static void main(String[] args) {
        int[] arr = new int[]{43, 32, 76, -98, 0, 64, 33, -21, 32, 99};

        //冒泡排序
        for (int i = 0; i < arr.length - 1; i++) {

            for (int j = 0; j < arr.length - 1 - i; j++) {

                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }

            }

        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }
    }
}
