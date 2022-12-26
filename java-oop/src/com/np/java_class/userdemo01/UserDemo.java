package com.np.java_class.userdemo01;

/**
 * @Description: 总结：属性赋值的先后顺序
 * <p>
 * <p>
 * ① 默认初始化
 * ② 显式初始化
 * ③ 构造器中初始化
 * <p>
 * ④ 通过"对象.方法" 或 "对象.属性"的方式，赋值
 * <p>
 * 以上操作的先后顺序：① - ② - ③ - ④
 * @Author NingPeng
 * @Email: ningpeng97@163.com
 * @Date: 2022/12/26
 * @ClassName:UserDemo
 * @Version: v1.0
 */
public class UserDemo {
    public static void main(String[] args) {
        User u = new User();

        System.out.println(u.age);

        User u1 = new User(2);

        u1.setAge(3);
        u1.setAge(5);

        System.out.println(u1.age);
    }
}
