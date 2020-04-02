package com.cick;

import java.util.Scanner;

public class StdinStdout_2 {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        int i = userInput.nextInt();
        double d = userInput.nextDouble();
        userInput.nextLine();
        String s = userInput.nextLine();

        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int : " + i);

        userInput.close();
    }
}