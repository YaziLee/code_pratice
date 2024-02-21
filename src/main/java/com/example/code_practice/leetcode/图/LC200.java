package com.example.code_practice.leetcode.图;

import java.util.LinkedList;
import java.util.Queue;

public class LC200 {
    boolean[][] visited;
    int[][] derections=new int[][]{{0, 1}, {0, -1}, {1, 0}, {-1, 0}};
    public int numIslands(char[][] grid) {
        visited=new boolean[grid.length][grid[0].length];
        int res=0;
        for(int i=0;i< grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]=='1'&&!visited[i][j]){
                    bfs(grid,i,j);
                    res++;
                }
            }
        }
        return res;
    }

    public void bfs(char[][] grid, int x, int y){
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{x,y});
        visited[x][y]=true;
        while(!queue.isEmpty()){
            int[] pos= queue.remove();
            for(int[] der:derections){
                int x1=pos[0]+der[1];
                int y1=pos[1]+der[0];
                if(x1==grid.length||x1<0||y1<0||y1==grid[0].length) continue;
                if(grid[x1][y1]=='1'&&!visited[x1][y1]){
                    queue.add(new int[]{x1,y1});
                    visited[x1][y1]=true;
                }
            }
        }
    }
}
