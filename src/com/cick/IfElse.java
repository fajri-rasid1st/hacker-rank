package com.cick;

import java.util.Scanner;

public class IfElse {
    public static void main(String[] args) {
        Scanner userInput = new Scanner (System.in);

        int n = userInput.nextInt();
        if (n < 1 || n > 100) {
            userInput.close();
            return;
        }
        
        if (n % 2 == 1) {
            System.out.println("Weird");
        }else if (n % 2 == 0) {
            if (n >= 2 && n <= 5) {
                System.out.println("Not Weird");
            }else if (n >= 6 && n <= 20) {
                System.out.println("Weird");
            }else if (n > 20) {
                System.out.println("Not Weird");
            }
        }
        userInput.close();
    }
}