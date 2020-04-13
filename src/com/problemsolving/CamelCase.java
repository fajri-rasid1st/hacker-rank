package com.problemsolving;

import java.util.Scanner;

public class CamelCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();

        System.out.println(getTotalWords(s));
        sc.close();
    }

    private static int getTotalWords(String s) {
        int totalWords = 1;

        for (int i = 0; i < s.length(); i++) {
            if (s.codePointAt(i) > 64 && s.codePointAt(i) < 91) {
                totalWords++;
            }
        }
        return totalWords;
    }
}