package com.problemsolving;

import java.lang.ArithmeticException;

class Tested {
    public int getDigits(int n, int m) {
        int uniqueDigit = 0;
        while (n > 0) {
            try {
                int totalDigit = 0;
                totalDigit = n % 10;
                n = n / 10;
                if (m % totalDigit == 0) {
                    uniqueDigit++;
                }
            } catch (ArithmeticException ae) {
                System.out.print("");
            }
        }
        return uniqueDigit;
    }
}

public class FindDigit {
    public static void main(String[] args) {
        java.util.Scanner userInput = new java.util.Scanner(System.in);

        int t = userInput.nextInt();

        for (int i = 0; i < t; i++) {
            int n = userInput.nextInt();
            int m = n;

            Tested ts = new Tested();
            int result = ts.getDigits(n, m);
            System.out.println(result);
        }
        userInput.close();
    }
}