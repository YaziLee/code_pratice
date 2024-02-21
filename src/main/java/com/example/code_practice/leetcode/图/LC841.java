package com.example.code_practice.leetcode.图;

import java.util.List;

public class LC841 {
    boolean[] visited;
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        visited = new boolean[rooms.size()];
        dfs(rooms,0);
        for(boolean visit:visited){
            if(visit==false){
                return false;
            }
        }
        return true;
    }

    public void dfs(List<List<Integer>> rooms,int i){
        visited[i]=true;
        for(int adj:rooms.get(i)){
            if(visited[adj]==false){
                dfs(rooms,adj);
            }
        }
    }
}
