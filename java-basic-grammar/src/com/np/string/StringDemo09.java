package com.np.string;

/**
 * @Author NingPeng
 * @ClassName:StringDemo09
 * @Email: ningpeng97@163.com
 * @Description: 字符串截取
 * @Date: 2022/12/14
 * @Version: v1.0
 */
public class StringDemo09 {
    public static void main(String[] args) {
        String s = "Hello!";

        String subStr1 = s.substring(1); // 返回字符串ello!
        String subStr2 = s.substring(2, 4); // 返回字符串ll

        System.out.printf("subStr1 = %s%n", subStr1);
        System.out.printf("subStr2 = %s%n", subStr2);
    }
}
