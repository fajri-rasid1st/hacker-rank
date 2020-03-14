package com.cick;

public class BonAppetit {
    public static void main(String[] args) {

        java.util.Scanner userInput = new java.util.Scanner(System.in);

        int n = userInput.nextInt();
        int k = userInput.nextInt();
        int[] bill = new int[n];

        if (n < 2 || n > Math.pow((double) 10, (double) 5)) {
            userInput.close();
            return;
        }
        if (k < 0 || k >= n) {
            userInput.close();
            return;
        }
        for (int i = 0; i < n; i++) {
            bill[i] = userInput.nextInt();
            if (bill[i] < 0 || bill[i] > Math.pow((double) 10, (double) 4)) {
                userInput.close();
                return;
            }
        }
        int b = userInput.nextInt();
        bonAppetit(n, k, bill, b);
        userInput.close();
    }

    public static void bonAppetit(int n, int k, int[] bill, int b) {
        bill[k] = 0;
        int costPerPerson = 0;
        int total = 0;
        for (int i = 0; i < bill.length; i++) {
            costPerPerson += bill[i];
        }
        total = (b - (costPerPerson / 2));
        if (total != 0) {
            System.out.printf("%.0f", Math.abs((double) total));
        } else {
            System.out.println("Bon Appetit");
        }
    }
}