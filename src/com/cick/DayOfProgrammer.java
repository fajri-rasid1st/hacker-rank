package com.cick;

public class DayOfProgrammer {
    public static void main(String[] args) {

        java.util.Scanner userInput = new java.util.Scanner(System.in);

        int y = userInput.nextInt();
        if (y < 1700 || y > 2700) {
            userInput.close();
            return;
        }
        dayOfProgrammer(y);
        userInput.close();
    }

    static void dayOfProgrammer(int year) {

        if (year >= 1919) {
            if (year % 400 == 0) {
                System.out.println("12.09." + year);
            } else if (year % 400 != 0) {
                if (year % 100 == 0) {
                    System.out.println("13.09." + year);
                } else {
                    if (year % 4 == 0) {
                        System.out.println("12.09." + year);
                    } else {
                        System.out.println("13.09." + year);
                    }
                }
            }
        } else if (year <= 1917) {
            if (year % 4 == 0) {
                System.out.println("12.09." + year);
            } else {
                System.out.println("13.09." + year);
            }
        } else {
            System.out.println("26.09.1918");
        }
    }
}