package Test;

import java.util.Scanner;

/*
 * 计算字符串最后一个单词的长度，单词以空格隔开。
 */
public class Test01 {
    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);
        String str = sca.nextLine();
        String [] spli = str.split(" ");//用空格分开
        int lengt = 0;
        lengt = spli[spli.length-1].length();//最后一个字符串角标[spli.length-1]
        System.out.println(lengt);
    }
}
