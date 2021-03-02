package moring.homework;

/**
 * 某人有100000，每次经过路口需要缴费，规则如下：
 * 1）当现金>50000时，每次交5%
 * 2）当现金<=50000时，每次交1000
 * 计算这个人可以过多少次路口？使用while break 完成。
 * author：phil
 */
public class homework01 {
    public static void main(String[] args) {
        double money = 100000;
        int count = 0;
        while (money>0){
            if (money>50000){
               // money = money-money*0.05;
                money *= 0.95;
                count ++;
            }else if(money>=1000){
                money -= 1000;
                count ++;
            }else {
             //   System.out.println("过不了了！！！");
                break;
            }
        }
        System.out.println("剩余"+money+"元，可以过"+count+"次路口");
    }
}
