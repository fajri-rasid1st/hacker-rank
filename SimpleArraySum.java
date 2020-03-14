package com.cick;

import java.util.Scanner;

public class SimpleArraySum {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        int totalInput = userInput.nextInt();
        int sum = 0;
        int[] array = new int[totalInput];

        for (int i = 0; i < totalInput; i++) {
            array[i] = userInput.nextInt();
            if (array[i] <= 0 || array[i] > 1000) {
                break;
            }
            sum += array[i];
        }
        System.out.println(sum);
        userInput.close();
    }
}