package com.cick;

import java.util.Scanner;

public class Pangrams {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine().toLowerCase();
        String allWords = "abcdefghijklmnopqrstuvwxyz";

        int totalSentence = s.length();
        int totalWords = 0;
        int index = 0;

        while (totalSentence > 0) {

            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == allWords.charAt(index)) {
                    totalWords++;
                    index++;
                    break;
                }
            }

            if (index == 26) {
                break;
            }
            totalSentence--;
        }

        if (totalWords >= 26) {
            System.out.println("pangram");
        } else {
            System.out.println("not pangram");
        }

        sc.close();
    }
}