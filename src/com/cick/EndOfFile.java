package com.cick;

import java.util.*;

public class EndOfFile {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        int i = 1;

        while (userInput.hasNext()) {
            String sentence = userInput.nextLine();
            System.out.println(i + " " + sentence);
            i++;
        }
        userInput.close();
    }
}