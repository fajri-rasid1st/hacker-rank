package com.cick;

import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;

public class JavaList {
    public static void main(String[] args) {
        java.util.Scanner userInput = new java.util.Scanner(System.in);

        int n = userInput.nextInt();
        List<Integer> l = new ArrayList<>(n);
        for (int i = 0; i < n; i++) {
            l.add(userInput.nextInt());
        }
        int query = userInput.nextInt();
        while (query > 0) {
            String cases = userInput.next();
            try {
                switch (cases) {
                    case "Insert":
                        int idx = userInput.nextInt();
                        int number = userInput.nextInt();
                        l.add(idx, number);
                        break;
                    case "Delete":
                        int idx_2 = userInput.nextInt();
                        l.remove(idx_2);
                        break;
                }
            } catch (IndexOutOfBoundsException ioobe) {
                ioobe.printStackTrace();
            }
            query--;
        }
        Iterator<Integer> result = l.iterator();
        while (result.hasNext()) {
            System.out.print(result.next() + " ");
        }

        userInput.close();
    }
}