package Demo;

import java.util.Arrays;

/**
 *  数组	数组中重复的数字
 *
 *  在一个长度为n的数组里的所有数字都在0到n-1的范围内。
 *  数组中某些数字是重复的，但不知道有几个数字是重复的。
 * 也不知道每个数字重复几次。请找出数组中任意一个重复的数字。
 * 例如，如果输入长度为7的数组{2,3,1,0,2,5,3}，那么对应的
 * 输出是第一个重复的数字2。
 */
//Parameters:
//    numbers:     an array of integers
//    length:      the length of array numbers
//    duplication: (Output) the duplicated number in the array number,length of duplication array is 1,so using duplication[0] = ? in implementation;
//                  Here duplication like pointor in C/C++, duplication[0] equal *duplication in C/C++
//    这里要特别注意~返回任意重复的一个，赋值duplication[0]
// Return value:       true if the input is valid, and there are some duplications in the array number
//                     otherwise false
public class Test50 {
    public static  boolean duplicate(int numbers[],int length,int [] duplication) {
        if(numbers==null || length ==0) {//如果数组为空或者长度为0
            return false;
        }
        Arrays.sort(numbers);//先排序
        for (int i = 0; i < numbers.length-1; i++) {
            if(numbers[i]==numbers[i+1]) {//然后比较相邻的数字是否相同（即重复）
                duplication[0] = numbers[i];//一出现重复的情况，就将重复的数字赋值给第一个重复数组中
                return true;//并返回真
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int numbers[] = {1,2,3,3,2,1,4,5,6};//长度为9的数组
        int length = 9;//长度 9
        int [] duplication = {1,2,3};//重复的数字
        boolean boo = duplicate(numbers,length,duplication);
        if(boo == true) {
            System.out.println("含有重复的数字"+":"+duplication[0]);
        }else {
            System.out.println("不含有重复的数字"+":"+duplication[0]);
        }
    }
}
