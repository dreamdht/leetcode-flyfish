package com.flyfish.offer.one;

import java.util.Stack;

/**
 * @autohr flyfish
 * @date: 2023/3/30 19:29
 * @description:
 */
public class Demo {
    public static void main(String[] args) {
        MyCQueue myCQueue = new MyCQueue();

    }
}

class MyCQueue{
    private Stack<Integer> inStack;
    private Stack<Integer> outStack;

    public MyCQueue(){
        inStack = new Stack<>();
        outStack = new Stack<>();
    }

    public void appendTail(int val){
        inStack.push(val);
    }

    public int deleteHead(){
        if(!outStack.isEmpty()){
            return outStack.pop();
        }
        else{
            while (!inStack.isEmpty()){
                outStack.push(inStack.pop());
            }
        }
        return outStack.isEmpty()?-1:outStack.pop();
    }
}

