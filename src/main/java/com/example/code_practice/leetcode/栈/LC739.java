package com.example.code_practice.leetcode.栈;

import java.util.Stack;

public class LC739 {
    public int[] dailyTemperatures(int[] temperatures) {
        int[] res = new int[temperatures.length];
        Stack<Integer> stack = new Stack<>();
        for(int i=0;i<temperatures.length;i++){
            while(!stack.isEmpty()&&temperatures[i]>temperatures[stack.peek()]){
                int pre= stack.pop();
                res[pre]=i-pre;
            }
            stack.push(i);
        }
        return res;
    }
}
