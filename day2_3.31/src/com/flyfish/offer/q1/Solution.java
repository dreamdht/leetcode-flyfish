package com.flyfish.offer.q1;

import java.util.Stack;

/**
 * @autohr flyfish
 * @date: 2023/3/31 20:59
 * @description:
 */

public class Solution {
    public int[] reversePrint(ListNode head) {
        Stack<ListNode> stack = new Stack<>();
        ListNode temp = head;
        while (temp!=null) {
            stack.push(temp);
            temp = temp.next;
        }

        int[] result = new int[stack.size()];
        for (int i = 0; i < result.length; i++) {
            result[i] = stack.pop().val;
        }

        return result;
    }
}

class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}