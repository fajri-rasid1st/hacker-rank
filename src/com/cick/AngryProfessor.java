package com.cick;

public class AngryProfessor {

    static java.util.Scanner userInput = new java.util.Scanner(System.in);

    public static void main(String[] args) {
        int t = userInput.nextInt();
        if (t < 1 || t > 10) {
            userInput.close();
            return;
        }
        System.out.print(angryProfessor(t));
    }

    static String angryProfessor(int t) {
        String result = "";
        for (int i = 0; i < t; i++) {
            int n = userInput.nextInt();
            if (n < 1 || n > 1000) {
                userInput.close();
                return null;
            }
            int k = userInput.nextInt();
            if (k < 1 || k > n) {
                userInput.close();
                return null;
            }
            int[] a = new int[n];
            int studentsAttendance = 0;
            for (int j = 0; j < n; j++) {
                a[j] = userInput.nextInt();
                if (a[j] <= 0) {
                    studentsAttendance++;
                }
            }
            if (studentsAttendance >= k) {
                result += "NO\n";
            } else {
                result += "YES\n";
            }
        }
        return result;
    }
}