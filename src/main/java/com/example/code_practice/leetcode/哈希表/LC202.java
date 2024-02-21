package com.example.code_practice.leetcode.哈希表;

import java.util.HashSet;
import java.util.Set;

public class LC202 {
    public boolean isHappy(int n) {
        Set<Integer> set=new HashSet<>();
        while(!set.contains(n)&&n!=1){
            set.add(n);
            n=compute(n);
        }
        return n==1;
    }
    public int compute(int n){
        int res=0;
        //从低位开始取数
        while(n>0){
            int temp=n%10;
            res+=temp*temp;
            n=n/10;
        }
        return res;
    }
}
