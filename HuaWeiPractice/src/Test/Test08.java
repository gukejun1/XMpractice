package Test;

import java.util.Scanner;
import java.util.TreeMap;
/*
 * 数据表记录包含表索引和数值（int范围的整数），
 * 请对表索引相同的记录进行合并，即将相同索引的数值进
 * 行求和运算，输出按照key值升序进行输出。
 */
public class Test08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TreeMap<Integer, Integer> map = new TreeMap<Integer,Integer>();
        int size = sc.nextInt();
        while(sc.hasNext()) {
            int k = sc.nextInt();//读取健
            int v = sc.nextInt();//读取值
            if(map.containsKey(k)){//如果健已经存在，那就健不变，值相加
                map.put(k, v+map.get(k));
            }else{
                map.put(k, v);//健不存在的话，将键值对存入map集合
            }
        }
        for (int key: map.keySet()) {
            System.out.println(key+" " +map.get(key));//遍历键值对
        }
    }
}