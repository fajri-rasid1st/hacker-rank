package com.java;

import java.util.Scanner;

public class Loops_2 {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        int t = userInput.nextInt();
        if (t < 0 || t > 500) {
            userInput.close();
            return;
        }

        int[] arr = new int[t * 3];
        for (int i = 0; i < t * 3; i += 3) {
            int a = userInput.nextInt();
            arr[i] = a;
            int b = userInput.nextInt();
            arr[i + 1] = b;
            int n = userInput.nextInt();
            arr[i + 2] = n;

            if (a < 0 || a > 50 || b < 0 || b > 50 || n < 1 || n > 15) {
                userInput.close();
                return;
            }
        }

        for (int i = 0; i < t * 3; i += 3) {
            int result = arr[i];
            for (int j = 0; j < arr[i + 2]; j++) {
                result += (Math.pow(2, j) * arr[i + 1]);
                System.out.print(result + " ");
            }
            System.out.println();
        }
        userInput.close();
    }
}