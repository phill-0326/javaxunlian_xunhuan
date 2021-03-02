package moring.homework;

/**
 * 求1+(1+2)+(1+2+3)+....+(1+2+3+...+100)的结果
 * author：phil
 */
public class homework08 {
    public static void main(String[] args) {
        int sum=0;
        int a=100;
        /*for (int i=1;i<=a;i++){
            sum += 0.5*(i*i+i);
        }*/
        for (int i =1;i<=a;i++){
            for (int j =1;j<=i;j++){
                sum += j;
            }
        }
        System.out.println(sum);
    }
}
