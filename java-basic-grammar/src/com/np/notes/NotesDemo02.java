package com.np.notes;

/**
 * @Version: v1.0
 * @Author NingPeng
 * @Email: ningpeng97@163.com
 * @Date: 2022/12/24
 * @ClassName:NotesDemo02
 * @Description: 不同注释的位置
 * 类上的注释
 */
public class NotesDemo02 {

    //属性上的注释
    int a;

    //类中的注释

    /**
     * 构造器上的注释
     *
     * @param a 注释标签
     */
    public NotesDemo02(int a) {
        this.a = a;
    }

    /**
     * 方法上的注释
     *
     * @param b
     * @param str
     * @return String
     */
    public String Method(int b, String str) {

        //局部变量注释
        int age;
        String name;

        //方法内注释

        return "注释";
    }
}

/**
 * 接口上的注释
 */
interface MethodInterface {
    void Method();
}