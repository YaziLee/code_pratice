package com.example.code_practice.leetcode.回溯法;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class LC40 {
    List<List<Integer>> result = new LinkedList<>();
    List<Integer> path = new LinkedList<>();
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        helper(candidates, target, 0);
        return result;
    }

    public void helper(int[] candidates, int target, int index){
        if(target==0){
            result.add(new LinkedList<>(path));
            return;
        }
        if(index< candidates.length && target>0){
            path.add(candidates[index]);
            helper(candidates, target-candidates[index], index+1);
            path.remove(path.size()-1);
            helper(candidates, target, getNext(candidates, index));
        }
    }

    public int getNext(int[] candidates, int i){
        int next=i;
        while(next <  candidates.length && candidates[next] == candidates[i]){
            next++;
        }
        return next;
    }
}
