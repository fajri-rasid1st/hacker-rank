package com.cick;

import java.util.Scanner;
import java.util.Arrays;

public class TheHurdleRace {
    public static void main(String[] args) {
        
        Scanner userInput = new Scanner(System.in);
        int n = userInput.nextInt(), k = userInput.nextInt();
        int[] height = new int [n];

        if (n < 1 || n > 100) { userInput.close(); return; }
        if (k < 1 || k > 100) { userInput.close(); return; }
        for (int i = 0 ; i < n ; i++) {
            height[i] = userInput.nextInt();
            if (height[i] < 1 || height[i] > 100) { userInput.close(); return; }
        }
        System.out.println(hurdleRace(k, height));
        userInput.close();
    }
    public static int hurdleRace(int k, int[] height) {
        Arrays.sort(height);
        if ((height[height.length-1] - k) < 0) {
            return 0;
        }else {
            return (height[height.length-1] - k);
        }
    }
}