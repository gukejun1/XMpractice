package Test;

import java.util.Scanner;

/*
 * 写出一个程序，接受一个由字母和数字组成的字符串，和一个字符，然后输出输入字符串中含有该字符的个数。不区分大小写。
 */
public class Test02 {
    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);
        char [] cha = sca.nextLine().toUpperCase().toCharArray();//将输入的字符串读出后，全部转换为大写，然后再转换为字节
        Scanner scb = new Scanner(System.in);
        char [] chb = sca.nextLine().toUpperCase().toCharArray();
        int count = 0;
        for (int i = 0; i < cha.length; i++) {
            if(cha[i]==chb[0]) {
                count ++;
            }
        }
        System.out.println(count);
    }
}
