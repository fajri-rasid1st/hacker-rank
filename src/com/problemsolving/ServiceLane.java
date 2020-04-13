package com.problemsolving;

import java.util.ArrayList;
import java.util.Scanner;

public class ServiceLane {
    protected static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt();
        int t = sc.nextInt();

        ArrayList<Integer> arr = new ArrayList<Integer>(n);

        for (int i = 0; i < n; i++) {
            arr.add(sc.nextInt());
        }
        ServiceLane sl = new ServiceLane();
        for (int result : sl.getSmallestLane(arr, t)) {
            System.out.println(result);
        }

        sc.close();
    }

    private int[] getSmallestLane(ArrayList<Integer> arr, int t) {
        int[] total = new int[t];
        for (int j = 0; j < t; j++) {
            ArrayList<Integer> subCase = new ArrayList<>();
            for (int k = 0; k < 2; k++) {
                subCase.add(sc.nextInt());
            }
            int min = 3;
            for (int l = subCase.get(0); l <= subCase.get(1); l++) {
                if (arr.get(l) < min) {
                    min = arr.get(l);
                }
            }
            total[j] = min;
        }
        return total;
    }
}