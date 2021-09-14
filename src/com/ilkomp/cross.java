package com.ilkomp;

public class Cross {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);

        int arr[] = new int[sc.nextInt()];
        int cross = 0;

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    System.out.printf("%d -------- %d\n", arr[i], arr[j]);
                    cross++;
                }
            }
        }

        System.out.println(cross);

        sc.close();
    }
}
