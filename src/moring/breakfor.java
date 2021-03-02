package moring;

public class breakfor {
    /**
     * 求1-100以内的数求和，当和第一次大于20 的时候输出但前数
     * @param args
     * phil
     */
    public static void main(String[] args) {
        int sum = 0;
        int i;
        for (i = 1;i<=100;i++){
            sum +=i;
            if (sum >20){
                break;

            }

        }
        System.out.println("当前数是："+i);

    }
}
