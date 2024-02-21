package com.example.code_practice.leetcode.回溯法;

import java.util.ArrayList;
import java.util.List;

public class LC39 {
    /*
    List<List<Integer>> result = new ArrayList<>();
    List<Integer> path = new ArrayList<>();
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        helper(candidates, 0,target, 0);
        return result;
    }

    public void helper(int[] candidates, int sum, int target, int index){
        if(target==0){
            result.add(path);
            return;
        }
        for(int i = index; i < candidates.length; i++){
            if(candidates[index]+sum>target) break;
            path.add(candidates[i]);
            helper(candidates, candidates[index]+sum,target, index++);
            path.remove(path.size()-1);
        }
    }
     */
    List<List<Integer>> result = new ArrayList<>();
    List<Integer> path = new ArrayList<>();
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        helper(candidates, target, 0);
        return result;
    }

    public void helper(int[] candidates, int target, int index){
        if(target==0){
            result.add(new ArrayList<>(path));
            return;
        }
        if(index<candidates.length && target>0){
            path.add(candidates[index]);
            helper(candidates, target-candidates[index], index);
            path.remove(path.size()-1);
            helper(candidates, target, index+1);
        }
    }



}
