package Test;

import java.util.Scanner;

/*
 * 功能:输入一个正整数，按照从小到大的顺序输出它的所有质因子（如180的质因子为2 2 3 3 5 ）
最后一个数后面也要有空格

详细描述：
函数接口说明：
public String getResult(long ulDataInput)

输入参数：
long ulDataInput：输入的正整数
返回值：
String
 */
public class Test06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long dat = sc.nextLong();
        for(int i = 2;i<dat +1;i++) {
            while(dat % i ==0) {
                System.out.print(i+" ");
                dat = dat / i;
            }
        }
    }
}
