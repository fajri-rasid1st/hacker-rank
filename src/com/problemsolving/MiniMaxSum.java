package com.problemsolving;

import java.util.Scanner;
import java.util.Arrays;

public class MiniMaxSum {
    // Sum max and min
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        int[] arr = new int[5];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = userInput.nextInt();
        }
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        long minSum = 0;
        long maxSum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (i >= 0 && i <= 3) {
                minSum += arr[i];
            }
            if (i > 0 && i < arr.length) {
                maxSum += arr[i];
            }
        }
        System.out.print(minSum + " " + maxSum);

        userInput.close();
    }
}