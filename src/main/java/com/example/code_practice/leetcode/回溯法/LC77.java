package com.example.code_practice.leetcode.回溯法;

import java.util.ArrayList;
import java.util.List;

public class LC77 {
    List<List<Integer>> result = new ArrayList<>();
    public List<List<Integer>> combine(int n, int k) {
        helper(new ArrayList<>(), n,1,k);
        return result;
    }

    public void helper(List<Integer> path,int n, int index,int k){
        if(path.size() == k){
            result.add(path);
            return;
        }
        if(index<=n){
            path.add(index);
            helper(new ArrayList<>(path),n,index+1,k);
            path.remove(path.size()-1);
            helper(new ArrayList<>(path),n,index+1,k);
        }
    }
}
