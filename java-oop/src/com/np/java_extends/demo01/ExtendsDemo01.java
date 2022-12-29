package com.np.java_extends.demo01;

/**
 * @Description: extends关键字
 * @Author NingPeng
 * @Email: ningpeng97@163.com
 * @Date: 2022/12/29
 * @ClassName:ExtendsDemo01
 * @Version: v1.0
 */
public class ExtendsDemo01 {
    public static void main(String[] args) {

        Person person = new Person();
        person.name = "Tom";
        person.age = 1;
        person.eat();
        person.sleep();
        System.out.println(person.name);
        System.out.println(person.age);

        System.out.println("****************");

        Student student = new Student();
        student.eat();
        student.sleep();
        student.study();
        student.name = "Tom";
        student.age = 10;

        System.out.println(student.name);
        System.out.println(student.age);


    }
}
