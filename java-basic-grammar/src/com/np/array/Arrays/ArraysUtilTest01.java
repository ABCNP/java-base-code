package com.np.array.Arrays;

/**
 * @Description: 测试自定义数组工具类
 * @Author NingPeng
 * @Email: ningpeng97@163.com
 * @Date: 2022/12/26
 * @ClassName:ArraysUtilTest01
 * @Version: v1.0
 */
public class ArraysUtilTest01 {
    public static void main(String[] args) {
        ArrayUtil util = new ArrayUtil();
        int[] arr = new int[]{32, 34, 32, 5, 3, 54, 654, -98, 0, -53, 5};
        int max = util.getMax(arr);
        System.out.println("最大值为：" + max);

        System.out.println("排序前：");
        util.print(arr);


        util.sort(arr);
        System.out.println("排序后：");
        util.print(arr);

//		System.out.println("查找：");
//		int index = util.getIndex(arr, -5);
//		if(index >= 0){
//			System.out.println("找到了，索引地址为：" + index);
//		}else{
//			System.out.println("未找到");
//		}

//		util.reverse(arr);
    }
}
