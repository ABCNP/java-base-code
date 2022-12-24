package com.np.identifier;

/**
 * @Author NingPeng
 * @ClassName:Demo01Identifier
 * @Email: ningpeng97@163.com
 * @Description: 标识符
 * @Date: 2022/12/7
 * @Version: v1.0
 */
public class IdentifierDemo01 {
    public static void main(String[] args) {
        int myNumber = 1001;
        System.out.println(myNumber);

        /*
            不建议
            int mynumber = 1002;
            System.out.println(mynumber);
        */

        /*
            不建议
            int 学号 = 1003;
            System.out.println(学号);
        */

        /*
            run:
            1001
            1002
            1003
         */
    }
}
