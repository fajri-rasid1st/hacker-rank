package com.problemsolving;

import java.util.Scanner;

public class MinimumDistance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        MinimumDistance md = new MinimumDistance();
        System.out.println(md.getDistance(a));

        sc.close();
    }

    private int getDistance(int[] a) {
        int minimum = Integer.MAX_VALUE;
        int getMinus = minimum;
        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] == a[j]) {
                    if (Math.abs(j - i) < minimum) {
                        minimum = j - i;
                    }
                }
            }
        }
        if (minimum == getMinus) {
            return -1;
        } else {
            return minimum;
        }
    }
}