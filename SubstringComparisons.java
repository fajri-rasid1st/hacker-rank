package com.cick;

public class SubstringComparisons {
    public static String getSmallestAndLargest(String s, int k) {

        java.util.SortedSet<String> sets = new java.util.TreeSet<String>();

        String smallest = "";
        String largest = "";

        for (int i = 0; i <= s.length() - k; i++) {
            sets.add(s.substring(i, i + k));
        }

        smallest += sets.first();
        largest += sets.last();

        return smallest + "\n" + largest;

    }

    public static void main(String[] args) {

        java.util.Scanner scan = new java.util.Scanner(System.in);

        String s = scan.next();
        int k = scan.nextInt();
        System.out.println(getSmallestAndLargest(s, k));
        scan.close();

    }
}