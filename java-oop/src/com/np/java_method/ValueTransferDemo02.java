package com.np.java_method;

/**
 * @Description: 方法的形参的传递机制：基本类型值传递
 * 1.形参：方法定义时，声明的小括号内的参数
 * 实参：方法调用时，实际传递给形参的数据
 * <p>
 * 2.值传递机制：
 * 如果参数是基本数据类型，此时实参赋给形参的是实参真实存储的数据值。
 * 如果参数是引用数据类型，此时实参赋给形参的是实参存储数据的地址值。
 * @Author NingPeng
 * @Email: ningpeng97@163.com
 * @Date: 2022/12/26
 * @ClassName:ValueTransferDemo02
 * @Version: v1.0
 */
public class ValueTransferDemo02 {
    public static void main(String[] args) {

        int m = 10;
        int n = 20;

        System.out.println("m = " + m + ", n = " + n);
        //交换两个变量的值的操作
//		int temp = m ;
//		m = n;
//		n = temp;

        ValueTransferDemo02 test = new ValueTransferDemo02();
        test.swap(m, n);

        System.out.println("m = " + m + ", n = " + n);

    }


    public void swap(int m, int n) {
        int temp = m;
        m = n;
        n = temp;
    }
}
