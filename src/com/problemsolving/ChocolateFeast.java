package com.problemsolving;

import java.util.Scanner;

public class ChocolateFeast {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        for (int tItr = 0; tItr < t; tItr++) {
            int n = scanner.nextInt();
            int c = scanner.nextInt();
            int m = scanner.nextInt();

            int totalChoc = n / c;
            int totalWrappers = totalChoc;
            int freeChocs = 0;
            while (m <= totalWrappers) {
                int wrapperTogive = totalWrappers - (totalWrappers % m);

                freeChocs = totalWrappers / m;

                totalWrappers = (totalWrappers - wrapperTogive) + freeChocs;

                totalChoc += freeChocs;
            }
            System.out.println(totalChoc);
        }
        scanner.close();
    }
}