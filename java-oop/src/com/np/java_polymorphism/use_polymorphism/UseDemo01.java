package com.np.java_polymorphism.use_polymorphism;

/**
 * @Description: 面向对象特征之三：多态性
 * <p>
 * 1.理解多态性：可以理解为一个事物的多种形态。
 * 2.何为多态性：
 * 对象的多态性：父类的引用指向子类的对象（或子类的对象赋给父类的引用）
 * <p>
 * 3. 多态的使用：虚拟方法调用
 * 有了对象的多态性以后，我们在编译期，只能调用父类中声明的方法，但在运行期，我们实际执行的是子类重写父类的方法。
 * 总结：编译，看左边；运行，看右边。
 * <p>
 * 4.多态性的使用前提：  ① 类的继承关系  ② 方法的重写
 * <p>
 * 5.对象的多态性，只适用于方法，不适用于属性（编译和运行都看左边）
 * @Author NingPeng
 * @Email: ningpeng97@163.com
 * @Date: 2022/12/31
 * @ClassName:Demo01
 * @Version: v1.0
 */
public class UseDemo01 {
    public static void main(String[] args) {
        Person person = new Person();
        person.eat();

        Man man = new Man();
        man.age = 25;
        man.eat();
        man.makeMoney();

        System.out.println("********************");

        //对象的多态性：父类的引用指向子类的对象
        Person person1 = new Man();
        //Person person1 = new Woman();
        //当调用子父类同名同参数的方法时，实际执行的是子类重写父类的方法 ---虚拟方法调用
        person1.eat();
        person1.walk();

        ((Man) person1).makeMoney();

        System.out.println(person1.id);//1001
    }
}
