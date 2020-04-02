package com.cick;

import java.util.Scanner;

public class Staircase {
    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);

        int totalInput = userInput.nextInt();
        int sum = 1;

        // rectangle height
        for (int i = 1; i <= totalInput; i++) {

            // print space
            for (int k = totalInput - i; k > 0; k--) {
                System.out.print(" ");
            }

            // print hashtag
            for (int j = 1; j <= sum; j++) {
                System.out.print("#");
            }
            sum += 1;
            System.out.print("\n");
        }
        userInput.close();
    }
}