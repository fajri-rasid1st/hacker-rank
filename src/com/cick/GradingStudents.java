package com.cick;

import java.util.Scanner;

public class GradingStudents {
    static Scanner userInput = new Scanner(System.in);
    public static void main(String[] args) {
        int totalStudent = userInput.nextInt();

        int[] arr = new int[totalStudent];

        for (int i = 0 ; i < totalStudent ; i++) {
            arr[i] = userInput.nextInt();
        }
        for (int i = 0 ; i < totalStudent ; i++) {
            if (arr[i] >= 38) {
                if ((arr[i] + 1) % 5 == 0) {
                    System.out.println(arr[i] + 1);
                    continue;
                }
                if ((arr[i] + 2) % 5 == 0) {
                    System.out.println(arr[i] + 2);
                    continue;
                }
                if ((arr[i] + 1) % 5 != 0 || (arr[i] + 2) % 5 != 0) {
                    System.out.println(arr[i]);
                    continue;
                }
            }else {
                System.out.println(arr[i]);
            }
        }
    }
}