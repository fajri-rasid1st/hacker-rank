package com.cick;

public class SaveThePrisoner {

    static java.util.Scanner userInput = new java.util.Scanner(System.in);

    public static void main(String[] args) {
        int t = userInput.nextInt();
        if (t < 1 || t > 100) {
            userInput.close();
            return;
        }
        savePrisoner(t);
        userInput.close();
    }

    static void savePrisoner(int t) {
        for (int i = 0; i < t; i++) {
            int n = userInput.nextInt();
            if (n < 1 || n > Math.pow((double) 10, (double) 9)) {
                userInput.close();
                return;
            }
            int m = userInput.nextInt();
            if (m < 1 || m > Math.pow((double) 10, (double) 9)) {
                userInput.close();
                return;
            }
            int s = userInput.nextInt();
            if (s < 1 || s > n) {
                userInput.close();
                return;
            }
            int candiesTotal = 0;
            for (int j = s; j <= (n + 1); j++) {
                candiesTotal++;
                if (j == (n + 1) && candiesTotal != m) {
                    j = 1;
                } else if (j == n && candiesTotal == (m - 1) || j != n && candiesTotal == (m - 1)) {
                    System.out.println(j + 1);
                    break;
                }
            }
        }
    }
}