import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by fang on 2020/4/18.
 */
public class Test02 {
    /*
        将输入的字符数组转化为数字数组
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String [] str = sc.nextLine().split(" ");
        int [] newStr = new int[str.length];
        for (int i = 0;i<str.length;i++){
            newStr[i] = Integer.valueOf(str[i]);
        }
        System.out.println(Arrays.toString(newStr));
    }
}
