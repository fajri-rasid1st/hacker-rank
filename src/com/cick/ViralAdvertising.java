package com.cick;

import java.util.Scanner;

public class ViralAdvertising {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        int n = userInput.nextInt();
        if (n < 1 || n > 50) { userInput.close(); return; }
        System.out.print(viralAds(n));
        userInput.close();
    }
    static int viralAds(int days) {
        int totalLikes = 0;
        int people = 5;
        for (int i = 0 ; i < days ; i++) {
            totalLikes += (people/2);
            people = (people/2) * 3;
        }
        return totalLikes;
    }
}