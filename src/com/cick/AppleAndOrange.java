package com.cick;

import java.util.Scanner;

public class AppleAndOrange {
    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);

        int s = userInput.nextInt();    //start point of sam's house
        int t = userInput.nextInt();    //end point of sam's house
        int a = userInput.nextInt();    //location of the apples tree
        int b = userInput.nextInt();    //location of the orange tree

        int totalApples = 0;
        int totalOrange = 0;

        int m = userInput.nextInt();    //sum of apple
        int n = userInput.nextInt();    //sum of orange

        int [] apples = new int[m];     //apples are thrown
        for (int i = 0 ; i < m ; i++) {
            apples[i] = userInput.nextInt();
            if (a + apples[i] >= s && a + apples[i] <= t) {
                totalApples++;
            }
        }
        int [] oranges = new int[n];    //oranges are thrown
        for(int j = 0 ; j < n ; j++) {
            oranges[j] = userInput.nextInt();
            if (b + oranges[j] <= t && b + oranges[j] >= s) {
                totalOrange++;
            }
        }
        System.out.println(totalApples+"\n"+totalOrange);

        userInput.close();
    }
}