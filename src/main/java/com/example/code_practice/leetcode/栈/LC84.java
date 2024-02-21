package com.example.code_practice.leetcode.栈;

public class LC84 {
    public int largestRectangleArea(int[] heights) {
        int length = heights.length;
        int[] left = new int[length];
        int[] right = new int[length];
        left[0] = -1;
        for(int i=1; i<length; i++){
            int t = i-1;
            while(t>=0&&heights[i]<=heights[t]){
                t = left[t];
            }
            left[i] = t;
        }
        right[length-1] = length;
        for(int i=length-2; i>=0; i--){
            int t= i+1;
            while(t<length&&heights[i]<=heights[t]){
                t = right[t];
            }
            right[i] =t;
        }

        int res=Integer.MIN_VALUE;
        for(int i = 0; i<length; i++){
            //理解为什么是-1
            res = Math.max((right[i]-left[i]-1)*heights[i],res);
        }
        return res;
    }
}
