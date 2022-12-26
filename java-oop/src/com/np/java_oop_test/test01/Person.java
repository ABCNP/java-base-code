package com.np.java_oop_test.test01;

/**
 * @Description: 1.创建程序, 在其中定义两个类：Person和PersonTest类。定义如下：
 * 用setAge()设置人的合法年龄(0~130)，用getAge()返回人的年龄。
 * <p>
 * 2.练习2：
 * 2.1. 在前面定义的Person类中添加构造器，利用构造器设置所有人的age属性初始值都为18。
 * 2.2. 修改上题中类和构造器，增加name属性,使得每次创建Person对象的同时初始化对象的age属性值和name属性值。
 * @Author NingPeng
 * @Email: ningpeng97@163.com
 * @Date: 2022/12/26
 * @ClassName:Person
 * @Version: v1.0
 */
public class Person {
    private int age;
    private String name;

    public Person() {
        age = 18;
    }

    public Person(String n, int a) {
        name = n;
        age = a;
    }


    public void setAge(int a) {
        if (a < 0 || a > 130) {
//			throw new RuntimeException("传入的数据非法！");
            System.out.println("传入的数据非法！");
            return;
        }

        age = a;

    }

    public int getAge() {
        return age;
    }

    //绝对不要这样写！！
//	public int doAge(int a){
//		age = a;
//		return age;
//	}

    public void setName(String n) {
        name = n;
    }

    public String getName() {
        return name;
    }
}
