package com.problemsolving;

import java.util.Arrays;

public class PickingNumbers {
    public static void main(String[] args) {

        java.util.Scanner userInput = new java.util.Scanner(System.in);

        int n = userInput.nextInt();
        int[] arr = new int[n];
        if (n < 2 || n > 100) {
            userInput.close();
            return;
        }
        for (int i = 0; i < n; i++) {
            arr[i] = userInput.nextInt();
            if (arr[i] < 1 || arr[i] >= 100) {
                userInput.close();
                return;
            }
        }
        System.out.println(pickingNumbers(n, arr));
        userInput.close();
    }

    static int pickingNumbers(int n, int[] arr) {
        Arrays.sort(arr);
        int totalArr = 1;
        int sum = 1;
        for (int i = 0; i < arr.length - 1; i++) {
            int totalNumber = 1;
            for (int j = i; j < arr.length - 1; j++) {
                if (Math.abs(arr[i] - arr[j + sum]) <= 1) {
                    totalNumber++;
                }
            }
            if (totalNumber > totalArr) {
                totalArr = totalNumber;
            }
        }
        return totalArr;
    }
}