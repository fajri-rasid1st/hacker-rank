package com.problemsolving;

import java.util.Scanner;

public class FunnyString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int queries = Integer.parseInt(sc.next());

        while (queries > 0) {

            String s = sc.next();
            String reverse = "";
            int[] arrS = new int[s.length() - 1];
            int[] arrReverse = new int[s.length() - 1];
            int total = 0;

            for (int i = s.length() - 1; i > -1; i--) {
                reverse += s.charAt(i);
            }

            for (int i = 0; i < s.length() - 1; i++) {
                arrS[i] = Math.abs(s.codePointAt(i) - s.codePointAt(i + 1));
                arrReverse[i] = Math.abs(reverse.codePointAt(i) - reverse.codePointAt(i + 1));
            }

            for (int i = 0; i < arrS.length; i++) {
                if (arrS[i] == arrReverse[i]) {
                    total++;
                }
            }

            if (total == arrS.length) {
                System.out.println("Funny");
            } else {
                System.out.println("Not Funny");
            }
            queries--;
        }
        sc.close();
    }
}