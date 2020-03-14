package com.cick;

import java.util.Scanner;

public class UriOnline1 {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        float input = userInput.nextFloat();

        int totalMoney = (int) input / 100;
        System.out.println("NOTAS:");
        System.out.println(totalMoney + " nota(s) de R$ 100.00");
        int remnant = (int) input - (100 * totalMoney);

        totalMoney = remnant / 50;
        System.out.println(totalMoney + " nota(s) de R$ 50.00");
        remnant = remnant - (50 * totalMoney);

        totalMoney = remnant / 20;
        System.out.println(totalMoney + " nota(s) de R$ 20.00");
        remnant = remnant - (20 * totalMoney);

        totalMoney = remnant / 10;
        System.out.println(totalMoney + " nota(s) de R$ 10.00");
        remnant = remnant - (10 * totalMoney);

        totalMoney = remnant / 5;
        System.out.println(totalMoney + " nota(s) de R$ 5.00");
        remnant = remnant - (5 * totalMoney);
        totalMoney = remnant / 2;
        System.out.println(totalMoney + " nota(s) de R$ 2.00");
        remnant = remnant - (2 * totalMoney);

        float remnant2 = ((input + remnant) - (int) input);
        System.out.println("MOEDAS:");
        float totalMoney2 = remnant2 / (float) 1.00;
        System.out.println((int) totalMoney2 + " moeda (s) de R$ 1.00");
        float remnant3 = remnant2 - ((float) 1.00 * (int) totalMoney2);

        totalMoney2 = remnant3 / (float) 0.50;
        System.out.println((int) totalMoney2 + " moeda (s) de R$ 0.50");
        remnant3 = remnant3 - ((float) 0.50 * (int) totalMoney2);

        totalMoney2 = remnant3 / (float) 0.25;
        System.out.println((int) totalMoney2 + " moeda (s) de R$ 0.25");
        remnant3 = remnant3 - ((float) 0.25 * (int) totalMoney2);

        totalMoney2 = remnant3 / (float) 0.10;
        System.out.println((int) totalMoney2 + " moeda (s) de R$ 0.10");
        remnant3 = remnant3 - ((float) 0.10 * (int) totalMoney2);

        totalMoney2 = remnant3 / (float) 0.05;
        System.out.println((int) totalMoney2 + " moeda (s) de R$ 0.05");
        remnant3 = remnant3 - ((float) 0.05 * (int) totalMoney2);

        totalMoney2 = remnant3 / (float) 0.01;
        System.out.printf("%.0f moeda (s) de R$ 0.01\n", totalMoney2);

        userInput.close();

    }
}