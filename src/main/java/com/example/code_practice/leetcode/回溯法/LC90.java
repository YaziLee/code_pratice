package com.example.code_practice.leetcode.回溯法;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class LC90 {
    List<List<Integer>> result = new LinkedList<>();
    List<Integer> path = new LinkedList<>();
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        helper(nums, 0);
        return result;
    }

    public void helper(int[] nums, int index){
        if(index==nums.length){
            result.add(new LinkedList<>(path));
            return;
        }
        path.add(nums[index]);
        helper(nums, index+1);
        path.remove(path.size()-1);
        helper(nums, getNext(nums, index));
    }

    public int getNext(int[] candidates, int i){
        int next=i;
        while(next <  candidates.length && candidates[next] == candidates[i]){
            next++;
        }
        return next;
    }


}
