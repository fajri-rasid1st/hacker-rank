package com.problemsolving;

import java.util.Scanner;

public class RepeatedString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        long n = sc.nextLong();

        RepeatedString repeat = new RepeatedString();
        System.out.println(repeat.repeatedString(s, n));
        sc.close();
    }

    private long repeatedString(String s, long n) {
        long a = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'a') {
                a++;
            }
        }
        long div = n / s.length();
        long mod = n % s.length();
        a *= div;

        for (int i = 0; i < mod; i++) {
            if (s.charAt(i) == 'a') {
                a++;
            }
        }
        return a;
    }
}