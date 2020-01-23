package com.cick;

import java.util.Scanner;

public class PlusMinus {
    static Scanner userInput = new Scanner(System.in);
    public static void main(String[] args) {
        int totalIndex = userInput.nextInt();
        if (totalIndex < 1 || totalIndex > 100) {
            return;
        }
        int []arr = new int[totalIndex];

        int positive = 0, negative = 0,zero = 0;
        for (int i = 0 ; i < totalIndex ; i++) {
            arr[i] = userInput.nextInt();
            if (arr[i] < -100 || arr[i] > 100) {
                return;
            }
            else if (arr[i] > 0) {
                positive++;
            }else if (arr[i] < 0) {
                negative++;
            }else {
                zero++;
            }
        }
        System.out.printf("%.6f\n",(double)positive/totalIndex);
        System.out.printf("%.6f\n",(double)negative/totalIndex);
        System.out.printf("%.6f\n",(double)zero/totalIndex);
    }
}