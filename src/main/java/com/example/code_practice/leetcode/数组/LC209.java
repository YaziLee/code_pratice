package com.example.code_practice.leetcode.数组;

public class LC209 {
    public int minSubArrayLen(int target, int[] nums) {
        int low=0;
        int high=0;
        int minlen=Integer.MAX_VALUE;
        int sum=0;
        for(;high<nums.length;high++){
            sum+=nums[high];
            while(sum>=target){
                minlen=Math.min(minlen,high-low+1);
                sum-=nums[low];
                low++;
            }
        }
        return minlen==Integer.MAX_VALUE?0:minlen;
    }
}
