package com.example.code_practice.leetcode.回溯法;

import java.util.ArrayList;
import java.util.List;

public class LC131 {
    List<List<String>> result = new ArrayList<>();
    List<String> path = new ArrayList<>();
    public List<List<String>> partition(String s) {
        helper(s, 0);
        return result;
    }

    public void helper(String s, int index){
        if(index == s.length()){
            result.add(new ArrayList<>(path));
            return;
        }
        for(int i=index; i<s.length(); i++){
            if(isP(s, index, i)){
                path.add(s.substring(index, i+1));
                helper(s, i + 1);
                path.remove(path.size() - 1);
            }
        }
    }

    public boolean isP(String s, int start, int end){
        while(start<end){
            if(s.charAt(start)!=s.charAt(end)){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}
