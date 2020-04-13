package com.problemsolving;

import java.util.Scanner;

public class LoveLetter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int q = sc.nextInt();

        while (q > 0) {

            String s = sc.next();
            int length = s.length() / 2;
            int totalOperations = 0;

            for (int i = 0, j = s.length() - 1; i < length && j >= length; i++, j--) {
                totalOperations += Math.abs(s.codePointAt(i) - s.codePointAt(j));
            }
            System.out.println(totalOperations);
            q--;
        }
        sc.close();
    }
}