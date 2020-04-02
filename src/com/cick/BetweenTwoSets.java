package com.cick;

import java.util.Scanner;

public class BetweenTwoSets {
    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);

        int m = userInput.nextInt();
        int n = userInput.nextInt();

        int a[] = new int[m];
        int b[] = new int[n];

        for (int i = 0; i < m; i++) {
            a[i] = userInput.nextInt();
        }
        for (int i = 0; i < n; i++) {
            b[i] = userInput.nextInt();
        }

        int result = getTotalX(a, b);
        System.out.println(result);

        userInput.close();
    }

    static int getTotalX(int a[], int b[]) {

        int x = 1, y = 0, z = 0, count = 0;
        int[] c = new int[101];

        for (x = 1; x < 101; x++) {
            int factor = 0;
            for (int i = 0; i < a.length; i++) {
                if (x % a[i] == 0 && x >= a[i]) {
                    factor++;
                }
            }
            if (factor == a.length) {
                c[z] = x;
                y++;
                z++;
            }
        }
        for (z = 0; z < y; z++) {
            int factor = 0;
            for (int i = 0; i < b.length; i++) {
                if (b[i] % c[z] == 0) {
                    factor++;
                }
            }
            if (factor == b.length) {
                count++;
            }
        }
        return count;
    }
}