package com.cick;

import java.util.Arrays;
import java.util.Scanner;

public class SockMerchant {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        int n = userInput.nextInt();
        if (n > 100 || n < 1) {
            userInput.close();
            return;
        }
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = userInput.nextInt();
            if (arr[i] > 100 || arr[i] < 1) {
                userInput.close();
                return;
            }
        }
        int result = sockMerchant(n, arr);
        System.out.println(result);
        userInput.close();
    }

    static int sockMerchant(int n, int[] arr) {
        Arrays.sort(arr);
        int total = 0;
        int arrSum = 0;
        for (int i = 0; i < arr.length; i += arrSum) {
            if (i != arr.length - 1) {
                if (arr[i] == arr[i + 1]) {
                    total++;
                    arrSum = 2;
                } else {
                    arrSum = 1;
                }
            } else if (i == arr.length - 1 && i != 0) {
                if (arr[i] == arr[i - 1]) {
                    if (arr[i] == arr[i - 2]) {
                        continue;
                    } else {
                        total++;
                    }
                }
            } else {
                break;
            }
        }
        return total;
    }
}