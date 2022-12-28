package com.np.service;

import com.np.bean.Customer;

/**
 * @Description: 后端服务层, 和数据打交道, 怎么存数据, 怎么取数据, 和返回数据给前端展示层
 * @Author NingPeng
 * @Email: ningpeng97@163.com
 * @Date: 2022/12/29
 * @ClassName:CustomerList
 * @Version: v1.0
 */
public class CustomerList {
    private Customer[] customers;//用来保存客户对象的数组
    private int total = 0;//记录已保存客户对象的数量


    /**
     * @Description: 构造器，用来初始化customers数组
     * @Author np
     * @Date 2022/12/29
     * @Param [totalCustomer:指定customers数组的最大空间]
     * $return
     **/
    public CustomerList(int totalCustomer) {
        //Customer[] customer = new Customer[10];//错误初始化
        //构造器初始化对象的时候注意和声明的对象是不是一致
        customers = new Customer[10];
    }

    /**
     * @Description: 将参数customer添加到数组中最后一个客户对象记录之后
     * @Author np
     * @Date 2022/12/29
     * @Param [customer]指定要添加的客户对象
     * $return boolean 添加成功返回true；false表示数组已满，无法添加
     **/
    public boolean addCustomer(Customer customer) {
        //判断总数超过阈值
        if (total >= customers.length)
            return false;
        customers[total++] = customer;
        return true;
    }

    /**
     * @Description: 用参数customer替换数组中由index指定的对象
     * @Author np
     * @Date 2022/12/29
     * @Param [index:指定所替换对象在数组中的位置，从0开始, cust:指定替换的新客户对象]
     * $return boolean 替换成功返回true；false表示索引无效，无法替换
     **/
    public boolean replaceCustomer(int index, Customer cust) {
        //判断索引合理性
        if (index < 0 || index >= total)
            return false;

        //将该位置的客户信息换成修改后客户信息
        customers[index] = cust;
        return true;
    }

    /**
     * @Description: 从数组中删除参数index指定索引位置的客户对象记录
     * @Author np
     * @Date 2022/12/29
     * @Param [index:指定所删除对象在数组中的索引位置，从0开始]
     * $return boolean 删除成功返回true；false表示索引无效，无法删除
     **/
    public boolean deleteCustomer(int index) {
        //判断索引是否合法
        if (index < 0 || index >= total)
            return false;
        /*
            当要把某一个删除的时候,该位置上后面的所有元素都要向前移动一位,最后一位置为默认值,因为数组是长度不可变和有序的
            代码上讲直接把让后面的元素覆盖掉前面的元素就行,使用循环
            int i = index;要删除的元素索引开始
            total - 1 总数-1 [0,1,2,3,4,5,0,0,0,0] --> 此时total是6,但是索引只到5,需要-1
         */
        for (int i = index; i < total - 1; i++) {
            //后一个元素覆盖前一个元素
            customers[i] = customers[i + 1];
        }
        //将末位置为null
        customers[--total] = null;
        return true;
    }

    /**
     * @Description: 返回数组中记录的所有客户对象
     * @Author np
     * @Date 2022/12/29
     * @Param []
     * $return com.np.bean.Customer[] 数组中包含了当前所有客户对象，该数组长度与对象个数相同
     **/
    public Customer[] getAllCustomers() {
        //创建新的客户对象数组,长度为total
        Customer[] customers1 = new Customer[total];
        //循环遍历数组
        for (int i = 0; i < total; i++) {
            //将客户数组元素赋值给新数组
            customers1[i] = customers[i];//引用(地址值)指向新数组,没有复制数据
        }
        //将新数组返回
        return customers1;
        //不能直接返回老数组,因为原来的数组如果没存满,那么后面都是空元素
        //应该返回的是数组中存了元素的部分
    }

    /**
     * @Description: 返回参数index指定索引位置的客户对象记录
     * @Author np
     * @Date 2022/12/29
     * @Param [index:指定所要获取的客户在数组中的索引位置，从0开始]
     * $return com.np.bean.Customer 封装了客户信息的Customer对象
     **/
    public Customer getCustomer(int index) {
        //判断索引不合法
        if (index < 0 || index >= total)
            return null;
        //返回指定索引客户信息
        return customers[index];
    }

    /**
     * @Description: 返回客户对象记录总数
     * @Author np
     * @Date 2022/12/29
     * @Param []
     * $return int 返回客户对象记录总数
     **/
    public int getTotal() {
        return -total;
    }

}
