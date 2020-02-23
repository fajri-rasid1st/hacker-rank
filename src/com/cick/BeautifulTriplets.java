package com.cick;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BeautifulTriplets {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int n = sc.nextInt(), d = sc.nextInt();
        List<Integer> arr = new ArrayList<Integer>(n);

        for (int i = 0 ; i < n ; i++) {
            arr.add(sc.nextInt());
        }
        TheTriplets tt = new TheTriplets();
        tt.getTriplet(d, arr);
        sc.close();
    }
}
class TheTriplets {
    public void getTriplet(int d, List<Integer> arr) {
        int totalTriplet = 0;
        int idx = 0;
        int looper = arr.size();
        while (looper > 0) {
            int j = idx;
            int k = idx;
            int total = 0;
            while (total < 2) {
                if (j == arr.size()-1) {
                    break;
                }
                if (arr.get(j+1) - arr.get(k) == d) {
                    total++;
                    k = j + 1;
                }
                j++;
            }
            if (total == 2) {
                totalTriplet++;
            }
            idx++;
            looper--;
        }
        System.out.println(totalTriplet);
    }
}