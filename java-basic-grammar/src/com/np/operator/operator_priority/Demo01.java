package com.np.operator.operator_priority;

/**
 * @Author NingPeng
 * @ClassName:Demo01
 * @Email: ningpeng97@163.com
 * @Description: 运算符优先级
 * @Date: 2022/12/14
 * @Version: v1.0
 */
public class Demo01 {
    public static void main(String[] args) {
        int x=0,y=1;
        if(++x==y-- & x++==1||--y==0)
            System.out.println("x="+x+",y="+y);   //x = 2,y = 0;
        else
            System.out.println("y="+y+",x="+x);
    }
}
