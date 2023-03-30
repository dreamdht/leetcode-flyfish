package com.flyfish.offer.one;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Stack;

/**
 * @autohr flyfish
 * @date: 2023/3/30 19:21
 * @description:
 * 用两个栈实现一个队列。队列的声明如下，
 * 请实现它的两个函数 appendTail 和 deleteHead ，
 * 分别完成在队列  尾部插入  整数和在队列  头部删除  整数的功能。
 * (若队列中没有元素，deleteHead操作返回 -1 )
 * 示例 1：
 *
 * 输入：
 * ["CQueue","appendTail","deleteHead","deleteHead","deleteHead"]
 * [[],[3],[],[],[]]
 * 输出：[null,null,3,-1,-1]
 * 示例 2：
 *
 * 输入：
 * ["CQueue","deleteHead","appendTail","appendTail","deleteHead","deleteHead"]
 * [[],[],[5],[2],[],[]]
 * 输出：[null,-1,null,null,5,2]
 */
public class Example {
    public static void main(String[] args) {

    }
}

class CQueue {
    //两个栈，一个出栈，一个入栈
    /*入*/
    private Stack<Integer> stack1;
    /*出*/
    private Stack<Integer> stack2;

    public CQueue() {
        stack1 = new Stack<>();
        stack2 = new Stack<>();
    }

    public void appendTail(int value) {
        stack1.push(value);
    }

    public int deleteHead() {
        if(!stack2.isEmpty()){
            return stack2.pop();
        }else{
            while(!stack1.isEmpty()){
                stack2.push(stack1.pop());
            }
            return stack2.isEmpty() ? -1 : stack2.pop();
        }
    }
}
