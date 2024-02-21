package com.example.code_practice.leetcode.动态规划;

public class LC32 {
    public int longestValidParentheses(String s) {
        int len=s.length();
        int max=0;
        int[][] dp=new int[len][len];
        for(int i=len-1; i>=0; i--){
            for(int j=i+1; j<len; j++){
                if(s.charAt(i)=='(' && s.charAt(j)==')'){
                    dp[i][j]=dp[i+1][j-1]+2;
                }else{
                    dp[i][j]=Math.max(dp[i+1][j],Math.max(dp[i][j-1],dp[i][j]));
                }
                max=Math.max(max,dp[i][j]);
            }
        }
        return max;
    }
}
