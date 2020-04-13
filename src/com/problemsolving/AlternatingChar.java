package com.problemsolving;

import java.util.Scanner;

public class AlternatingChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int q = Integer.parseInt(sc.next());
        sc.nextLine();
        while (q > 0) {

            String s = sc.next();
            int count = 0;

            for (int i = 0; i < s.length() - 1; i++) {
                if (s.charAt(i) == s.charAt(i + 1)) {
                    count++;
                }
            }
            System.out.println(count);
            q--;
        }
        sc.close();
    }
}