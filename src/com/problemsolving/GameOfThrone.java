package com.problemsolving;

import java.util.Arrays;
import java.util.Scanner;

public class GameOfThrone {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();
        String[] sSorting = s.split("");
        Arrays.sort(sSorting);

        if (arrangedToPalindrome(sSorting)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

        sc.close();
    }

    private static boolean arrangedToPalindrome(String s[]) {
        int oddWord = 0;
        int check = 1;
        for (int i = 0; i < s.length - 1; i++) {
            if (s[i].equals(s[i + 1])) {
                check++;
            } else {
                if (check % 2 == 1) {
                    oddWord++;
                }
                check = 1;
            }
        }
        if (oddWord > 1) {
            return false;
        } else {
            return true;
        }
    }
}