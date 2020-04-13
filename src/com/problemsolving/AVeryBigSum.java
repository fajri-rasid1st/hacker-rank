package com.problemsolving;

import java.util.Scanner;

public class AVeryBigSum {
    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);

        int a = Integer.MAX_VALUE;
        int totalInput = userInput.nextInt();

        if (totalInput < 1 || totalInput > 10) {
            userInput.close();
            return;
        }
        long[] arr1 = new long[totalInput];
        long result = 0;
        for (int i = 0; i < totalInput; i++) {
            arr1[i] = userInput.nextLong();
            if (arr1[i] < 0 || arr1[i] > a) {
                break;
            }
            result += arr1[i];
        }
        System.out.print(result);
        userInput.close();
    }
}