package com.problemsolving;

public class DivisibleSumsPair {
    public static void main(String[] args) {
        java.util.Scanner userInput = new java.util.Scanner(System.in);

        int n = userInput.nextInt();
        int k = userInput.nextInt();
        if (n > 100 || n < 2) {
            userInput.close();
            return;
        }
        if (k > 100 || k < 1) {
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
        int result = divisibleSumPair(n, k, arr);
        System.out.println(result);

        userInput.close();
    }

    public static int divisibleSumPair(int n, int k, int[] arr) {
        int result = 0;
        int l = 0;
        for (int i = 0; i < n - 1; i++) {
            for (int j = l; j < n - 1; j++) {
                if ((arr[l] + arr[j + 1]) % k == 0) {
                    result++;
                }
            }
            l++;
        }
        return result;
    }
}