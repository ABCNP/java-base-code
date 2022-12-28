package com.np.process_control.branching_structure;

/**
 * @Description: switch 语句相当于 if else的另一种表达方式
 * switch可以使用byte,short,int,char,String,enum
 * <p>
 * 注: 每个表达式结束，都应该有一个break;
 * 注: String在Java1.7之前是不支持的, Java从1.7开始支持switch用String的，编译后是把String转化为hash值，其实还是整数
 * 注: enum是枚举类型，在枚举章节有详细讲解
 * @Author NingPeng
 * @Email: ningpeng97@163.com
 * @Date: 2022/12/28
 * @ClassName:SwitchCaseDemo03
 * @Version: v1.0
 */
public class SwitchCaseDemo03 {
    public static void main(String[] args) {
        //如果使用if else
        int day = 3;
        if (day == 1)
            System.out.println("星期一");

        else if (day == 2)
            System.out.println("星期二");
        else if (day == 3)
            System.out.println("星期三");
        else if (day == 4)
            System.out.println("星期四");
        else if (day == 5)
            System.out.println("星期五");
        else if (day == 6)
            System.out.println("星期六");
        else if (day == 7)
            System.out.println("星期天");
        else
            System.out.println("这个是什么鬼？");

        //如果使用switch
        switch (day) {
            case 1:
                System.out.println("星期一");
                break;
            case 2:
                System.out.println("星期二");
                break;
            case 3:
                System.out.println("星期三");
                break;
            case 4:
                System.out.println("星期四");
                break;
            case 5:
                System.out.println("星期五");
                break;
            case 6:
                System.out.println("星期六");
                break;
            case 7:
                System.out.println("星期天");
                break;
            default:
                System.out.println("这个是什么鬼？");
        }
    }
}
