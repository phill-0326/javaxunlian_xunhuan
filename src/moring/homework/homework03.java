package moring.homework;

import java.util.Scanner;

/**
 * 判断一个年份是否是闰年？
 * author：phil
 */
public class homework03 {
    public static void main(String[] args) {
        Scanner myScaner = new Scanner(System.in);
        System.out.println("请输入年份：");
        int year = myScaner.nextInt();
        if (year % 4 == 0){
            System.out.println("今年是闰年！！！！");
        }else{
            System.out.println("今年不是闰年！！！");
        }
    }
}
