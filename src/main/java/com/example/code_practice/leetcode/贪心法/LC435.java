package com.example.code_practice.leetcode.贪心法;

import java.util.Arrays;

public class LC435 {
    public int eraseOverlapIntervals(int[][] intervals) {
        Arrays.sort(intervals,(a,b) -> Integer.compare(a[0],b[0]));
        int count=0;
        for(int i=1; i<intervals.length; i++){
            //与前一个区间重叠时
            if(intervals[i][0]<intervals[i-1][1]){
                count++;
                intervals[i][1] = Math.max(intervals[i][1],intervals[i-1][1]);
            }
        }
        return count;
    }
}
