package com.np.java_oop_practice.practice05;

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
        TriAngle triAngle = new TriAngle();
        triAngle.setBase(30);
        triAngle.setHeight(40);

        System.out.println("a = "+triAngle.getBase()+",h= "+triAngle.getHeight());

        System.out.println("S△ = " +(triAngle.getBase()*triAngle.getHeight())/2);


        TriAngle t = new TriAngle(50,60);
        System.out.println("a = "+t.getBase()+",h = "+t.getHeight());
        System.out.println("S△ = " +(t.getBase()*t.getHeight())/2);

    }

}
