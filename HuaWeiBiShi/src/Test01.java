import java.util.Scanner;

/**
 * Created by fang on 2020/4/20.
 */
//计算n=a+aa+aaa+aaaa
public class Test01 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        String[] scStr = sc.nextLine().split(" ");
        int [] scInt = new int [scStr.length];
        scInt[0] = Integer.valueOf(scStr[0]);//将字符转化为数字
        scInt[1] = Integer.valueOf(scStr[1]);
        int a=scInt[0];//第一个数
        int b=scInt[1];//第二个数
        int c = 0;
        int n = a;
        for (int i = 1; i < b; i++) {
            a = a*10+n;
            c= a+c;
        }
        System.out.println(c + n);
    }
}
