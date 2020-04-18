package Test;

import java.util.Scanner;

/*
 * 写出一个程序，接受一个十六进制的数，输出该数值的十进制表示。（多组同时输入 ）
 */
public class Test05 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNext()){
            String str = scanner.nextLine();
            System.out.println(Integer.valueOf(str.substring(2),16).toString());
        }
    }
}
