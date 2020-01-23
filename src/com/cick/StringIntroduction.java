package com.cick;

import java.util.Scanner;
import java.lang.String;

public class StringIntroduction {
    static Scanner userInput = new Scanner(System.in);
    public static void main(String[] args) {
        String a = userInput.next();
        String b = userInput.next();
        int c = a.codePointAt(0) - 32;
        int d = b.codePointAt(0) - 32;
        int stringLength = number(a, b);
        System.out.println(stringLength);
        condition(a, b);
        if (a.codePointAt(0) <= 122 && a.codePointAt(0) >= 97) {
            System.out.print((char)c + a.substring(1) + " " + (char)d + b.substring(1));
        }else {
            System.out.print(a + " " + b);
        }
    }
    static int number(String a, String b) {
        int stringLength = a.length() + b.length();
        return stringLength;
    }
    static void condition(String a, String b) {
        if (a.charAt(0) <= b.charAt(0)) {
            System.out.println("No");
        }else {
            System.out.println("Yes");
        }
        userInput.close();
    }
}