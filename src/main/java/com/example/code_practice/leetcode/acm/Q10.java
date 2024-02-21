package com.example.code_practice.leetcode.acm;

import java.util.Scanner;

public class Q10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int m = scanner.nextInt();
            int k = scanner.nextInt();
            if(m==0&&k==0){
                break;
            }
            int sum = m;
            int reward=m/k;
            sum+=reward;
            int remian=reward+m%k;
            while(remian>=k){
                reward=remian/k;
                sum+=reward;
                remian=reward+remian%k;
            }
            System.out.println(sum);
        }
        scanner.close();
    }
}
