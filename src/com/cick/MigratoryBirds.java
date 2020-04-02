package com.cick;

import java.util.Scanner;

public class MigratoryBirds {

    static Scanner userInput = new Scanner(System.in);

    public static void main(String[] args) {

        int n = userInput.nextInt();
        int[] arr = new int[n];

        if (n < 5 || n > 2 * (Math.pow((double) 10, (double) 5))) {
            userInput.close();
            return;
        }

        int result = migrationBird(n, arr);
        System.out.println(result);

        userInput.close();
    }

    static int migrationBird(int n, int[] arr) {
        int[] m = new int[5];
        for (int i = 0; i < arr.length; i++) {
            switch (userInput.nextInt()) {
                case 1:
                    m[0]++;
                    break;
                case 2:
                    m[1]++;
                    break;
                case 3:
                    m[2]++;
                    break;
                case 4:
                    m[3]++;
                    break;
                case 5:
                    m[4]++;
                    break;
            }
        }
        int highestNumber = 0;
        int theSpeciesIs = 0;
        for (int i = 0; i < m.length; i++) {
            if (m[i] > highestNumber) {
                highestNumber = m[i];
                theSpeciesIs = i + 1;
            }
        }
        return theSpeciesIs;
    }
}