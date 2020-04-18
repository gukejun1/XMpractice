package Demo;

import java.util.ArrayList;
/**
 * 链表
 * 输入一个链表，按链表值从尾到头的顺序返回一个ArrayList。
 */
public class Test03 {
    public static void main(String[] args) {
//		ListNode listNode = ListNode;
//		printListFromTailToHead(listNode);
    }
    public static ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        ArrayList<Integer> result = new ArrayList<Integer>();
        ListNode temp = listNode;
        while ( temp != null ) {
            list.add( temp.val );//向里面添加
            temp = temp.next;
        }
        for ( int i = list.size()-1; i>=0; i-- ) {
            result.add( list.get(i) );//循环添加
        }
        return result;
    }
}
class ListNode {
    int val;
    ListNode next = null;
    ListNode(int val) {
        this.val = val;
    }
}

