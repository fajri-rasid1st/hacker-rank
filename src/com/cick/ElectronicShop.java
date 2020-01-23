package com.cick;

import java.util.Scanner;

public class ElectronicShop {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        int b = userInput.nextInt(), n = userInput.nextInt(), m = userInput.nextInt();
        int[] keyboards = new int [n];
        int[] drivers = new int [m];

        if (b < 1 || b > Math.pow((double) 10, (double) 6)) { userInput.close(); return; }
        if (n > 1000 || n < 1 || m > 1000 || m < 1) { userInput.close(); return; }
        for (int i = 0 ; i < n ; i++) {
            keyboards[i] = userInput.nextInt();
            if (keyboards[i] < 1 || keyboards[i] > Math.pow((double) 10, (double) 6)) { userInput.close(); return; }
        }
        for (int i = 0 ; i < m ; i++) {
            drivers[i] = userInput.nextInt();
            if (drivers[i] < 1 || drivers[i] > Math.pow((double) 10, (double) 6)) { userInput.close(); return; }
        }
        System.out.println(getMoneySpent(b, keyboards, drivers));
        userInput.close();
    }
    static int getMoneySpent(int b, int[] keyboards, int[] drivers) {
        int price = 0;
        for (int i = 0 ; i < keyboards.length ; i++) {
            for (int j = 0 ; j < drivers.length ; j++) {
                if (keyboards[i] + drivers[j] > price && keyboards[i] + drivers[j] <= b) {
                    price = keyboards[i] + drivers[j];
                }
            }
        }
        if (price <= b && price != 0) {
            return price;
        }else {
            return -1;
        }
    }
}