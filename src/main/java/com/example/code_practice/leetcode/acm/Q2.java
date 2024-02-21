package com.example.code_practice.leetcode.acm;

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNextLine()){
            int n= scanner.nextInt();
            while(n>0){
                n--;
                while(scanner.hasNext()){
                    int sum=0;
                    int m= scanner.nextInt();
                    while (m>0){
                        m--;
                        sum+= scanner.nextInt();
                    }
                    System.out.println(sum);
                    if(n>0){
                        System.out.println();
                    }
                }
            }
        }
        scanner.close();
    }
}
