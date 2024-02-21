package com.example.code_practice.leetcode.栈;

public class LC42 {
    public int trap(int[] height) {
        int length = height.length;
        if(length<=2){
            return 0;
        }
        int[] maxHeightLeft = new int[length];
        int[] maxHeightRight = new int[length];
        maxHeightLeft[0] = height[0];
        maxHeightRight[length-1] = height[length-1];

        for(int i=1; i<length; i++){
            maxHeightLeft[i] = Math.max(height[i], maxHeightLeft[i-1]);
        }
        for(int i=length-2; i>0; i--){
            maxHeightRight[i] = Math.max(height[i], maxHeightRight[i+1]);
        }

        int sum = 0;
        for(int i=1; i<length-1 ;i++){
            int width = Math.min(maxHeightLeft[i], maxHeightRight[i]) - height[i];
            if(width>0){
                sum+=width;
            }
        }
        return sum;
    }
}
