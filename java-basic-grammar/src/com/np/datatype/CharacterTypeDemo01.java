package com.np.datatype;

/**
 * @Author NingPeng
 * @ClassName:CharacterTypeDemo01
 * @Email: ningpeng97@163.com
 * @Description: 字符类型
 * @Date: 2022/12/11
 * @Version: v1.0
 */
public class CharacterTypeDemo01 {
    public static void main(String[] args) {
        char c1 = 'A';
        char c2 = '\u0041';
        char c3 = '中';

        System.out.println("c1 = " + c1);
        System.out.println("c2 = " + c2);
        System.out.println("c3 = " + c3);

        System.out.println("------转义符--------");
        String s = "Hello\tWorld.";
        System.out.println("水平制表符tab1: " + s);
        s = "Hello\u0009World.";
        System.out.println("水平制表符tab2: " + s);
        s = "Hello\nWorld.";
        System.out.println("换行: " + s);
        s = "Hello\rWorld";
    }
}
