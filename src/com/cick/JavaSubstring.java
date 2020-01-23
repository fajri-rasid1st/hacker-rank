package com.cick;

import java.util.*;

public class JavaSubstring {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        String s = userInput.next();
        int start = userInput.nextInt();
        int end = userInput.nextInt();
        userInput.close();
        System.out.println(s.substring(start, end));
    }
}