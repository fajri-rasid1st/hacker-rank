package com.java;

import java.util.ArrayList;
import java.util.Scanner;

public class JavaArrayList {
    static Scanner userInput = new Scanner(System.in);

    public static void main(String[] args) {
        int n = Integer.parseInt(userInput.nextLine());
        ArrayList<ArrayList<Integer>> number = new ArrayList<ArrayList<Integer>>(n);

        for (int i = 0; i < n; i++) {
            int d = userInput.nextInt();
            ArrayList<Integer> subNumber = new ArrayList<Integer>(d);
            for (int j = 0; j < d; j++) {
                subNumber.add(userInput.nextInt());
            }
            number.add(subNumber);
        }
        JavaArrayList jal = new JavaArrayList();
        jal.getIndexArraylist(number);
        userInput.close();
    }

    public void getIndexArraylist(ArrayList<ArrayList<Integer>> number) {
        int q = userInput.nextInt();
        for (int i = 0; i < q; i++) {
            int x = userInput.nextInt();
            int y = userInput.nextInt();
            try {
                System.out.println(number.get(x - 1).get(y - 1));
            } catch (IndexOutOfBoundsException iobe) {
                System.out.println("ERROR!");
            }
        }
        userInput.close();
    }
}