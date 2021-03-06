package Test;

import java.util.Arrays;
import java.util.Scanner;

/*
 * 明明想在学校中请一些同学一起做一项问卷调查，为了实验的客观性，
 * 他先用计算机生成了N个1到1000之间的随机整数（N≤1000），对于其中重复的数字，
 * 只保留一个，把其余相同的数去掉，不同的数对应着不同的学生的学号。然后再把这些
 * 数从小到大排序，按照排好的顺序去找同学做调查。请你协助明明完成“去重”与“排序”的
 * 工作(同一个测试用例里可能会有多组数据，希望大家能正确处理)。
 *
 *
 * 注：测试用例保证输入参数的正确性，答题者无需验证。测试用例不止一组。
	样例输入解释：
	样例有两组测试
	第一组是3个数字，分别是：2，2，1。
	第二组是11个数字，分别是：10，20，40，32，67，40，20，89，300，400，15。
 */
public class Test03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()) {
            int m = sc.nextInt();
            int [] arr = new int[m];
            for (int i = 0; i < m; i++) {
                arr[i] = sc.nextInt(); //将数字存入数组
            }

            Arrays.sort(arr);
            System.out.println(arr[0]);
            for (int i = 1; i < m; i++) {//遍历数组
                if(arr[i]!=arr[i-1]) {//如果后面的一个，不等于前面的一个
                    System.out.println(arr[i]);
                }
            }
        }
    }
}
