package com.example.code_practice.leetcode.数组;

public class LC27 {
    public int removeElement(int[] nums, int val) {
        int slow=0;
        int fast=0;
        for(;fast<nums.length;fast++){
            if(nums[fast]!=val){
                nums[slow]=nums[fast];
                slow++;
            }
        }
        return slow;
    }
}
