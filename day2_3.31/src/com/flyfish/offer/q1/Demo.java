//package com.flyfish.hot;
//
//import java.util.Stack;
//
///**
// * @autohr flyfish
// * @date: 2023/3/31 20:57
// * @description:
// * 输入一个链表的头节点，从尾到头反过来返回每个节点的值（用数组返回）。
// * 示例 1:
// * 输入：head = [1,3,2]
// * 输出：[2,3,1]
// */
//public class Demo {
//    public static void main(String[] args) {
//        System.out.println("hello world");
//    }
//}
//
//class Solution {
//    public int[] reversePrint(ListNode head) {
//        Stack<ListNode> stack = new Stack<ListNode>();
//        ListNode temp = head;
//        while (temp != null) {
//            stack.push(temp);
//            temp = temp.next;
//        }
//        int size = stack.size();
//        int[] print = new int[size];
//        for (int i = 0; i < size; i++) {
//            print[i] = stack.pop().val;
//        }
//        return print;
//    }
//}
