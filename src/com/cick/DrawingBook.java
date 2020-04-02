package com.cick;

import java.util.Scanner;

public class DrawingBook {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        int n = userInput.nextInt();
        int p = userInput.nextInt();
        if (n > Math.pow((double) 10, (double) 5) || n < 1) {
            userInput.close();
            return;
        }
        if (n % 2 == 0) {
            n = n + 1;
        }
        if (p > n || p < 1) {
            userInput.close();
            return;
        }
        int[] book = new int[n + 1];
        for (int i = 0; i < n + 1; i++) {
            book[i] = i;
        }

        int result = pageNumber(n, p, book);
        System.out.println(result);
        userInput.close();
    }

    static int pageNumber(int totalPage, int pageSearch, int[] book) {
        double pageTurn_1 = 0;
        double pageTurn_2 = 0;
        for (int i = 0; i < book.length; i++) {
            if (pageSearch % 2 == 1) {
                if (pageSearch == book[i]) {
                    break;
                } else {
                    pageTurn_1 += 0.5;
                }
            } else if (pageSearch % 2 == 0) {
                if (pageSearch == book[i]) {
                    break;
                } else {
                    pageTurn_1 += 0.5;
                }
            }
        }
        for (int i = book.length - 1; i >= 0; i--) {
            if (pageSearch % 2 == 1) {
                if (pageSearch == book[i]) {
                    break;
                } else {
                    pageTurn_2 += 0.5;
                }
            } else if (pageSearch % 2 == 0) {
                if (pageSearch == book[i]) {
                    break;
                } else {
                    pageTurn_2 += 0.5;
                }
            }
        }
        return (int) Math.min(pageTurn_1, pageTurn_2);
    }
}