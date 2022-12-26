package com.np.java_oop_practice.practice06;

/**
 * @Description:
 * @Author NingPeng
 * @Email: ningpeng97@163.com
 * @Date: 2022/12/27
 * @ClassName:Test
 * @Version: v1.0
 */
public class Test {
    public static void main(String[] args) {
        Person person = new Person();
        person.setName("张三");
        person.setAge(18);

        System.out.println("姓名: " + person.getName());
        System.out.println("年龄: " + person.getAge());

        Person person1 = new Person("张三", 18);
        System.out.println("姓名: " + person1.getName());
        System.out.println("年龄: " + person1.getAge());
    }
}
