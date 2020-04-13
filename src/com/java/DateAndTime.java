package com.java;

import java.time.LocalDate;
import java.util.Scanner;

public class DateAndTime {
    // Date and time
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int month = in.nextInt();
        int day = in.nextInt();
        int year = in.nextInt();

        in.close();

        System.out.print(findDay(month, day, year));
    }

    public static String findDay(int month, int day, int year) {
        LocalDate dt = LocalDate.of(year, month, day);
        return dt.getDayOfWeek().toString();
    }
}