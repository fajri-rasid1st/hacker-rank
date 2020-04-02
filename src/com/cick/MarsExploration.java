package com.cick;

import java.util.Scanner;

public class MarsExploration {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();

        String sos = "SOS";
        int word = 0;
        int alteredLetter = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != sos.charAt(word)) {
                alteredLetter++;
            }

            if (word % 2 == 0 && word != 0) {
                word = 0;
            } else {
                word++;
            }
        }
        System.out.println(alteredLetter);
        sc.close();
    }
}