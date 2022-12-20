package com.np.test;

/**
 * @Version: v1.0
 * @Author NingPeng
 * @Email: ningpeng97@163.com
 * @Date: 2022/12/21
 * @ClassName:Test10
 * @Description: 吸血鬼数字
 */
public class Test10 {
    public static void main(String[] args) {
        for (int num = 1001; num < 10000; num++) {
            math(num);
        }
    }

    private static void math(int num) {
        int[] temp1 = new int[2];
        int[] temp2 = new int[2];

        int a = num / 1000;
        int b = num / 100 % 10;
        int c = num / 10 % 10;
        int d = num % 10;
        int[] data = {a, b, c, d};
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data.length; j++) {
                if (i == j) {
                    continue;
                }
                temp1[0] = data[i];
                temp1[1] = data[j];
                for (int m = 0; m < data.length; m++) {
                    if (m != i && m != j) {
                        temp2[0] = data[m];
                        for (int n = 0; n < data.length; n++) {
                            if (n != i && n != j && n != m) {
                                temp2[1] = data[n];
                                multi(data, temp1, temp2);
                            }
                        }
                    }
                }
            }
        }
    }

    public static int toInt(int[] temp) {
        int m = 0;
        int[] temp1 = new int[temp.length];
        for (int i = 0; i < temp.length; i++) {
            temp1[i] = temp[i] * (int) Math.pow(10, temp.length - 1 - i);
        }
        for (int i = 0; i < temp1.length; i++) {
            m += temp1[i];
        }
        return m;
    }

    public static void multi(int[] temp, int[] temp1, int[] temp2) {
        int i = toInt(temp1);
        int j = toInt(temp2);
        int k = toInt(temp);
        if (k == i * j) {
            System.out.println(k + "=" + i + "*" + j);
        }
    }
}

/*
    例如:1260=21*60
         1827=21*87
 */