package com.np.string;

/**
 * @Author NingPeng
 * @ClassName:StringDemo11
 * @Email: ningpeng97@163.com
 * @Description: 可变字符串之字符串插入,删除和替换
 * @Date: 2022/12/14
 * @Version: v1.0
 */
public class StringBuilderDemo02 {
    public static void main(String[] args) {
        // 原始不可变字符串
        String str1 = "Hello!";
        // 从不可变的字符创建可变字符串对象
        StringBuilder mstr = new StringBuilder(str1);

        // 插入字符串
        mstr.insert(6, " Java");
        System.out.println(mstr);

        // 具有追加效果的插入字符串
        mstr.insert(mstr.length(), " Python");
        System.out.println(mstr);

        // 追加字符串
        mstr.append(" and C++");
        System.out.println(mstr);

        // 删除字符串
        mstr.delete(11, 26);
        System.out.println(mstr);

        mstr.replace(6, 11, "C++");
        System.out.println(mstr);
    }
}
