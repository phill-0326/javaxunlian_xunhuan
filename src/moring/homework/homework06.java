package moring.homework;

/**
 * 输出小写a-z以及大写的Z-A
 * 考察我们对a-z编码和for循环的综合使用
 * author：phil
 */
public class homework06 {
    public static void main(String[] args) {
        for(char c1='a';c1<='z';c1++){
            System.out.print(c1);
        }
        System.out.println();//换行
        for (char c2 ='Z';c2 >='A';c2--){
            System.out.print(c2);
        }

    }
}
