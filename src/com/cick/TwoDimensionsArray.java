package com.cick;

import java.util.Scanner;

public class TwoDimensionsArray {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        int[][] arr = new int [6][6];

        for (int i = 0 ; i < arr.length ; i++) {
            for (int j = 0 ; j < arr.length ; j++) {
                arr[i][j] = userInput.nextInt();
                if (arr[i][j] < -9 || arr[i][j] > 9) {
                    userInput.close();
                    return;
                }
            }
        }
        TwoDimensionsArray tda = new TwoDimensionsArray();
        System.out.println(tda.hourGlasses(arr));
        userInput.close();
    }
    public int hourGlasses(int[][] arr) {
        int biggestSum = -63;
        int baris = 0; int kolom = 0;
        int subBaris = 1;
        int center = 1;
        for (int i = 0 ; i < 16 ; i++) {
            int total = 0;
            for (int j = baris ; j < baris+3 ; j++) {
                for (int k = kolom ; k < kolom+3 ; k++) {
                    total += arr[j][k];
                    if(j == center && subBaris != k) {
                        total -= arr[j][k];
                    }
                }
            }
            if (total > biggestSum) {
                biggestSum = total;
            }
            kolom++;
            subBaris++;
            if (i == 3 || i == 7 || i == 11) {
                baris++;
                kolom = 0;
                center++;
                subBaris = 1;
            }
        }
        return biggestSum;
    }
}