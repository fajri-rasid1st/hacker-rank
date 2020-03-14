package com.cick;

import java.util.Scanner;

public class BreakingRecord {
    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);

        int n = userInput.nextInt();
        if (n > 1000 || n < 1) {
            userInput.close();
            return;
        }
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = userInput.nextInt();
            if (arr[i] > 100000000 || arr[i] < 0) {
                userInput.close();
                return;
            }
        }

        int[] total = breakingRecord(arr);
        for (int i = 0; i < total.length; i++) {
            System.out.print(total[i] + " ");
        }

        userInput.close();
    }

    public static int[] breakingRecord(int[] scores) {

        int high = 0, low = 0;
        int lowestScore = scores[0];
        int highestScore = scores[0];

        for (int i = 0; i < scores.length; i++) {
            int score = scores[i];
            if (score < lowestScore) {
                low++;
                lowestScore = scores[i];
            } else if (score > highestScore) {
                high++;
                highestScore = scores[i];
            }
        }
        int[] total = { high, low };
        return total;
    }
}