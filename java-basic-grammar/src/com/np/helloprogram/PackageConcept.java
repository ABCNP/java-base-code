package com.np.helloprogram;

import java.util.Date;
import java.util.*;

/**
 * @Author NingPeng
 * @ClassName:PackageConcept
 * @Email: ningpeng97@163.com
 * @Description: 包概念
 * @Date: 2022/12/8
 * @Version: v1.0
 */
public class PackageConcept {
    public static void main(String[] args) {
        Date date1 = new Date();
        Date date2 = new java.util.Date();
        System.out.printf("当前时间: %s%n", date1);
    }
}
