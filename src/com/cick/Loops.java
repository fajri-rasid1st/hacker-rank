package com.cick;

import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        int n = userInput.nextInt();

        if (n < 2 || n > 20) {
            userInput.close();
            return;
        }
        for (int i = 1 ; i <= 10 ; i++) {
            System.out.println(n + " x " + i + " = " + (n*i));
        }
        userInput.close();
    }
}