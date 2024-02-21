package com.example.code_practice.leetcode.回溯法;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class LC47 {
    List<List<Integer>> result = new LinkedList<>();
    List<Integer> path = new LinkedList<>();
    boolean[] used;

    public List<List<Integer>> permuteUnique(int[] nums) {
        Arrays.sort(nums);
        used = new boolean[nums.length];
        helper(nums);
        return result;
    }

    public void helper(int[] nums) {
        if (path.size() == nums.length) {
            result.add(new ArrayList<>(path));
            return;
        }
        for (int i = 0; i < nums.length; i++) {
            if (i > 0 && nums[i - 1] == nums[i] && used[i-1]==false) {
                continue;
            }
            if (used[i]==false) {
                used[i] = true;
                path.add(nums[i]);
                helper(nums);
                path.remove(path.size() - 1);
                used[i] = false;
            }

        }

    }
}
