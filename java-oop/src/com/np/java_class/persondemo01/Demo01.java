package com.np.java_class.persondemo01;

/**
 * @Description:
 * 类的结构之三：构造器（或构造方法、constructor）的使用
 * construct：建设、建造。  construction:CCB    constructor:建设者
 *
 * 一、构造器的作用：
 * 1.创建对象
 * 2.初始化对象的信息
 *
 * 二、说明：
 * 1.如果没有显式的定义类的构造器的话，则系统默认提供一个空参的构造器
 * 2.定义构造器的格式：权限修饰符  类名(形参列表){}
 * 3.一个类中定义的多个构造器，彼此构成重载
 * 4.一旦我们显式的定义了类的构造器之后，系统就不再提供默认的空参构造器
 * 5.一个类中，至少会有一个构造器。
 * @Author NingPeng
 * @Email: ningpeng97@163.com
 * @Date: 2022/12/26
 * @ClassName:Demo01
 * @Version: v1.0
 */
public class Demo01 {
    public static void main(String[] args) {
        //创建类的对象:new + 构造器
        Person p = new Person();

        p.eat();

        Person p1 = new Person("Tom");

        System.out.println(p1.name);
    }
}
