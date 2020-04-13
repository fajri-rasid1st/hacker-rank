package com.problemsolving;

import java.util.Scanner;

public class SequenceEquation {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        int n = Integer.parseInt(userInput.nextLine());
        int[] p = new int[n];
        for (int i = 0; i < n; i++) {
            p[i] = userInput.nextInt();
        }

        SequenceEquation se = new SequenceEquation();
        int[] result = se.permutationEquation(p);
        for (int i = 0; i < n; i++) {
            System.out.print(result[i] + "\n");
        }

        userInput.close();
    }

    public int[] permutationEquation(int[] p) {
        int[] value = new int[p.length];
        int idx = 0;
        for (int i = 0; i < p.length; i++) {
            for (int j = 0; j < p.length; j++) {
                if (i + 1 == p[j]) {
                    int seq = j + 1;
                    for (int k = 0; k < p.length; k++) {
                        if (seq == p[k]) {
                            value[idx] = k + 1;
                            idx++;
                        }
                    }
                }
            }
        }
        return value;
    }
}