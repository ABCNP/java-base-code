package com.np.type_conversion;

/**
 * @Description: short和char的转换
 * @Author NingPeng
 * @Email: ningpeng97@163.com
 * @Date: 2022/12/27
 * @ClassName:TypeConversionDemo04
 * @Version: v1.0
 */
public class TypeConversionDemo04 {
    public static void main(String[] args) {
        char c = 'A';
        short s = 80;

        //虽然short和char都是16位的，长度是一样的
        //但是彼此之间，依然需要进行强制转换
        c = (char) s;
        //直接进行转换，会出现编译错误
        //s = c;

    }
}
