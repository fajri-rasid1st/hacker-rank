package com.cick;

import java.util.Arrays;

public class Anagram {

    static java.util.Scanner userInput = new java.util.Scanner(System.in);

    public static void main(String[] args) {
        String a = userInput.next();
        String b = userInput.next();

        boolean ret = isAnagram(a, b);

        System.out.println(ret ? "Anagrams" : "Not Anagrams");
        userInput.close();
    }

    static boolean isAnagram(String a, String b) {
        int total_1 = a.length();
        int total_2 = b.length();
        String c = a.toLowerCase();
        String d = b.toLowerCase();
        char[] sentence_1 = c.toCharArray();
        char[] sentence_2 = d.toCharArray();

        if (total_1 != total_2) {
            return false;
        }

        Arrays.sort(sentence_1);
        Arrays.sort(sentence_2);

        for (int i = 0; i < total_1; i++) {
            if (sentence_1[i] != sentence_2[i]) {
                return false;
            }
        }
        return true;
    }
}