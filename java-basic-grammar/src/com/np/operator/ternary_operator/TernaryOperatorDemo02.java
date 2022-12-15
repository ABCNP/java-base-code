package com.np.operator.ternary_operator;

/**
 * @Author NingPeng
 * @ClassName:TernaryOperatorDemo02
 * @Email: ningpeng97@163.com
 * @Description: 三元运算符，自动类型提升
 * @Date: 2022/12/16
 * @Version: v1.0
 */
public class TernaryOperatorDemo02 {
    public static void main(String[] args) {
        //两个操作数不可以转换，返回对应的对象类型
        Object o = true ? 1 : "a";
        System.out.println(o.toString() + " and " + o.getClass());

        //两个操作数直接是数字，返回范围大的
        o = true ? 1 : 2.0;
        System.out.println(o.toString() + " and " + o.getClass());

        //两个操作数都是明确类型的表达式，如果是不可以转换，返回对应的对象类型，可以转换返回范围大的
        o = true ? new Integer(1) : new String("1");
        System.out.println(o.toString() + " and " + o.getClass());

        o = true ? new Integer(1) : new Double(2);
        System.out.println(o.toString() + " and " + o.getClass());

        //两个操作数一个是数字一个是明确类型的表达式，如果是不可以转换，返回对应的对象类型，可以转换返回范围大的
        o = true ? 1 : new String("1");
        System.out.println(o.toString() + " and " + o.getClass());

        o = true ? 1 : new Double(2);
        System.out.println(o.toString() + " and " + o.getClass());

    }
}
/*
    Object o1 = true ? new Integer(1) : new Double(2.0);
    System.out.print(o1);


 */