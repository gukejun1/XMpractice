package Test;

import java.util.Scanner;

/*
 * 连续输入字符串，请按长度为8拆分每个字符串后输出到新的字符串数组；
 * 长度不是8整数倍的字符串请在后面补数字0，空字符串不处理。
 */
public class Test04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()) {
            String s = new String(sc.nextLine());//将输入的字符存在s中
            if(s.length()%8 !=0) {//如果不是8的倍数
                s=s+"00000000";//在末尾添加0
            }
            while(s.length()>=8) {//保证大于8的情况下
                System.out.println(s.substring(0,8));//对字符串进行分割，substring
                s = s.substring(8);
            }
        }
    }
}
