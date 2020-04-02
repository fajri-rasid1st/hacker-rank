package com.cick;

import java.util.Scanner;
import java.util.Arrays;

public class BirthdayCakeCandles {
    // TallestCandles
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        int totalIndex = userInput.nextInt();
        userInput.close();
        if (totalIndex < 1 || totalIndex > Math.pow(10, 5)) {
            return;
        }

        int[] arr = new int[totalIndex];
        for (int i = 0; i < totalIndex; i++) {
            arr[i] = userInput.nextInt();
        }
        Arrays.sort(arr);
        int tallestNumber = arr[totalIndex - 1];
        int totalTallestNumber = 0;
        for (int i = 0; i < totalIndex; i++) {
            if (arr[i] == tallestNumber) {
                totalTallestNumber++;
            }
        }
        System.out.print(totalTallestNumber);
    }
}