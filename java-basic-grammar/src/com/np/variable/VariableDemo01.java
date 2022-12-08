package com.np.variable;

/**
 * @Author NingPeng
 * @ClassName:VariableDemo01
 * @Email: ningpeng97@163.com
 * @Description: 声明变量
 * @Date: 2022/12/8
 * @Version: v1.0
 */
public class VariableDemo01 {
    int y;

    public static void main(String[] args) {
        int x;
        float f = 4.5f;

        //System.out.println("x = " + x); 编译错误
        //System.out.println("y = " + y); 编译错误

        if (f < 10) {
            int m = 5;
        }
    }
}
