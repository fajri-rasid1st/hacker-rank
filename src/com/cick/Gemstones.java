package com.cick;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Gemstones {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        Set<Character> set = gems(sc.next());

        for (int i = 1; i < n; i++) {
            set.retainAll(gems(sc.next()));
        }
        System.out.println(set.size());

        sc.close();
    }

    private static Set<Character> gems(String s) {

        Set<Character> words = new HashSet<Character>();

        for (Character c : s.toCharArray()) {
            words.add(c);
        }
        return words;
    }
}