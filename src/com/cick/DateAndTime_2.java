package com.cick;

import java.util.Date;
import java.util.Locale;
import java.util.Scanner;
import java.text.*;

public class DateAndTime_2 {
    // Date and time
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        int month = userInput.nextInt();
        int day = userInput.nextInt();
        int year = userInput.nextInt();

        String theDay = findDay(month, day, year).toUpperCase();
        System.out.print(theDay);

        userInput.close();
    }

    static String findDay(int month, int day, int year) {
        Date date = null;
        String dateOfDay = String.format("%d-%d-%d", year, month, day);
        try {
            date = new SimpleDateFormat("yyyy-M-d").parse(dateOfDay);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return new SimpleDateFormat("EEEE", Locale.ENGLISH).format(date);
    }
}