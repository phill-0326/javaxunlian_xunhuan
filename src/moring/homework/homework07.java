package moring.homework;

public class homework07 {
    public static void main(String[] args) {
        //int i = 0;
        double sum = 0;
        for (int i =1;i<=100;i++){
            //判断是奇数还是偶数
            if (i % 2 != 0){
                sum += 1.0/i; //这里隐含一个陷阱，要把公式中的分子1写成1.0才能得到精确的小数
            }else{
                sum -= 1.0/i ;
            }
        }
        System.out.println(sum);
    }
}
