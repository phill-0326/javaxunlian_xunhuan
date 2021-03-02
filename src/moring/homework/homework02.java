package moring.homework;

import java.util.Scanner;

/**
 * 输入一个整数判断是大于0，小于0，还是等于0
 * author：phil
 */
public class homework02 {
    public static void main(String[] args) {
        Scanner myScaner = new Scanner(System.in);
        System.out.println("请输入一个整数： ");
        int a = myScaner.nextInt();
        if (a<0){
            System.out.println("小于0");
        }else if (a>0){
            System.out.println("大于0");
        }else{
            System.out.println("等于0");
        }
    }
}
