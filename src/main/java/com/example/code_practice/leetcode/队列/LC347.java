package com.example.code_practice.leetcode.队列;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class LC347 {
    //基于大顶堆实现
    public int[] topKFrequent(int[] nums, int k) {
        //1 统计数字频次
        Map<Integer,Integer> map=new HashMap<>();
        for(int num:nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        //2 入队排序
        PriorityQueue<int[]> priorityQueue=new PriorityQueue<>((element1,element2)->element2[1]-element1[1]);
        for(Map.Entry<Integer,Integer> entry:map.entrySet()){
            priorityQueue.add(new int[]{entry.getKey(), entry.getValue()});
        }
        //3 取前k大元素
        int[] res=new int[k];
        for(int i=0;i<k;i++){
            res[i]=priorityQueue.remove()[0];
        }
        return res;
    }

    //基于小顶堆实现
    public int[] topKFrequent1(int[] nums, int k) {
        //1 统计数字频次
        Map<Integer,Integer> map=new HashMap<>();
        for(int num:nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        //2 入队排序
        PriorityQueue<int[]> priorityQueue=new PriorityQueue<>((element1,element2)->element1[1]-element2[1]);
        for(Map.Entry<Integer,Integer> entry:map.entrySet()){
            if(priorityQueue.size()<k){
                priorityQueue.add(new int[]{entry.getKey(), entry.getValue()});
            }else if(entry.getValue()>priorityQueue.peek()[1]){
                priorityQueue.remove();
                priorityQueue.add(new int[]{entry.getKey(), entry.getValue()});
            }
        }
        //3 取前k大元素
        int[] res=new int[k];
        for(int i=k-1;i>=0;i--){
            res[i]=priorityQueue.remove()[0];
        }
        return res;
    }

    public static void main(String[] args) {

    }
}
