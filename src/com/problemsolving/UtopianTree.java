package com.problemsolving;

public class UtopianTree {
    public static void main(String[] args) {
        java.util.Scanner userInput = new java.util.Scanner(System.in);
        int t = userInput.nextInt();
        int[] n = new int[t];
        // constraints
        if (t < 1 || t > 10) {
            userInput.close();
            return;
        }
        for (int i = 0; i < t; i++) {
            n[i] = userInput.nextInt();
            if (n[i] < 0 || n[i] > 60) {
                userInput.close();
                return;
            }
        }
        int[] result = utopianTree(t, n);

        for (int j = 0; j < t; j++) {
            System.out.println(result[j]);
        }

        userInput.close();
    }

    static int[] utopianTree(int totalCase, int[] period) {

        int[] total = new int[totalCase];

        for (int i = 0; i < period.length; i++) {
            total[i] = 0;
            for (int j = 0; j <= period[i]; j++) {
                if (j % 2 == 0) {
                    total[i]++;
                } else if (j % 2 == 1) {
                    total[i] += total[i];
                }
            }
        }
        return total;
    }
}