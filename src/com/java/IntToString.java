package com.java;

import java.util.Scanner;

public class IntToString {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        int n = userInput.nextInt();
        if (n < -100 || n > 100) {
            userInput.close();
            return;
        }
        String s = Integer.toString(n);
        if (n == Integer.parseInt(s)) {
            System.out.println("Good job");
        } else {
            System.out.println("Wrong answer");
        }
        userInput.close();
    }
}