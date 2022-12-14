package com.np.string;

/**
 * @Author NingPeng
 * @ClassName:StringDemo07
 * @Email: ningpeng97@163.com
 * @Description: 字符串比较之equals方法
 * @Date: 2022/12/14
 * @Version: v1.0
 */
public class StringDemo07 {
    public static void main(String[] args) {
        String s1 = new String("Hello");
        String s2 = "Hello";
        // 比较字符串是否是相同的引用
        System.out.println("s1 == s2 : " + (s1 == s2));
        // 比较字符串内容是否相等
        System.out.println("s1.equals(s2) : " + (s1.equals(s2)));

        String s3 = "HELlo";
        // 忽略大小写比较字符串内容是否相等
        System.out.println("s1.equalsIgnoreCase(s3) : " + (s1.equalsIgnoreCase(s3)));
    }
}
