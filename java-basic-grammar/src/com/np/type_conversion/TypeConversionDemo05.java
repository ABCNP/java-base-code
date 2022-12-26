package com.np.type_conversion;

/**
 * @Description: 低精度向高精度转换
 * @Author NingPeng
 * @Email: ningpeng97@163.com
 * @Date: 2022/12/27
 * @ClassName:TypeConversionDemo05
 * @Version: v1.0
 */
public class TypeConversionDemo05 {
    public static void main(String[] args) {
        long l = 50;
        int i = 50;

        //int比较小，要放进比较大的long,随便怎么样，都放的进去
        l = i;
    }
}
