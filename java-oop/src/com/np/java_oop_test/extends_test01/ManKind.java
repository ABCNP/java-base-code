package com.np.java_oop_test.extends_test01;

/**
 * @Description: 继承练习
 * 定义一个ManKind类，包括
 * 成员变量int sex和int salary；
 * 方法void manOrWoman()：根据sex的值显示“man”(sex==1)或者“woman”(sex==0)；
 * 方法void employeed()：根据salary的值显示“no job”(salary==0)或者“ job”(salary!=0)。
 * @Author NingPeng
 * @Email: ningpeng97@163.com
 * @Date: 2022/12/30
 * @ClassName:ManKind
 * @Version: v1.0
 */
public class ManKind {
    private int sex;//性别
    private int salary;//薪资

    public ManKind() {

    }

    public ManKind(int sex, int salary) {
        this.sex = sex;
        this.salary = salary;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }

    public int getSex() {
        return sex;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getSalary() {
        return salary;
    }

    public void manOrWoman() {
        if (sex == 0) {
            System.out.println("woman");
        } else if (sex == 1)
            System.out.println("man");
    }

    public void employeed() {
        String jobInfo = (salary == 0) ? "no job" : "job";
        System.out.println(jobInfo);
    }
}
