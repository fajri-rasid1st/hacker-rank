package com.cick;

import java.util.Scanner;

public class JavaSubarray {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        int n = userInput.nextInt();
        if (n < 1 || n > 100) {
            userInput.close();
            return;
        }
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = userInput.nextInt();
            if (a[i] < (-10000) || a[i] > 10000) {
                userInput.close();
                return;
            }
        }
        JavaSubarray jsa = new JavaSubarray();
        System.out.println(jsa.negativeSubArray(a));

        userInput.close();
    }

    public int negativeSubArray(int[] array) {
        int total = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = i; j <= array.length; j++) {
                int isNegativeSum = 0;
                for (int k = i; k < j; k++) {
                    isNegativeSum += array[k];
                }
                if (isNegativeSum < 0) {
                    total++;
                }
            }
        }
        return total;
    }
}