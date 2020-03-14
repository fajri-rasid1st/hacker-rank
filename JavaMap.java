package com.cick;

import java.util.HashMap;
import java.util.Scanner;

public class JavaMap {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        int n = userInput.nextInt();
        userInput.nextLine();

        HashMap<String, Integer> phoneBook = new HashMap<String, Integer>(n);

        for (int i = 0; i < n; i++) {
            String name = userInput.nextLine();
            int number = userInput.nextInt();
            phoneBook.put(name, number);
            userInput.nextLine();
        }
        while (userInput.hasNext()) {
            String s = userInput.nextLine();
            if (phoneBook.containsKey(s)) {
                System.out.println(s + "=" + phoneBook.get(s));
            } else {
                System.out.println("Not found");
            }
        }
        userInput.close();
    }
}