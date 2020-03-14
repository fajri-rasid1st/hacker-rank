package com.cick;

public class BirthdayChocolate {
    public static void main(String[] args) {

        java.util.Scanner userInput = new java.util.Scanner(System.in);

        int n = userInput.nextInt();
        if (n > 100 || n < 1) {
            userInput.close();
            return;
        }

        int[] s = new int[n];
        for (int i = 0; i < n; i++) {
            s[i] = userInput.nextInt();
            if (s[i] > 5 || s[i] < 1) {
                userInput.close();
                return;
            }
        }

        int d = userInput.nextInt();
        if (d > 31 || d < 1) {
            userInput.close();
            return;
        }
        int m = userInput.nextInt();
        if (m > 12 || d < 1) {
            userInput.close();
            return;
        }

        birthDay(d, m, s);
        userInput.close();
    }

    static void birthDay(int d, int m, int[] s) {
        int result = 0;
        int k = 0;
        int l = m;
        for (int i = m; i <= s.length; i++) {
            int totalChocolate = 0;
            for (int j = k; j < l; j++) {
                totalChocolate += s[j];
            }
            k++;
            l++;
            if (totalChocolate == d) {
                result++;
            }

        }
        System.out.println(result);
    }
}