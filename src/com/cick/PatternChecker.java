package com.cick;

import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

public class PatternChecker {
    public static void main(String[] args) {
        java.util.Scanner userInput = new java.util.Scanner(System.in);

        int testCases = Integer.parseInt(userInput.nextLine());

        while (testCases > 0) {
            String pattern = userInput.nextLine();
            try {
                Pattern.compile(pattern);
                System.out.println("Valid");
            } catch (PatternSyntaxException pse) {
                System.out.println("Invalid");
            }
            testCases--;
        }
        userInput.close();
    }
}