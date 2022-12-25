package com.np.java_method;

/**
 * @Description: 方法的形参的传递机制：引用类型值传递
 * @Author NingPeng
 * @Email: ningpeng97@163.com
 * @Date: 2022/12/26
 * @ClassName:ValueTransferDemo03
 * @Version: v1.0
 */
public class ValueTransferDemo03 {
    public static void main(String[] args) {

        Data data = new Data();

        data.m = 10;
        data.n = 20;

        System.out.println("m = " + data.m + ", n = " + data.n);

        //交换m和n的值
//		int temp = data.m;
//		data.m = data.n;
//		data.n = temp;

        ValueTransferDemo03 test = new ValueTransferDemo03();
        test.swap(data);

        System.out.println("m = " + data.m + ", n = " + data.n);

    }

    public void swap(Data data) {
        int temp = data.m;
        data.m = data.n;
        data.n = temp;
    }

}

class Data {

    int m;
    int n;

}
