package moring;

import java.util.Scanner;

public class forbreak {
    /**
     * 登录小练习有三次机会输入用户名和密码，只有当用户名和密码输入真确的以后才可以提示登陆成功！
     * 若输入错误则会提示还剩几次机会
     * @param args
     * author: phil
     */
    public static void main(String[] args) {
        Scanner myScaner = new Scanner(System.in);
        String name = ""; //声明空字符串
        String num = "";
       // System.out.println("请输入用户名和密码！！！");
        for (int i = 2; i > 0; i--){

            System.out.println("请输入用户名： ");
             name = myScaner.next();
            System.out.println("请输入密码： ");
             num = myScaner.next();

            if ("丁真".equals(name) && "666".equals(num)  ){
                //字符串的比较应该使用   "".equals()
                System.out.println("恭喜你！登陆成功！！！！");
                break;
            }else{
                System.out.println("还有"+i+"次机会！！！");
            }
        }
    }
}
