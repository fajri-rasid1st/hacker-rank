package com.cick;

import java.util.Scanner;

public class DiagonalDifference {
    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);

        int ordo = userInput.nextInt();
        int[][] array = new int[ordo][ordo];
        int sumDiagonal1 = 0;
        int sumDiagonal2 = 0;

        for (int i = 0; i < ordo; i++) {
            for (int j = 0; j < ordo; j++) {
                array[i][j] = userInput.nextInt();
                if (array[i][j] < -100 || array[i][j] > 100) {
                    break;
                }
            }
        }
        for (int i = 0; i < ordo; i++) {
            for (int j = 0; j < ordo; j++) {
                if (i == j) {
                    sumDiagonal1 += array[i][j];
                }
            }
        }
        for (int i = 0; i < ordo; i++) {
            for (int j = 0; j < ordo; j++) {
                if (i + j == array.length - 1) {
                    sumDiagonal2 += array[i][j];
                }
            }
        }
        System.out.println(Math.abs(sumDiagonal1 - sumDiagonal2));

        userInput.close();
    }
}