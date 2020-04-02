package com.cick;

import java.util.Scanner;

public class BeautifulDaysMovies {
    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);

        int i = userInput.nextInt(), j = userInput.nextInt(), k = userInput.nextInt();
        if (i < 1 || i > 2 * (Math.pow((double) 10, (double) 6))) {
            userInput.close();
            return;
        }
        if (j < i || j > 2 * (Math.pow((double) 10, (double) 6))) {
            userInput.close();
            return;
        }
        if (k < 1 || k > 2 * (Math.pow((double) 10, (double) 9))) {
            userInput.close();
            return;
        }
        BeautifulDaysMovies bdm = new BeautifulDaysMovies();
        System.out.print(bdm.BeautifulDays(i, j, k));
        userInput.close();
    }

    int BeautifulDays(int firstDay, int lastDay, int divisor) {
        int totalDays = 0;
        for (int i = firstDay; i <= lastDay; i++) {
            int reverse = 0;
            int n = i;
            while (n != 0) {
                reverse = reverse * 10;
                reverse = reverse + (n % 10);
                n = n / 10;
            }
            if ((i - Math.abs(reverse)) % divisor == 0) {
                totalDays++;
            }
        }
        return totalDays;
    }
}