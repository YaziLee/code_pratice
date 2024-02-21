package com.example.code_practice.leetcode.贪心法;

public class LC45 {
    public int jump(int[] nums) {
        if(nums.length==1){
            return 0;
        }
        int count = 0;
        int maxRange = 0;
        int curRange = 0;
        for(int i=0; i<nums.length; i++){
            maxRange = Math.max(maxRange, i+nums[i]);
            if(maxRange>=nums.length-1){
                count++;
                break;
            }
            if(i==curRange){
                curRange = maxRange;
                count++;
            }
        }
        return count;
    }
}
