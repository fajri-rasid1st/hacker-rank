package com.problemsolving;

public class JumpingOnCloud {
    public static void main(String[] args) {
        java.util.Scanner userInput = new java.util.Scanner(System.in);

        int n = userInput.nextInt();
        int k = userInput.nextInt();

        int[] c = new int[n * k + 1];
        for (int i = 0; i < n; i++) {
            c[i] = userInput.nextInt();
        }

        int i = 0;
        c[0] += 2;
        for (int j = n; j < c.length; j++) {
            c[j] = c[i];
            i++;
            if (i == n) {
                i = 0;
            }
        }

        JumpingOnCloud jco = new JumpingOnCloud();
        System.out.println(jco.jumpingCloud(c, k, n));
        userInput.close();
    }

    private int jumpingCloud(int[] clouds, int divisor, int number) {
        int energy = 100;
        for (int i = divisor; i < clouds.length; i += divisor) {
            energy--;
            if (clouds[i] == 1) {
                energy -= 2;
            }
            if (clouds[i] == clouds[0]) {
                if (clouds[i] - 1 == 1) {
                    break;
                } else {
                    energy -= 2;
                    break;
                }
            }
        }
        return energy;
    }
}