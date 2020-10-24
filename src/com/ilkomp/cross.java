package com.ilkomp;

public class cross {
    public static void main(String[] args) {
        int arr[] = { 0, 3, 2, 1 };
        int cross = 0;

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    System.out.printf("%d------%d\n", arr[i], arr[j]);
                    cross++;
                }
            }
        }
        System.out.println(cross);
    }
}
