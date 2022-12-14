package com.np.array;

/**
 * @Author NingPeng
 * @ClassName:AccessArrayDemo01
 * @Email: ningpeng97@163.com
 * @Description: 访问数组元素
 * @Date: 2022/12/14
 * @Version: v1.0
 */
public class AccessArrayDemo01 {
    public static void main(String[] args) {
        // 动态初始化长度为10的int数组
        int[] intArray = new int[10];
        // 为每一个元素进行初始化
        for (int i = 0; i < intArray.length; i++) {
            intArray[i] = i * i;

        }

        // 为遍历数组
        for (int i = 0; i < intArray.length; i++) {
            System.out.printf("intArray[%d] = %d%n", i, intArray[i]);
        }
        // 发生错误ArrayIndexOutOfBoundsException异常
        // System.out.printf("intArray[%d] = %d%n", intArray[10]);
    }
}
