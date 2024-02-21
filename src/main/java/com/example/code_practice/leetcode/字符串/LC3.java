package com.example.code_practice.leetcode.字符串;

public class LC3 {
    public int lengthOfLongestSubstring(String s) {
        if(s.length()==0){
            return 0;
        }
        int[] count=new int[256];
        int low=0;
        int high=0;
        int longest=0;
        for(;high<s.length();high++){
            count[s.charAt(high)]++;
            while(!judge(count)){
                count[s.charAt(low)]--;
                low++;

            }
            longest=Math.max(longest,high-low+1);
        }
        return longest;
    }
    public boolean judge(int[] count){
        for(int num:count){
            if(num>1){
                return false;
            }
        }
        return true;
    }
}
