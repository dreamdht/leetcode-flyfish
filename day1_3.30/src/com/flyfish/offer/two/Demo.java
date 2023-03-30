package com.flyfish.offer.two;

import java.util.Deque;
import java.util.LinkedList;

/**
 * @autohr flyfish
 * @date: 2023/3/30 19:43
 * @description:
 * 定义栈的数据结构，
 * 请在该类型中实现一个
 * 能够得到栈的最小元素的 min 函数在该栈中，
 * 调用 min、push 及 pop 的时间复杂度都是 O(1)。
 * 示例:
 *
 * MinStack minStack = new MinStack();
 * minStack.push(-2);
 * minStack.push(0);
 * minStack.push(-3);
 * minStack.min();   --> 返回 -3.
 * minStack.pop();
 * minStack.top();      --> 返回 0.
 * minStack.min();   --> 返回 -2.
 *
 * stack.push(xxx) 往头插
 * stack.peek() 返回头部数
 * stack.pop()  返回头部数，并删除
 */
public class Demo {

}

class MinStack{
    Deque<Integer> stack;
    Deque<Integer> minStack;

    public MinStack(){
        stack = new LinkedList<>();
        minStack = new LinkedList<>();
    }

    public void push(int val){
        stack.push(val);
        if(minStack.isEmpty()){
            minStack.push(val);
        }else{
            minStack.push(minStack.peek()<val?minStack.peek():val);
        }
    }

    public void pop(){
        stack.pop();
        minStack.pop();
    }

    public int top(){
        return stack.peek();
    }

    public int min(){
        return minStack.peek();
    }
}

