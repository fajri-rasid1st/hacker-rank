package com.problemsolving;

import java.util.ArrayList;
import java.util.Scanner;

class Equalize {
    public int getEqualArray(ArrayList<Integer> arr) {
        int deleteElement = 0;
        for (int i = 0; i < arr.size(); i++) {
            int x = 0;
            for (int j = i; j < arr.size(); j++) {
                if (arr.get(i) == arr.get(j)) {
                    x++;
                }
            }
            if (x > deleteElement) {
                deleteElement = x;
            }
        }
        return deleteElement;
    }
}

public class EqualizeTheArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());
        ArrayList<Integer> arr = new ArrayList<Integer>(n);
        for (int i = 0; i < n; i++) {
            arr.add(sc.nextInt());
        }

        Equalize e = new Equalize();
        int result = e.getEqualArray(arr);
        System.out.println(arr.size() - result);

        sc.close();
    }
}