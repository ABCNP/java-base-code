package com.np.array.array_test;

/**
 * @Version: v1.0
 * @Author NingPeng
 * @Email: ningpeng97@163.com
 * @Date: 2022/12/16
 * @ClassName:Test01
 * @Description: 利用数组算出联系方式
 */
public class Test01 {
    public static void main(String[] args) {
        int[] arr = new int[]{5,0,9,8,1,4,7};
        int[] index = new int[]{4, 3, 3, 6, 2, 1, 5,0, 2, 4, 4};
        String tel = "";
        for (int i = 0; i < index.length; i++) {
            tel += arr[index[i]];
        }
        System.out.println("联系方式：" + tel);
    }
}
//18879045911
//0145789
//5098147
/*
    升景坊单间短期出租4个月，550元/月（水电煤公摊，网费35元/月），空调、卫生间、厨房齐全。
屋内均是IT行业人士，喜欢安静。所以要求来租者最好是同行或者刚毕业的年轻人，爱干净、安静。
        public class ArrayTest {
            public static void main(String[] args) {
                int[] arr = new int[]{8,2,1,0,3};
                int[] index = new int[]{2,0,3,2,4,0,1,3,2,3,3};
                String tel = "";
                for(int i = 0;i < index.length;i++){
                    tel += arr[index[i]];
                }
                System.out.println("联系方式：" + tel);
            }
        }
 */