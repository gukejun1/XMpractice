package Test;

import java.util.Scanner;

/**
 输入一行字符，分别统计出包含英文字母、空格、数字和其它字符的个数
 */
public class Test40 {
    public static void main(String[] args) {
        Scanner xm = new Scanner(System.in);
        while(xm.hasNext()) {
            int count1 = 0 ,count2 = 0,count3 = 0 ,count4 = 0;
            char [] ch = xm.nextLine().toCharArray();
            for (int i = 0; i < ch.length; i++) {
                if((ch[i]>='a'&&ch[i]<='z')||(ch[i]>='A'&&ch[i]<='Z')) {
                    count1++;//英文字母加一
                }else if(ch[i]>='0'&&ch[i]<='9') {
                    count3++;//数字加一
                }else if(ch[i] == ' ') {
                    count2++;//空格加一
                }
            }
            count4 = ch.length - count1 - count2 - count3;//其他字符的个数
            System.out.println(count1);//英文字母个数
            System.out.println(count2);//数字个数
            System.out.println(count3);//空格个数
            System.out.println(count4);//其他字符个数
        }
        xm.close();
    }
}