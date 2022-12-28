package com.np.util;

import java.util.Scanner;

/**
 * @Description: 工具类
 * CMUtility工具类：
 * 将不同的功能封装为方法，就是可以直接通过调用方法使用它的功能，而无需考虑具体的功能实现细节
 * @Author NingPeng
 * @Email: ningpeng97@163.com
 * @Date: 2022/12/29
 * @ClassName:Utils
 * @Version: v1.0
 */
public class CMUtility {
    private static Scanner scanner = new Scanner(System.in);

    /**
     * 用于界面菜单的选择。该方法读取键盘，如果用户键入’1’-’5’中的任意字符，则方法返回。返回值为用户键入字符
     * 菜单展示的选项只有这些,如果不是这些选项,循环继续让他输入,直到正确
     *
     * @return
     */
    public static char readMenuSelection() {
        char c;
        for (; ; ) {
            String string = readKeyBoard(1, false);
            c = string.charAt(0);
            if (c != '1' && c != '2' &&
                    c != '3' && c != '4' && c != '5') {
                System.out.print("选择错误，请重新输入：");
            } else
                break;
        }
        return c;
    }

    /**
     * 从键盘读取一个字符，并将其作为方法的返回值。
     * 用于读取性别,只有男或者女,读取一个字符
     *
     * @return
     */
    public static char readChar() {
        String string = readKeyBoard(1, false);
        return string.charAt(0);
    }

    /**
     * 从键盘读取一个字符，并将其作为方法的返回值
     * 如果用户不输入字符而直接回车，方法将以defaultValue 作为返回值
     * 重载方法,用于在修改性别时,形参还是原来的性别的话,就用原来的值填充,将它作为默认值返回
     *
     * @param defaultValue 如果用户不输入字符而直接回车，方法将以defaultValue 作为返回值,此方法可在修改客户时调用
     * @return
     */
    public static char readChar(char defaultValue) {
        String string = readKeyBoard(1, false);
        return (string.length() == 0) ? defaultValue : string.charAt(0);
    }

    /**
     * 从键盘读取一个长度不超过2位的整数，并将其作为方法的返回值
     * 用于读取年龄数字
     *
     * @return
     */
    public static int readInt() {
        int n;
        for (; ; ) {
            String string = readKeyBoard(1, false);
            try {
                n = Integer.parseInt(string);
                break;
            } catch (NumberFormatException e) {
                System.out.println("数字出入错误,请重新输入:");
            }
        }
        return n;
    }

    /**
     * 从键盘读取一个长度不超过2位的整数，并将其作为方法的返回值
     * 如果用户不输入字符而直接回车，方法将以defaultValue 作为返回值
     * 在修改时,年龄没变,将年龄作为默认值返回
     *
     * @param defaultValue 如果用户不输入字符而直接回车，方法将以defaultValue 作为返回值
     * @return
     */
    public static int readInt(int defaultValue) {
        int n;
        for (; ; ) {
            String string = readKeyBoard(2, true);
            if (string.equals("")) {
                return defaultValue;
            }

            try {
                n = Integer.parseInt(string);
                break;
            } catch (NumberFormatException e) {
                System.out.println("数字输入错误,请重新输入: ");
            }
        }
        return n;
    }

    /**
     * 从键盘读取一个长度不超过limit的字符串，并将其作为方法的返回值
     * 用于读取姓名,电话,邮箱
     *
     * @param limit 指定字符串的最大长度
     * @return
     */
    public static String readString(int limit) {
        return readKeyBoard(limit, false);
    }

    /**
     * 从键盘读取一个长度不超过limit的字符串，并将其作为方法的返回值
     * 如果用户不输入字符而直接回车，方法将以defaultValue 作为返回值
     * 修改的时候使用
     *
     * @param limit 指定字符串的最大长度
     * @param defaultValue 如果用户不输入字符而直接回车，方法将以defaultValue 作为返回值
     * @return
     */
    public static String readString(int limit, String defaultValue) {
        String string = readKeyBoard(limit, true);
        return string.equals("") ? defaultValue : string;
    }


    /**
     * 用于确认选择的输入。该方法从键盘读取‘Y’或’N’，并将其作为方法的返回值。
     * 在删除和退出时,需要再次确认
     *
     * @return
     */
    public static char readConfirmSelection() {
        char c;
        for (; ; ) {
            String string = readKeyBoard(1, false).toUpperCase();
            c = string.charAt(0);
            if (c == 'Y' || c == 'N') {
                break;
            } else {
                System.out.println("选择错误请重新输入: ");
            }
        }
        return c;
    }

    /**
     * 通过键盘获取值的方法
     * 这是私有功能,不对外暴露
     * 本类内方法需要时直接调用
     *
     * @param limit
     * @param blankReturn
     * @return
     */
    private static String readKeyBoard(int limit, boolean blankReturn) {
        String line = "";
        while (scanner.hasNextLine()) {
            line = scanner.nextLine();
            if (line.length() == 0) {
                if (blankReturn)
                    return line;
                else
                    continue;
            }
            if (line.length() < 1 || line.length() > limit) {
                System.out.print("输入长度（不大于" + limit + "）错误，请重新输入：");
                continue;
            }
            break;
        }
        return line;
    }
}
