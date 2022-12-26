package com.np.java_oop_practice.practice01;

/**
 * @Description:
 * @Author NingPeng
 * @Email: ningpeng97@163.com
 * @Date: 2022/12/26
 * @ClassName:AnimalTest
 * @Version: v1.0
 */
public class AnimalTest {
    public static void main(String[] args) {
        Animal animal = new Animal();
        //animal.eat();
        animal.name = "大黄";
        animal.setAge(2);
        animal.setLegs(4);

        animal.show();
    }
}
