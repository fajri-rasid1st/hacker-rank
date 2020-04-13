package com.problemsolving;

import java.util.Scanner;

public class CaesarChiper {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());
        String s = sc.nextLine();
        int k = sc.nextInt();

        if (n != s.length()) {
            sc.close();
            return;
        }
        CaesarChiper cc = new CaesarChiper();
        System.out.print(cc.getSentence(s, k));
        sc.close();
    }

    private String getSentence(String s, int k) {
        String newStr = "";
        for (int i = 0; i < s.length(); i++) {
            String caseLetter = s.substring(i, i + 1);
            if (caseLetter.codePointAt(0) > 96 && caseLetter.codePointAt(0) < 123) {
                if (k % 26 == 0) {
                    newStr = newStr + caseLetter;
                } else {
                    int m = k % 26;
                    if (caseLetter.codePointAt(0) + m <= 122) {
                        newStr = newStr + ((char) (caseLetter.codePointAt(0) + m));
                    } else {
                        newStr = newStr + ((char) (96 + m - ('z' - caseLetter.charAt(0))));
                    }
                }
            } else if (caseLetter.codePointAt(0) > 64 && caseLetter.codePointAt(0) < 91) {
                if (k % 26 == 0) {
                    newStr = newStr + caseLetter;
                } else {
                    int m = k % 26;
                    if (caseLetter.codePointAt(0) + m <= 90) {
                        newStr = newStr + ((char) (caseLetter.codePointAt(0) + m));
                    } else {
                        newStr = newStr + ((char) (64 + m - ('Z' - caseLetter.charAt(0))));
                    }
                }
            } else {
                newStr = newStr + caseLetter;
            }
        }
        return newStr;
    }
}