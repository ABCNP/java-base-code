package com.np.identifier;

/**
 * @Author NingPeng
 * @ClassName:SeparatorDemo01
 * @Email: ningpeng97@163.com
 * @Description: 分隔符
 * @Date: 2022/12/8
 * @Version: v1.0
 */
public class SeparatorDemo01 {
    public static void main(String[] args) {
        int totals1 = 1 + 2 + 3 + 4;
        int totals2 = 1 + 2
                + 3 + 4;//此为一条语句

        //以上两条语句相同

        System.out.println(totals1);
        System.out.println(totals2);

        //****************************
        int m = 5;
        if (m < 10) {
            System.out.println("m < 10");
        }

        //******************************
        if (m<10){
                    System.out.println(m<10);
        }

        if (m < 10) { System.out.println("m < 10");
        }
    }
}
/*
    分号:表一条语句结束
    大括号:语句集合,语句块,类体,方法体,作用域
    空白:就是什么都没有,不影响

 */