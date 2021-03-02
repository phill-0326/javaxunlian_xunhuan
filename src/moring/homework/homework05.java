package moring.homework;

/**
 * 输出1-100之间不能被5整除的数，每5个一行
 * author：phil
 */
public class homework05 {
    public static void main(String[] args) {
        int count = 0;
        for (int i = 1;i <= 100;i++){
            if (i % 5 !=0){
                System.out.print(i+"\t ");
                count++;
                if (count % 5==0){
                    System.out.println();//每满5个就换行
                }
            }

        }
    }
}
