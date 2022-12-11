package com.np.process_control.process_control_test;

/**
 * @Author NingPeng
 * @ClassName:Test03
 * @Email: ningpeng97@163.com
 * @Description: 分数及格
 * @Date: 2022/12/11
 * @Version: v1.0
 */
public class Test03 {
    public static void main(String[] args) {
        /*
		int score = 78;
		switch(score){
		case 0:

		case 1:

		case 2:

			...
		case 100:

		}
		*/

		/*
		int score = 78;
		if(score >= 60){

		}else{

		}
		*/

        int score = 78;
        switch(score / 10){
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("不及格");
                break;
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
                System.out.println("及格");
                break;

        }

        //更优的解决方案：
        switch(score / 60){
            case 0:
                System.out.println("不及格");
                break;
            case 1:
                System.out.println("及格");
                break;
        }
    }
}
/*
例题：对学生成绩大于60分的，输出“合格”。低于60分的，输出“不合格”。

说明：如果switch-case结构中的多个case的执行语句相同，则可以考虑进行合并。
*/