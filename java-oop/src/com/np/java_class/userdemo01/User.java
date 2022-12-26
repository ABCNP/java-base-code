package com.np.java_class.userdemo01;

/**
 * @Description:
 * @Author NingPeng
 * @Email: ningpeng97@163.com
 * @Date: 2022/12/26
 * @ClassName:User
 * @Version: v1.0
 */
public class User {
    String name;
    int age = 1;

    public User(){

    }

    public User(int a){
        age = a;
    }

    public void setAge(int a){
        age = a;
    }
}
