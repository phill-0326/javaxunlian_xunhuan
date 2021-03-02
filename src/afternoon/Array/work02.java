package afternoon.Array;

/**
 * 比较数组中的最大值，并且输出最大值以及最大值的索引
 * author：phil
 */
public class work02 {
    public static void main(String[] args) {
        int [] arrays = {4,-9,78,26,90,-99};
        int max =arrays[0];//假设索引0位的值就是最大值
        int index =0;
        for (int i = 1; i < arrays.length; i++) {
        //数组总索引1开始遍历进行与索引0位进行比较大小。
          if (max<arrays[i]){
              max = arrays[i];
              index = i;
           //   System.out.println("最大值 ："+max +"索引为 "+index);
          }

        }
        System.out.println("最大值 ："+max +"索引为 "+index);
    }
}
