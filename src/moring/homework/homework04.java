package moring.homework;

import java.util.Scanner;

/**
 * 判断一个数是不是水仙花数？
 * 所谓的水仙花数是指一个三位数，在其各个位置上数字的立方和等于其本身。
 * author：phil
 */
public class homework04 {
    public static void main(String[] args) {
        int a =0;//百位
        int b =0;//十位
        int c =0;//个位
        Scanner myScaner = new Scanner(System.in);
        System.out.println("请输入一个整数：");
        int num = myScaner.nextInt();
        a= num/100;
        b= num/10 -10;
        //b=num % 100 /10 ;
        c= num%10;
        if (num == a*a*a + b*b*b + c*c*c ){
            System.out.println(num+" ,这个数是水仙花数！");
        }else{
            System.out.println(num+" ,这个数不是水仙花数哦！！！");
        }
    }
}
