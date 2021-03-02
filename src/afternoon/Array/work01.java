package afternoon.Array;

/**
 * 指定一个数组将A-Z放在数组里面，然后再把数组中的字母遍历出来
 * author:phil
 */
public class work01 {
    public static void main(String[] args) {
        char [] arrys = new char[26];
        for (int i =0;i<arrys.length;i++){
           // System.out.print(c1);
            arrys[i] = (char)('A'+i);//’A‘+i是int，arrys[i]是char
        }
        System.out.println("=====数组=====");
        for (int i =0;i<arrys.length;i++){

            System.out.print(arrys[i]);
        }
    }


}
