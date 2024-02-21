package com.example.code_practice.leetcode.贪心法;

public class LC55 {
    public boolean canJump(int[] nums) {
        int coverRange = 0;
        for(int i=0; i<=coverRange; i++){
            coverRange = Math.max(i+nums[i], coverRange);
            if(coverRange>=nums.length-1){
                return true;
            }
        }
        return false;
    }
}
