package com.example.code_practice.leetcode.图;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LC797 {
    List<List<Integer>> res = new ArrayList<>();
    List<Integer> path = new LinkedList<>();
    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        path.add(0);
        dfs(graph,0);
        return res;
    }

    public void dfs(int[][] graph, int index){
        if(index== graph.length-1){
            res.add(new ArrayList<>(path));
            return;
        }
        for(int i:graph[index]){
            path.add(i);
            dfs(graph,i);
            path.remove(path.size()-1);
        }
    }
}
