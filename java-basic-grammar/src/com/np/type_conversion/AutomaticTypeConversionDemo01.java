package com.np.type_conversion;

/**
 * @Author NingPeng
 * @ClassName:AutomaticTypeConversionDemo01
 * @Email: ningpeng97@163.com
 * @Description: 自动类型转换
 * @Date: 2022/12/8
 * @Version: v1.0
 */
public class AutomaticTypeConversionDemo01 {
    public static void main(String[] args) {
        // 声明整数变量
        byte byteNum = 16;
        short shortNum = 16;
        int intNum = 16;
        long longNum = 16L;

        // byte类型转换为int类型
        intNum = byteNum;
        // 声明char变量
        char charNum = 'H';
        // char类型转换为int类型
        intNum = charNum;
        // 声明浮点变量
        // long类型转换为float类型
        float floatNum = longNum;
        // float类型转换为double类型
        double doubleNum = floatNum;
        //表达式计算后类型是double
        double result = floatNum * intNum + doubleNum / shortNum;
    }
}
