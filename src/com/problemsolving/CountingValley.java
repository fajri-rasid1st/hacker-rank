package com.problemsolving;

public class CountingValley {
    public static void main(String[] args) {

        java.util.Scanner userInput = new java.util.Scanner(System.in);

        int n = userInput.nextInt();
        String s = userInput.next();
        if (n < 2 || n > Math.pow((double) 10, (double) 6)) {
            userInput.close();
            return;
        }
        if (s.length() > n) {
            userInput.close();
            return;
        }
        System.out.println(countingValley(n, s));

        userInput.close();
    }

    public static int countingValley(int n, String s) {
        int totalValley = 0;
        int deepth = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'U') {
                deepth++;
            } else if (s.charAt(i) == 'D') {
                deepth--;
            }
            if (deepth == 0 && s.charAt(i) == 'U') {
                totalValley++;
            }
        }
        return totalValley;
    }
}