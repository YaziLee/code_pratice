package com.example.code_practice.leetcode.回溯法;

import java.util.ArrayList;
import java.util.List;

public class LC216 {
    List<List<Integer>> result = new ArrayList<>();
    List<Integer> path = new ArrayList<>();
    public List<List<Integer>> combinationSum3(int k, int n) {
        helper(k,n,1);
        return result;
    }

    public void helper(int k, int n, int index){
        if(path.size()==k && n==0){
            result.add(new ArrayList<>(path));
            return;
        }
        if(n>0){
            for(int i=index; i<=9; i++){
                path.add(i);
                helper(k,n-i, i+1);
                path.remove(path.size()-1);
            }
        }
    }
}
