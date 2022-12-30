package com.np.java_polymorphism.demo01;

/**
 * @Description: 多态举例
 * @Author NingPeng
 * @Email: ningpeng97@163.com
 * @Date: 2022/12/31
 * @ClassName:Demo01
 * @Version: v1.0
 */
public class Demo01 {
    public static void main(String[] args) {
        Demo01 demo01 = new Demo01();
        demo01.method(new Dog());
        System.out.println();
        demo01.method(new Cat());
    }

    public void method(Animal animal) {
        animal.eat();
        animal.shout();

        //instance关键字的使用
        if (animal instanceof Dog) {
            Dog dog = (Dog) animal;
            dog.watchDoor();
        }
    }

//	public void func(Dog dog){
//		dog.eat();
//		dog.shout();
//	}

//	public void func(Cat cat){
//		cat.eat();
//		cat.shout();
//	}
}
