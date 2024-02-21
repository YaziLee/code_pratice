package com.example.code_practice.leetcode.图;

import java.util.*;

public class LC127 {

    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        Set<String> wordsSet = new HashSet<>(wordList);
        Map<String,Integer> map = new HashMap<>();
        if(endWord.length()==0||!wordList.contains(endWord)){
            return 0;
        }
        Deque<String> deque = new LinkedList<>();
        deque.offer(beginWord);
        map.put(beginWord,1);
        while(!deque.isEmpty()){
            String cur = deque.poll();
            int path= map.get(cur);
            for(int i=0; i < cur.length(); i++){
                char[] chars = cur.toCharArray();
                for(char c='a';c<='z';c++){
                    chars[i]=c;
                    String newWord = String.valueOf(chars);
                    if(newWord.equals(endWord)){
                        return path+1;
                    }
                    if(wordsSet.contains(newWord)&& !map.containsKey(newWord)){
                        map.put(newWord,path+1);
                        deque.offer(newWord);
                    }
                }
            }
        }
        return 0;

    }


}
