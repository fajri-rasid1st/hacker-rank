package com.problemsolving;

import java.util.Scanner;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TimeConversion {
    static Scanner userInput = new Scanner(System.in);

    public static void main(String[] args) throws Exception {
        String s = userInput.next();
        String time = "";
        String nightOrNoon = "";
        char[] arr = s.toCharArray();
        for (int i = 0; i < s.length(); i++) {
            if (i >= 0 && i < s.length() - 2) {
                time += arr[i];
            } else {
                nightOrNoon += arr[i];
            }
        }
        SimpleDateFormat displayFormat = new SimpleDateFormat("HH:mm:ss");
        SimpleDateFormat parseFormat = new SimpleDateFormat("hh:mm:ss a");
        Date date = parseFormat.parse(time + " " + nightOrNoon);
        System.out.println(displayFormat.format(date));
        userInput.close();
    }
}