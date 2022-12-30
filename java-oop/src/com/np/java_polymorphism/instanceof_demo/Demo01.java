package com.np.java_polymorphism.instanceof_demo;

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
public class Demo01 {
    public static void main(String[] args) {
        Person person = new Person();
        person.eat();

        Man man = new Man();
        man.eat();
        man.age = 25;
        man.earnMoney();

        System.out.println();


        Person person1 = new Man();
        //Person person1 = new Woman();
        person1.eat();
        person1.walk();

        System.out.println(person1.id);//1001

        //不能调用子类所特有的方法、属性：编译时，p2是Person类型。
        person1.name = "Tom";
        //p2.earnMoney();
        //p2.isSmoking = true;

        //有了对象的多态性以后，内存中实际上是加载了子类特有的属性和方法的，但是由于变量声明为父类类型，导致
        //编译时，只能调用父类中声明的属性和方法。子类特有的属性和方法不能调用。

        //如何才能调用子类特有的属性和方法？
        //向下转型：使用强制类型转换符。

        Man man1 = (Man) person1;
        man1.earnMoney();
        man1.isSmoking = true;

        //使用强转时，可能出现ClassCastException的异常。
        //Woman w1 = (Woman)person1;
        //w1.goShopping();

        /*
         * instanceof关键字的使用
         *
         * a instanceof A:判断对象a是否是类A的实例。如果是，返回true；如果不是，返回false。
         *
         *
         *  使用情境：为了避免在向下转型时出现ClassCastException的异常，我们在向下转型之前，先
         *  进行instanceof的判断，一旦返回true，就进行向下转型。如果返回false，不进行向下转型。
         *
         *  如果 a instanceof A返回true,则 a instanceof B也返回true.
         *  其中，类B是类A的父类。
         */

        if (person1 instanceof Woman) {
            Woman woman = (Woman) person1;
            woman.goShopping();
            System.out.println("******Woman******");
        }

        if (person1 instanceof Man) {
            Man man2 = (Man) person1;
            man2.earnMoney();
            System.out.println("******Man******");
        }

        if (person1 instanceof Person) {
            System.out.println("******Person******");
        }

        if (person1 instanceof Object) {
            System.out.println("******Object******");
        }
//		if(p2 instanceof String){
//
//		}

        //练习：
        //问题一：编译时通过，运行时不通过
        //举例一：
//		Person p3 = new Woman();
//		Man m3 = (Man)p3;
        //举例二：
//		Person p4 = new Person();
//		Man m4 = (Man)p4;


        //问题二：编译通过，运行时也通过
//		Object obj = new Woman();
//		Person p = (Person)obj;

        //问题三：编译不通过
//		Man m5 = new Woman();

//		String str = new Date();

//		Object o = new Date();
//		String str1 = (String)o;
    }
}
