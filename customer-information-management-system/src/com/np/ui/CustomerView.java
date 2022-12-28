package com.np.ui;

import com.np.bean.Customer;
import com.np.service.CustomerList;
import com.np.util.CMUtility;

/**
 * @Description: 前端展示层, 负责数据展示, 和程序入口
 * @Author NingPeng
 * @Email: ningpeng97@163.com
 * @Date: 2022/12/29
 * @ClassName:CustomerView
 * @Version: v1.0
 */
public class CustomerView {
    //创建最大包含10个客户对象的CustomerList 对象
    private CustomerList customerList = new CustomerList(10);

    /**
     * @Description: 构造器
     * @Author np
     * @Date 2022/12/29
     * @Param []
     * $return
     **/
    public CustomerView() {
        //添加原始数据
        Customer customer = new Customer("张三", '男', 30, "18888888888", "123@12.com");
        customerList.addCustomer(customer);
    }

    /**
     * @Description: 显示主菜单，响应用户输入，根据用户操作分别调用其他相应的成员方法（如addNewCustomer），以完成客户信息处理。
     * @Author np
     * @Date 2022/12/29
     * @Param []
     * $return void
     **/
    public void enterMainMenu() {
        boolean loopFlag = true;
        //每次进程序都会先展示操作信息,可供操作
        do {
            System.out.println("\n-----------------客户信息管理软件-----------------\n");
            System.out.println("                   1 添 加 客 户");
            System.out.println("                   2 修 改 客 户");
            System.out.println("                   3 删 除 客 户");
            System.out.println("                   4 客 户 列 表");
            System.out.println("                   5 退       出\n");
            System.out.print("                   请选择(1-5)：");
            char key = CMUtility.readMenuSelection();
            System.out.println();
            switch (key) {
                case '1':
                    addNewCustomer();
                    break;
                case '2':
                    modifyCustomer();
                    break;
                case '3':
                    deleteCustomer();
                    break;
                case '4':
                    listAllCustomers();
                    break;
                case '5':
                    System.out.print("确认是否退出(Y/N)：");//提示信息
                    char yn = CMUtility.readConfirmSelection();
                    if (yn == 'Y')
                        loopFlag = false;
                    break;
            }
        } while (loopFlag);
    }

    /**
     * @Description: 添加客户
     * @Author np
     * @Date 2022/12/29
     * @Param []
     * $return void
     **/
    private void addNewCustomer() {
        System.out.println("---------------------添加客户---------------------");
        System.out.print("姓名：");
        String name = CMUtility.readString(4);
        System.out.print("性别：");
        char gender = CMUtility.readChar();
        System.out.println("年龄: ");
        int age = CMUtility.readInt();
        System.out.println("电话: ");
        String phone = CMUtility.readString(15);
        System.out.println("邮箱: ");
        String email = CMUtility.readString(15);

        Customer customer = new Customer(name, gender, age, phone, email);
        boolean flag = customerList.addCustomer(customer);
        if (flag) {
            System.out.println("---------------------添加完成---------------------");
        } else {
            System.out.println("----------------记录已满,无法添加-----------------");
        }
    }

    /**
     * @Description: 修改客户
     * @Author np
     * @Date 2022/12/29
     * @Param []
     * $return void
     **/
    private void modifyCustomer() {
        System.out.println("---------------------修改客户---------------------");
        int index = 0;
        Customer customer = null;
        for (; ; ) {
            System.out.print("请选择待修改客户编号(-1退出)：");
            index = CMUtility.readInt();
            if (index == -1) {
                return;
            }

            customer = customerList.getCustomer(index - 1);
            if (customer == null)
                System.out.println("无法找到指定客户!");
            else
                break;
        }

        System.out.println("姓名(" + customer.getName() + ")：");
        String name = CMUtility.readString(4, customer.getName());
        System.out.print("性别(" + customer.getGender() + ")：");
        char gender = CMUtility.readChar(customer.getGender());

        System.out.print("年龄(" + customer.getAge() + ")：");
        int age = CMUtility.readInt(customer.getAge());

        System.out.print("电话(" + customer.getPhone() + ")：");
        String phone = CMUtility.readString(15, customer.getPhone());

        System.out.print("邮箱(" + customer.getEmail() + ")：");
        String email = CMUtility.readString(15, customer.getEmail());

        customer = new Customer(name, gender, age, phone, email);

        boolean flag = customerList.replaceCustomer(index - 1, customer);
        if (flag) {
            System.out.println("---------------------修改完成---------------------");
        } else {
            System.out.println("----------无法找到指定客户,修改失败--------------");
        }
    }

    /**
     * @Description: 删除客户
     * @Author np
     * @Date 2022/12/29
     * @Param []
     * $return void
     **/
    private void deleteCustomer() {
        System.out.println("---------------------删除客户---------------------");
        int index = 0;
        Customer customer = null;
        for (; ; ) {
            System.out.print("请选择待删除客户编号(-1退出)：");
            index = CMUtility.readInt();
            if (index == -1) {
                return;
            }

            customer = customerList.getCustomer(index - 1);
            if (customer == null)
                System.out.println("无法找到指定客户！");
            else
                break;
        }
        System.out.print("确认是否删除(Y/N)：");
        char yn = CMUtility.readConfirmSelection();
        if (yn == 'N')
            return;

        boolean flag = customerList.deleteCustomer(index - 1);
        if (flag) {
            System.out.println("---------------------删除完成---------------------");
        } else {
            System.out.println("----------无法找到指定客户,删除失败--------------");
        }
    }

    /**
     * @Description: 客户列表
     * @Author np
     * @Date 2022/12/29
     * @Param []
     * $return void
     **/
    private void listAllCustomers() {
        System.out.println("---------------------------客户列表---------------------------");
        Customer[] allCustomers = customerList.getAllCustomers();
        if (allCustomers.length == 0) {
            System.out.println("没有客户记录,请先添加客户.");
        } else {
            System.out.println("编号\t\t姓名\t\t性别\t\t年龄\t\t电话\t\t\t邮箱");
            for (int i = 0; i < allCustomers.length; i++) {
                System.out.println(i + 1 + "\t\t" + allCustomers[i].getName() + "\t\t" + allCustomers[i].getGender() + "\t\t" +
                        allCustomers[i].getAge() + "\t\t" + allCustomers[i].getPhone() + "\t" + allCustomers[i].getEmail());
            }
        }
        System.out.println("-------------------------客户列表完成-------------------------");
    }

    /**
     * @Description: 程序主入口, 用于启动程序
     * @Author np
     * @Date 2022/12/29
     * @Param [args]
     * $return void
     **/
    public static void main(String[] args) {
        //创建对象,调用展示信息的方法
        CustomerView customerView = new CustomerView();
        customerView.enterMainMenu();
    }

}
