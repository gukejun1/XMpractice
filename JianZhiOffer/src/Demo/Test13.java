package Demo;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 代码的完整性    调整数组顺序使奇数位于偶数前面
 * @author fang
 *
 */
/*
输入一个整数数组，实现一个函数来调整该数组中数字的顺序，
使得所有的奇数位于数组的前半部分，所有的偶数位于数组的后
半部分，并保证奇数和奇数，偶数和偶数之间的相对位置不变。
*/
public class Test13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String [] nextLine = sc.nextLine().split(" ");
        int  []  num = new int [nextLine.length];
        for (int i = 0; i < num.length; i++) {
            num[i] =Integer.valueOf(nextLine[i]);//将字符转化为数字
        }
        reOrderArray(num);
    }
    public static void reOrderArray(int [] array) {
        int leng = 0;//定义奇数的个数
        for (int i = 0; i < array.length; i++) {
            if(array[i]%2==1) { //如果是奇数
                leng ++;
            }
        }
        int m = 0;//定义奇数的起始位置
        int n = 0;//定义偶数的起始位置
        int [] jishu = new int[leng];
        int [] oushu = new int[array.length-leng];

        for (int i = 0; i < array.length; i++) {//循环遍历array数组
            if(array[i]%2==1) {//如果是奇数
                jishu[m] = array[i];//将奇数存进去
                m++;
            }else{//否则是偶数的话
                oushu[n] = array[i];//将偶数存进去
                n++;
            }
        }
        for (int i = 0; i < array.length; i++) {//将奇偶数组元素存到原数组中去
            if(i<leng) {
                array[i] = jishu[i];
            }else {
                array[i] = oushu[i-leng];
            }
        }
        System.out.println(Arrays.toString(array));
    }
}