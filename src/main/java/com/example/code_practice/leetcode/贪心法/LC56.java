package com.example.code_practice.leetcode.贪心法;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LC56 {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals,(a,b)->Integer.compare(a[0],b[0]));
        List<int[]> res=new ArrayList<>();
        int pre=intervals[0][1];
        int k=0;
        for(int i=1;i<intervals.length;i++){
            if(pre>=intervals[i][0]){
                pre=Math.max(pre,intervals[i][1]);
            }else{
                res.add(new int[]{intervals[k][0],pre});
                k=i;
                pre=intervals[i][1];
            }
        }
        res.add(new int[]{intervals[k][0],pre});
        return res.toArray(new int[res.size()][]);
    }
}
