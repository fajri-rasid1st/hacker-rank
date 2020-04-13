package com.problemsolving;

import java.util.Scanner;

public class HackerRankString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int queries = sc.nextInt();

        while (queries != 0) {

            String s = sc.next();
            String hackerRank = "hackerrank";
            int index = 0;
            int totalSequence = 0;

            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == hackerRank.charAt(index)) {
                    totalSequence++;
                    index++;
                }

                if (index == 10) {
                    break;
                }
            }

            if (totalSequence >= 10) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
            queries--;
        }
        sc.close();
    }
}