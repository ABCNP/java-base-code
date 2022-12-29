package com.np.java_oop_test.extends_test01;

/**
 * @Description:
 * @Author NingPeng
 * @Email: ningpeng97@163.com
 * @Date: 2022/12/30
 * @ClassName:Kids
 * @Version: v1.0
 */
public class Kids extends ManKind {
    private int yearsOld;

    public Kids() {

    }

    public Kids(int yearsOld) {
        this.yearsOld = yearsOld;
    }

    public void setYearsOld(int yearsOld) {
        this.yearsOld = yearsOld;
    }

    public int getYearsOld() {
        return yearsOld;
    }

    /*
     * @Description:  修改练习1.2中定义的类Kids，在Kids中重新定义employeed()方法，
     * 覆盖父类ManKind中定义的employeed()方法，
     * 输出“Kids should study and no job.”
     *
     * @Author np
     * @Date 2022/12/30
     * @Param
     * $return
     **/
    @Override
    public void employeed() {
        System.out.println("Kids should study and no job.");
    }

    public void printAge() {
        System.out.println("I am " + yearsOld + " years old.");
    }
}
